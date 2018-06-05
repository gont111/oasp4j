package io.oasp.gastronomy.restaurant.offermanagement.batch.impl.productimport;

import java.time.DayOfWeek;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import io.oasp.gastronomy.restaurant.SpringBootApp;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.SpecialEntity;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.WeeklyPeriodEmbeddable;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.dao.SpecialDao;
import io.oasp.module.test.common.base.ComponentTest;

/**
 * @author DGONTARE
 *
 */

@Transactional
@SpringBootTest(classes = { SpringBootApp.class }, webEnvironment = WebEnvironment.RANDOM_PORT)
public class SpecialManagementTest extends ComponentTest {

  // @Inject
  // private Offermanagement offerManagement;

  @Inject
  private SpecialDao specialDao;

  @PersistenceContext
  private EntityManager entityManager;

  @Test
  public void testInsertSpecial() {

    SpecialEntity special = new SpecialEntity();
    WeeklyPeriodEmbeddable activePeriod = new WeeklyPeriodEmbeddable();
    activePeriod.setStartingDay(DayOfWeek.MONDAY);
    activePeriod.setEndingDay(DayOfWeek.FRIDAY);
    activePeriod.setStartingHour(12);
    activePeriod.setEndingHour(16);

    special.setName("special 1");
    special.setOfferId(1L);
    special.setActivePeriod(activePeriod);

    SpecialEntity result = this.specialDao.save(special);
    assertThat(result.getId()).isNotNull();

  }
}

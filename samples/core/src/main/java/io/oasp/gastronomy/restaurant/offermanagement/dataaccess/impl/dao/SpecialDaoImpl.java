package io.oasp.gastronomy.restaurant.offermanagement.dataaccess.impl.dao;

import static com.querydsl.core.alias.Alias.$;

import java.time.LocalDateTime;

import javax.inject.Named;

import com.querydsl.core.alias.Alias;
import com.querydsl.core.types.dsl.EntityPathBase;
import com.querydsl.jpa.impl.JPAQuery;

import io.oasp.gastronomy.restaurant.general.dataaccess.base.dao.ApplicationMasterDataDaoImpl;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.SpecialEntity;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.dao.SpecialDao;
import io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.SpecialsSearchCriteriaTo;
import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * @author DGONTARE
 *
 */
@Named
public class SpecialDaoImpl extends ApplicationMasterDataDaoImpl<SpecialEntity> implements SpecialDao {

  @Override
  public PaginatedListTo<SpecialEntity> findSpecials(SpecialsSearchCriteriaTo criteria) {

    SpecialEntity special = Alias.alias(SpecialEntity.class);
    EntityPathBase<SpecialEntity> alias = $(special);
    JPAQuery<SpecialEntity> query = new JPAQuery<SpecialEntity>(getEntityManager()).from(alias);

    Long number = criteria.getOfferNumber();
    if (number != null) {
      query.where($(special.getOffer().getNumber()).eq(number));
    }

    String name = criteria.getName();
    if (name != null) {
      query.where($(special.getName().contains(name)));
    }

    LocalDateTime searchTime = criteria.getSearchTime();
    if (searchTime != null) {
      int dayOfWeek = searchTime.getDayOfWeek().getValue();
      int hour = searchTime.getHour();

      query.where($(special.getActivePeriod().getStartingDay().getValue() < dayOfWeek));
      query.where($(special.getActivePeriod().getStartingHour() < hour));

      query.where($(special.getActivePeriod().getEndingDay().getValue() > dayOfWeek));
      query.where($(special.getActivePeriod().getEndingHour() > hour));
    }

    return findPaginated(criteria, query);
  }

  @Override
  protected Class<SpecialEntity> getEntityClass() {

    return SpecialEntity.class;
  }

}

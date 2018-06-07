package io.oasp.gastronomy.restaurant.offermanagement.service.impl.rest;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import io.oasp.gastronomy.restaurant.general.common.base.AbstractRestServiceTest;
import io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.SpecialEto;
import io.oasp.gastronomy.restaurant.offermanagement.service.api.rest.OffermanagementRestService;
import io.oasp.gastronomy.restaurant.suppliermanagement.service.api.rest.SuppliermanagementRestService;
import io.oasp.module.service.common.api.client.ServiceClientFactory;

/**
 * @author DGONTARE
 *
 */
@RunWith(SpringRunner.class)
public class OffermanagementRestServiceTest extends AbstractRestServiceTest {

  private OffermanagementRestService service;

  private SuppliermanagementRestService service1;

  @Inject
  private ServiceClientFactory serviceClientFactory;

  @Override
  public void doSetUp() {

    super.doSetUp();
    // getDbTestHelper().resetDatabase();
    // this.service = this.serviceClientFactory.create(SalesmanagementRestService.class);
  }

  /**
   * Provides clean up after tests.
   */
  @Override
  public void doTearDown() {

    // this.service = null;
    super.doTearDown();
  }

  @Test
  public void findSpecial() {

    Long id = 3L;

    this.service = this.serviceClientFactory.create(OffermanagementRestService.class);

    // this.service1 = this.serviceClientFactory.create(SuppliermanagementRestService.class);

    SpecialEto special = this.service.getSpecial(id);
    assertThat(special).isNotNull();

    // SupplierEto supplier = this.service1.getSupplier(id);
    //
    // assertThat(supplier).isNotNull();
    // assertThat(supplier.getName()).isEqualTo("Albafrost");

    // // given
    // OrderCto sampleOrderCto = this.helper.createSampleOrderCto(SAMPLE_TABLE_ID);
    // OrderCto responseOrderCto = this.service.saveOrder(sampleOrderCto);
    // assertThat(responseOrderCto).isNotNull();
    //
    // // when
    // OrderEto responseOrderEto = this.service.findOrder(responseOrderCto.getOrder().getId());
    //
    // // then
    // assertThat(responseOrderEto).isNotNull();
    // assertThat(responseOrderEto.getId()).isEqualTo(responseOrderCto.getOrder().getId());
    // assertThat(responseOrderEto.getTableId()).isEqualTo(SAMPLE_TABLE_ID);
  }

}

package io.oasp.gastronomy.restaurant.offermanagement.logic.api.to;

import io.oasp.gastronomy.restaurant.general.common.api.datatype.Money;
import io.oasp.gastronomy.restaurant.offermanagement.common.api.Special;
import io.oasp.module.basic.common.api.to.AbstractEto;

/**
 * @author DGONTARE
 *
 */
public class SpecialEto extends AbstractEto implements Special {

  /**
   * @return activePeriod
   */
  public WeeklyPeriodEto getActivePeriod() {

    return this.activePeriod;
  }

  /**
   * @param activePeriod new value of {@link #getactivePeriod}.
   */
  public void setActivePeriod(WeeklyPeriodEto activePeriod) {

    this.activePeriod = activePeriod;
  }

  private static final long serialVersionUID = 1L;

  private String name;

  private WeeklyPeriodEto activePeriod;

  private Money specialPrice;

  private Long offerId;

  /**
   * @return name
   */
  public String getName() {

    return this.name;
  }

  /**
   * @param name new value of {@link #getname}.
   */
  public void setName(String name) {

    this.name = name;
  }

  /**
   * @return specialPrice
   */
  public Money getSpecialPrice() {

    return this.specialPrice;
  }

  /**
   * @param specialPrice new value of {@link #getspecialPrice}.
   */
  public void setSpecialPrice(Money specialPrice) {

    this.specialPrice = specialPrice;
  }

  public Long getOfferId() {

    return this.offerId;
  }

  public void setOfferId(Long offerId) {

    this.offerId = offerId;
  }

}

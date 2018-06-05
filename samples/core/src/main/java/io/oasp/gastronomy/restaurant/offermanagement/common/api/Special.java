package io.oasp.gastronomy.restaurant.offermanagement.common.api;

import io.oasp.gastronomy.restaurant.general.common.api.ApplicationEntity;
import io.oasp.gastronomy.restaurant.general.common.api.datatype.Money;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.OfferEntity;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.WeeklyPeriodEmbeddable;

/**
 * @author DGONTARE
 *
 */
public interface Special extends ApplicationEntity {

  /**
   * @return name
   */
  String getName();

  /**
   * @param name new value of {@link #getname}.
   */
  void setName(String name);

  /**
   * @return offer
   */
  OfferEntity getOffer();

  /**
   * @param offer new value of {@link #getoffer}.
   */
  void setOffer(OfferEntity offer);

  Long getOfferId();

  /**
   * @param offerId is the new {@link #getOfferId() offerId}.
   */
  void setOfferId(Long mealId);

  /**
   * @return activePeriod
   */
  WeeklyPeriodEmbeddable getActivePeriod();

  /**
   * @param activePeriod new value of {@link #getactivePeriod}.
   */
  void setActivePeriod(WeeklyPeriodEmbeddable activePeriod);

  /**
   * @return specialPrice
   */
  Money getSpecialPrice();

  /**
   * @param specialPrice new value of {@link #getspecialPrice}.
   */
  void setSpecialPrice(Money specialPrice);

}
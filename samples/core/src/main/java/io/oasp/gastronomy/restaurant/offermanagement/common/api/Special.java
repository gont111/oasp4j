package io.oasp.gastronomy.restaurant.offermanagement.common.api;

import io.oasp.gastronomy.restaurant.general.common.api.ApplicationEntity;

public interface Special extends ApplicationEntity {

  Long getOfferId();

  void setOfferId(Long offerId);

}

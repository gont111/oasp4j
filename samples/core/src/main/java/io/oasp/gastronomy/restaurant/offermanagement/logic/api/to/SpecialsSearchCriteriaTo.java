package io.oasp.gastronomy.restaurant.offermanagement.logic.api.to;

import java.time.LocalDateTime;

import io.oasp.module.jpa.common.api.to.SearchCriteriaTo;

/**
 * @author DGONTARE
 *
 */
public class SpecialsSearchCriteriaTo extends SearchCriteriaTo {

  /**
   * @return searchTime
   */
  public LocalDateTime getSearchTime() {

    return this.searchTime;
  }

  /**
   * @param searchTime new value of {@link #getsearchTime}.
   */
  public void setSearchTime(LocalDateTime searchTime) {

    this.searchTime = searchTime;
  }

  /** UID for serialization. */
  private static final long serialVersionUID = 1L;

  private String name;

  private Long offerNumber;

  private LocalDateTime searchTime;

  public Long getOfferNumber() {

    return this.offerNumber;
  }

  public void setOfferNumber(Long offerNumber) {

    this.offerNumber = offerNumber;
  }

  public String getName() {

    return this.name;
  }

  public void setName(String name) {

    this.name = name;
  }

  /**
   * The constructor.
   */
  public SpecialsSearchCriteriaTo() {

    super();
  }

}

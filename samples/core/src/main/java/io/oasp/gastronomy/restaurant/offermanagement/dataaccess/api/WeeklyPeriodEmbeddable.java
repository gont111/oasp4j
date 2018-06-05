package io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api;

import java.time.DayOfWeek;

import javax.persistence.Embeddable;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import io.oasp.gastronomy.restaurant.offermanagement.common.api.WeeklyPeriod;

/**
 * @author DGONTARE
 *
 */
@Embeddable
public class WeeklyPeriodEmbeddable implements WeeklyPeriod {

  private DayOfWeek startingDay;

  private int startingHour;

  /**
   * @return startingHour
   */
  @Override
  public int getStartingHour() {

    return this.startingHour;
  }

  /**
   * @param startingHour new value of {@link #getstartingHour}.
   */
  @Override
  @Max(24)
  @Min(0)
  public void setStartingHour(int startingHour) {

    this.startingHour = startingHour;
  }

  private DayOfWeek endingDay;

  private int endingHour;

  /**
   * @return endingHour
   */
  @Override
  public int getEndingHour() {

    return this.endingHour;
  }

  /**
   * @param endingHour new value of {@link #getendingHour}.
   */
  @Override
  @Max(24)
  @Min(0)
  public void setEndingHour(int endingHour) {

    this.endingHour = endingHour;
  }

  /**
   * @return startingDay
   */
  @Override
  public DayOfWeek getStartingDay() {

    return this.startingDay;
  }

  /**
   * @param startingDay new value of {@link #getstartingDay}.
   */
  @Override
  public void setStartingDay(DayOfWeek startingDay) {

    this.startingDay = startingDay;
  }

  @Override
  public DayOfWeek getEndingDay() {

    return this.endingDay;
  }

  @Override
  public void setEndingDay(DayOfWeek endingDay) {

    this.endingDay = endingDay;
  }

}

package io.oasp.gastronomy.restaurant.offermanagement.common.api;

import java.time.DayOfWeek;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * @author DGONTARE
 *
 */
public interface WeeklyPeriod {

  /**
   * @return startingHour
   */
  int getStartingHour();

  /**
   * @param startingHour new value of {@link #getstartingHour}.
   */
  void setStartingHour(int startingHour);

  /**
   * @return endingHour
   */
  int getEndingHour();

  /**
   * @param endingHour new value of {@link #getendingHour}.
   */
  void setEndingHour(int endingHour);

  /**
   * @return startingDay
   */
  DayOfWeek getStartingDay();

  /**
   * @param startingDay new value of {@link #getstartingDay}.
   */
  void setStartingDay(DayOfWeek startingDay);

  DayOfWeek getEndingDay();

  void setEndingDay(DayOfWeek endingDay);

}
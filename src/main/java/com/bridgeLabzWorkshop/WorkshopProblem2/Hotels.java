package com.bridgeLabzWorkshop.WorkshopProblem2;
/**
 * A hotel class consisting of name of the hotel,different rates and ratings.
 * The class uses getter and setter functions to get the hotel Name and rates for a customer as well as for the ratings of the hotel.
 * @param hotelName gives names of the hotel.
 * @param weekdayRateForRegularCustomer gives rates for a regular customer for a hotel during weekdays.
 * @param weekendRateForRegularCustomer gives rates for a regular customer for a hotel during weekends.
 * @param hotelRatings gives the ratings for each hotel.
 * @param weekendRateForRewardCustomer gives rates for a reward customer for a hotel during weekends.
 * @param weekdayRateForRewardCustomer gives rates for a reward customer for a hotel during weekdays.
 * @author Sanjana Rao
 * @since 22-09-2021
 */
public class Hotels 
{
	 private String hotelName;
	 private double weekdayRateForRegularCustomer;
	 private double weekendRateForRegularCustomer;
	 private int hotelRatings;
	 private double weekendRateForRewardCustomer;
	 private double weekdayRateForRewardCustomer;
	 
	 public Hotels(String hotelName,double weekdayRateForRegularCustomer,double weekendRateForRegularCustomer, int hotelRatings, double weekdayRateForRewardCustomer, double weekendRateForRewardCustomer)
	 {
	    this.setHotelName(hotelName);
	    this.setWeekdayRateForRegularCustomer(weekdayRateForRegularCustomer);
	    this.setWeekendRateForRegularCustomer(weekendRateForRegularCustomer);
	    this.setHotelRatings(hotelRatings);
	    this.setWeekdayRateForRewardCustomer(weekdayRateForRewardCustomer);
	    this.setWeekendRateForRewardCustomer(weekendRateForRewardCustomer);
	 }

	public String getHotelName() 
	 {
	    return hotelName;
	 }
	 
	 public void setHotelName(String hotelName)
	 {
	    this.hotelName = hotelName;
	 }
	 
	 public int getRatings()
	 {
	    return hotelRatings;
	 }
	 
	 public void setHotelRatings(int hotelRatings) 
	 {
	    this.hotelRatings = hotelRatings;
	 }
	 
	 public double getWeekdayRateForRegularCustomer() 
	 {
	    return weekdayRateForRegularCustomer;
	 }
	 
	 public void setWeekdayRateForRegularCustomer(double weekdayRateForRegularCustomer)
	 {
	    this.weekdayRateForRegularCustomer = weekdayRateForRegularCustomer;
	 }
	   
	 public double getWeekendRateForRegularCustomer()
	 {
	    return weekendRateForRegularCustomer;
	 }

	 public void setWeekendRateForRegularCustomer(double weekendRateForRegularCustomer)
	 {
	        this.weekendRateForRegularCustomer = weekendRateForRegularCustomer;
	 }	
	 
	 public double getWeekendRateForRewardCustomer()
	 {
	    return weekendRateForRewardCustomer;
	 }
	 
	 private void setWeekendRateForRewardCustomer(double weekendRateForRewardCustomer) 
	 {
		this.weekendRateForRewardCustomer = weekendRateForRewardCustomer;
	 }
	 
	 public double getWeekdayRateForRewardCustomer()
	 {
	    return weekdayRateForRewardCustomer;
	 }

	private void setWeekdayRateForRewardCustomer(double weekdayRateForRewardCustomer) 
	{
		this.weekdayRateForRewardCustomer = weekdayRateForRewardCustomer;		
	}
	 
}

package com.bridgeLabzWorkshop.WorkshopProblem2;
/**
 * A hotel class consisting of name of the hotel,different rates and ratings.
 * The class uses getter and setter functions to get the hotel Name and rates for a customer as well as for the ratings of the hotel.
 * @param hotelName gives names of the hotel.
 * @param weekdayRateForRegularCustomer gives rates for a customer for a hotel during weekdays.
 * @param weekendRateForRegularCustomer gives rates for a customer for a hotel during weekends.
 * @param hotelRatings gives the ratings for each hotel.
 * @author Sanjana Rao
 * @since 22-09-2021
 */
public class Hotels 
{
	 private String hotelName;
	 private double weekdayRateForRegularCustomer;
	 private double weekendRateForRegularCustomer;
	 private int hotelRatings;
	 
	 public Hotels(String hotelName,double weekdayRateForRegularCustomer,double weekendRateForRegularCustomer, int hotelRatings)
	 {
	    this.setHotelName(hotelName);
	    this.setWeekdayRate(weekdayRateForRegularCustomer);
	    this.setWeekendRate(weekendRateForRegularCustomer);
	    this.setHotelRatings(hotelRatings);
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
	 
	 public double getWeekdayRate() 
	 {
	    return weekdayRateForRegularCustomer;
	 }
	 
	 public void setWeekdayRate(double weekdayRateForRegularCustomer)
	 {
	    this.weekdayRateForRegularCustomer = weekdayRateForRegularCustomer;
	 }
	    /*
	     * getter method to get rate of regular weekend
	     */
	 public double getWeekendRate()
	 {
	    return weekendRateForRegularCustomer;
	 }
	    /*
	     * setter method to set the rate of regular weekend
	     */
	 public void setWeekendRate(double weekendRateForRegularCustomer)
	 {
	        this.weekendRateForRegularCustomer = weekendRateForRegularCustomer;
	 }	 
	 
}

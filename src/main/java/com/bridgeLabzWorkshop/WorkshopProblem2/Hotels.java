package com.bridgeLabzWorkshop.WorkshopProblem2;
/**
 * A hotel class consisting of name of the hotel,different rates and ratings
 * The class uses getter and setter functions to get the hotel Name and rates for a customer
 * @param hotelName gives names of the hotel
 * @param rateForRegularCustomer gives rates for a customer for a hotel.
 * @author Sanjana Rao
 * @since 22-09-2021
 */
public class Hotels 
{
	 private String hotelName;
	 private double weekdayRateForRegularCustomer;
	 private double weekendRateForRegularCustomer;
	 
	 public Hotels(String hotelName,double weekdayRateForRegularCustomer,double weekendRateForRegularCustomer)
	 {
	    this.setHotelName(hotelName);
	    this.setWeekdayRate(weekdayRateForRegularCustomer);
	    this.setWeekendRate(weekendRateForRegularCustomer);
	 }
	 
	 public String getHotelName() 
	 {
	    return hotelName;
	 }
	 
	 public void setHotelName(String hotelName)
	 {
	    this.hotelName = hotelName;
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

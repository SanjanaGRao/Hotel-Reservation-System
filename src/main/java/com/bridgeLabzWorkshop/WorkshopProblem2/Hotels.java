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
	 private int rateForRegularCustomer;
	 
	 public Hotels(String hotelName,int rateForRegularCustomer)
	 {
	    this.setHotelName(hotelName);
	    this.setRateRegular(rateForRegularCustomer);
	 }
	 
	 public String getHotelName() 
	 {
	    return hotelName;
	 }
	 
	 public void setHotelName(String hotelName)
	 {
	    this.hotelName = hotelName;
	 }
	 
	 public int getRateRegular()
	 {
		 return rateForRegularCustomer;
	 }
	 
	 public void setRateRegular(int rateForRegularCustomer) 
	 {
	    this.rateForRegularCustomer = rateForRegularCustomer;
	 }
}

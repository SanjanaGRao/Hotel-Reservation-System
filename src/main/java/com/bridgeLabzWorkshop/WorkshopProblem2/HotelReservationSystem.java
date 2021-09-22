package com.bridgeLabzWorkshop.WorkshopProblem2;

import java.util.ArrayList;
import java.util.List;
/**
 * Class for Hotel Reservation System
 * @author Sanjana Rao
 * @since 22-09-2021
 */
public class HotelReservationSystem 
{	 
	 private List<Hotels> hotelReservationSystem = new ArrayList<>();
	 
	    /**
	     * method to add hotel to the system
	     * @param hotelName name of the hotel
	     * @param weekdayRateRegular price on a week day for a regular customer
	     * @param weekdayRateReward  price on a week day for a reward customer
	     * @param weekendRateRegular  price on a weekend for a regular customer
	     * @param weekendRateReward  price on a weekend for a reward customer
	     * @param ratings ratings of the hotel
	     * @return true if hotel is added
	     */
	    public Boolean addHotelName(String hotelNames,int weekendRatingForRegCustomer, int weekendRatingForRewCustomer, int weekdayRatingForRegCustomer, int weekdayRatingForRewCustomer, int hotelRatings)
	    {
	        hotelReservationSystem.add(new Hotels(hotelNames,weekendRatingForRegCustomer,weekendRatingForRewCustomer,weekdayRatingForRegCustomer,weekdayRatingForRewCustomer,hotelRatings));
	        return true;
	    }
	    
	    /**
	     * to get the number of hotels in the reservation system
	     * @return number of hotels
	     */
	    public int countHotels() 
	    {
	        return hotelReservationSystem.size();
	    }
}

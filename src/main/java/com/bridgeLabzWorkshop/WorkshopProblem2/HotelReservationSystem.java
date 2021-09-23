package com.bridgeLabzWorkshop.WorkshopProblem2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
/**
 * Class for Hotel Reservation System
 * @author Sanjana Rao
 * @since 22-09-2021
 */
public class HotelReservationSystem 
{	 
	 private List<Hotels> hotelReservationSystem = new ArrayList<>();
	 
	    public HotelReservationSystem()
	    {
	        System.out.println("Welcome to Hotel Reservation System.");
	    }
	    
	    /**
	     * Constructor to add hotel to the system.
	     * @param hotelName is the name of the hotel
	     * @param rateForRegularCustomer is the price for a regular customer
	     */
	    public void addHotel(String hotelName,int rateForRegularCustomer)
	    {
	        hotelReservationSystem.add(new Hotels(hotelName,rateForRegularCustomer));
	    }
	    
	    /**
	     * The method countHotels is to get the number of hotels in the reservation system
	     * @return number of hotels
	     */
	    public int countHotels()
	    {
	        return hotelReservationSystem.size();
	    }
}

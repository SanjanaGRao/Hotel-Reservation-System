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
	    
	    /**
	     * A method to get the hotel whose cost is cheap
	     * @param checkIn date when you checkin the hotel
	     * @param checkOut date when you want to checkout from hotel
	     * @return hotelName
	     */
	    public String cheapHotel(Date checkIn, Date checkOut)
	    {
	        int days = (int)( (checkOut.getTime() - checkIn.getTime()) / (1000 * 60 * 60 * 24));
	        if(days==0)
	            days=1;
	        double cost = hotelReservationSystem.get(0).getRateRegular()*days;
	        String hotelName = hotelReservationSystem.get(0).getHotelName();
	        for(int i=1;i<hotelReservationSystem.size();i++)
	        {
	            if(cost>hotelReservationSystem.get(i).getRateRegular()*days)
	            {
	                cost = hotelReservationSystem.get(i).getRateRegular()*days;
	                hotelName = hotelReservationSystem.get(i).getHotelName();
	            }                    
	        }
	        System.out.println("You can stay at hotel "+hotelName+" and the cost is Rs."+cost);
	        return hotelName;
	    }   
}

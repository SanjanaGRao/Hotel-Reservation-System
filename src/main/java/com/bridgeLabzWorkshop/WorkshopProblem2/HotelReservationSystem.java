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
	    public void addHotel(String hotelName, double weekdayRateForRegularCustomer, double weekendRateForRegularCustomer, int hotelRatings)
	    {
	        hotelReservationSystem.add(new Hotels(hotelName, weekdayRateForRegularCustomer, weekendRateForRegularCustomer, hotelRatings));
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
	     * The method getCost is used to calculate cost of stay for each hotel.
	     * @param hotel is the name of the hotel for which you want to calculate
	     * @return cost at that particular hotel
	     */
	    public double getCost(List<Integer> days,Hotels hotel)
	    {
	        double temp=0;
	        for(int j:days)
	        {
	            if(j>1&&j<7)
	            { 
	                temp+=hotel.getWeekdayRate();
	            }
	            else
	                temp+=hotel.getWeekendRate();  
	        }
	        return temp;
	    }
	    
	    /**
	     * The method getCheapHotel is the method to get the hotel whose cost is cheap.
	     * @param checkIn date is the date you checkin to the hotel.
	     * @param checkOut date date you want to checkout from the hotel.
	     * @param cost is used to view the cost of the stay for customer.
	     * @return hotelName
	     */
	    public String getCheapHotel(Date checkIn, Date checkOut)
	    {
	    	List<Integer> days = new ArrayList<>();
	        Date i = checkIn;
	        while(i.compareTo(checkOut) == -1)
	        {
	            Calendar cal=Calendar.getInstance();
	            cal.setTime(i);
	            days.add(cal.get(Calendar.DAY_OF_WEEK));
	            cal.add( Calendar.DATE, 1 );
	            i = cal.getTime();
	        }
	        double cost;
	        double temp;
	        Hotels cheapHotel = hotelReservationSystem.get(0);
	        cost = getCost(days,cheapHotel);
	        for(Hotels hotel:hotelReservationSystem)
	        {
	            temp=getCost(days,hotel);
	            if(cost>temp)
	            {
	                cost = temp;
	                cheapHotel = hotel;
	            }
	        } 
	        System.out.println("The cheapest hotel available for the given date is "+cheapHotel.getHotelName()+" and the cost of your stay would be $"+cost);
	        return cheapHotel.getHotelName();   
	    }   
	    
	    /**
	     * The method getBestRatedHotel is the method to get best rated hotel and also its cost
	     * @param checkIn the date when you checkin into the hotel
	     * @param checkOut the day when you leave the hotel
	     * @return the name of hotel
	     */
	    public String getBestRatedHotel(Date checkIn,Date checkOut)
	    {
	        List<Integer> days=new ArrayList<>();
	        Date i=checkIn;
	        double  ratings=0;
	        Hotels bestHotel = null;
	        while(i.compareTo(checkOut)<1)
	        {
	            Calendar cal = Calendar.getInstance();
	            cal.setTime(i);
	            days.add(cal.get(Calendar.DAY_OF_WEEK));
	            cal.add( Calendar.DATE, 1 );
	            i = cal.getTime();
	        }
	        for(Hotels hotel:hotelReservationSystem)
	        { 
	            if(ratings<hotel.getRatings())
	            {
	                ratings=hotel.getRatings();
	                bestHotel=hotel;
	            }
	        }
	        System.out.println("The Best Rated Hotel for the given date is "+ bestHotel.getHotelName() +" and the cost is $"+ getCost(days, bestHotel));
	        return bestHotel.getHotelName();
	    }
}

package com.bridgeLabzWorkshop.WorkshopProblem2;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class HotelReservationTest 
{
	 @Test
	    public void CheckIfHotelIsAdded()
	    {
	        HotelReservationSystem hotelSystem=new HotelReservationSystem();
	        hotelSystem.addHotel("Lakewood",110);
	        hotelSystem.addHotel("Ridgewood",220);
	        hotelSystem.addHotel("Bridgewood",160);
	        int entry=hotelSystem.countHotels();
	        Assert.assertEquals(3,entry);
	    }
}

package com.bridgeLabzWorkshop.WorkshopProblem2;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import org.junit.Assert;
import org.junit.Test;

public class HotelReservationTest 
{
		HotelReservationSystem hotelReservationSystem=new HotelReservationSystem();
		@Test
	    public void CheckIfHotelIsAdded() throws ParseException
	    {
	        hotelReservationSystem.addHotel("Lakewood",110,90);
	        hotelReservationSystem.addHotel("Ridgewood",220,150);
	        hotelReservationSystem.addHotel("Bridgewood",160,50);
	        int entry=hotelReservationSystem.countHotels();
	        Assert.assertEquals(3,entry);
	        SimpleDateFormat formatter = new SimpleDateFormat("ddMMMyyyy", Locale.ENGLISH);
	        String entryHotel=hotelReservationSystem.getCheapHotel(formatter.parse("3Oct2020"),formatter.parse("15Oct2020"));
	        Assert.assertEquals("Lakewood",entryHotel);
	    }
}

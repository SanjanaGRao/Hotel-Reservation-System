package com.bridgeLabzWorkshop.WorkshopProblem2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.junit.Assert;
import org.junit.Test;

public class HotelReservationTest 
{
		HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
		@Test
	    public void CheckIfHotelsAddedAndTestVariousHotelsForAGivenDate() throws ParseException
	    {
	        hotelReservationSystem.addHotel("Lakewood",110,90,3);
	        hotelReservationSystem.addHotel("Bridgewood",160,50,4);
	        hotelReservationSystem.addHotel("Ridgewood",220,150,5);
	        int entry=hotelReservationSystem.countHotels();
	        Assert.assertEquals(3,entry);
	        SimpleDateFormat formatter = new SimpleDateFormat("ddMMMyyyy", Locale.ENGLISH);
	        String entryHotel=hotelReservationSystem.getCheapHotel(formatter.parse("5Oct2020"),formatter.parse("6Oct2020"));
	        Assert.assertEquals("Lakewood",entryHotel);
	        String bestHotel=hotelReservationSystem.getBestRatedHotel(formatter.parse("11Sep2020"),formatter.parse("12Sep2020"));
	        Assert.assertEquals("Ridgewood",bestHotel);
	    }
}

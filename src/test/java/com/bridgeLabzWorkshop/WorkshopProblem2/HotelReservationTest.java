package com.bridgeLabzWorkshop.WorkshopProblem2;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import org.junit.Assert;
import org.junit.Test;

public class HotelReservationTest 
{
	 @Test
	    public void CheckIfHotelIsAdded() throws ParseException
	    {
	        HotelReservationSystem hotelReservationSystem=new HotelReservationSystem();
	        hotelReservationSystem.addHotel("Lakewood",110);
	        hotelReservationSystem.addHotel("Ridgewood",220);
	        hotelReservationSystem.addHotel("Bridgewood",160);
	        int entry=hotelReservationSystem.countHotels();
	        SimpleDateFormat formatter = new SimpleDateFormat("ddMMMyyyy", Locale.ENGLISH);
	        String entryHotel=hotelReservationSystem.cheapHotel(formatter.parse("10Sep2020"),formatter.parse("19Sep2020"));
	        Assert.assertEquals(3,entry);
	        Assert.assertEquals("Lakewood",entryHotel);
	    }
}

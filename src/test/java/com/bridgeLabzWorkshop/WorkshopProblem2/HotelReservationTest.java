package com.bridgeLabzWorkshop.WorkshopProblem2;

import org.junit.Assert;
import org.junit.Test;

public class HotelReservationTest 
{
	 @Test
	 public void CheckIfHotelIsAdded()
	 {
		HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
	    hotelReservationSystem.addHotelName("LockWood",90,80,110,80,3);
	    hotelReservationSystem.addHotelName("BridgeWood",60,50,160,110,4);
	    hotelReservationSystem.addHotelName("RidgeWood",150,40,220,100,5);
	    int entry = hotelReservationSystem.countHotels();
	    Assert.assertEquals(3,entry);
	 }
}

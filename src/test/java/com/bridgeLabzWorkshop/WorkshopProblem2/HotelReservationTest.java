package com.bridgeLabzWorkshop.WorkshopProblem2;

import org.junit.Assert;
import org.junit.Test;

public class HotelReservationTest 
{
	@Test
	public void WhenInitializingLakewoodShouldReturnRatings()  
	{
		HotelReservationSystem obj = new HotelReservationSystem();
		int result;
		try
		{
			result = obj.initializeLakeWood();
			Assert.assertEquals(3,result);	
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}	
	}
	
	@Test
	public void WhenInitializingBridgewoodShouldReturnRatings()  
	{
		HotelReservationSystem obj = new HotelReservationSystem();
		int result;
		try
		{
			result = obj.initializeBridgeWood();
			Assert.assertEquals(4,result);	
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}	
	}
	
	@Test
	public void WhenInitializingRidgewoodShouldReturnRatings()  
	{
		HotelReservationSystem obj = new HotelReservationSystem();
		int result;
		try
		{
			result = obj.initializeRidgeWood();
			Assert.assertEquals(5,result);	
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}	
	}
}

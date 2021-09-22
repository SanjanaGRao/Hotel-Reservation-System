package com.bridgeLabzWorkshop.WorkshopProblem2;

public class Hotels 
{
	 private String hotelNames; 
	 private int weekendRatingForRegCustomer, weekendRatingForRewCustomer;
	 private int weekdayRatingForRegCustomer, weekdayRatingForRewCustomer;
	 private static int hotelRatings;
	 
	 public Hotels()
	 {
		 System.out.println("Welcome to Hotel Reservation System");
	 }
	 
	 public Hotels(String hotelNames,int weekendRatingForRegCustomer, int weekendRatingForRewCustomer, int weekdayRatingForRegCustomer, int weekdayRatingForRewCustomer, int hotelRatings)
	 {
		 this.hotelNames = hotelNames;
		 this.weekendRatingForRegCustomer = weekendRatingForRegCustomer;
		 this.weekendRatingForRewCustomer = weekendRatingForRewCustomer;
		 this.weekdayRatingForRegCustomer = weekdayRatingForRegCustomer;
		 this.weekdayRatingForRegCustomer = weekdayRatingForRewCustomer;
		 this.hotelRatings = hotelRatings;
	 }
}

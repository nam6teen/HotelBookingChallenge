package com.example.bookhotel;
/**
 * 
 * Namita Anand
 * 30 March 2017
 * HotelBookingChallenge
 *
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HotelBookingManager {

	public static String bookHotel(int numberOfDays, int starRating, double maxAmount) {

		Hotel bookedHotel = null;
		boolean bookingStatus = false;
		double totalCost = 0;
		Hotel[] hotel = MainController.hotel;

		List<Hotel> filteredHotels = new ArrayList<>();

		for (int i = 0; i < Hotel.getLength(); i++) {

			if (hotel[i].getStarRating() == starRating) {
				filteredHotels.add(hotel[i]);
				totalCost = totalCost(numberOfDays,
						filteredHotels.get(filteredHotels.size() - 1).getMinDaysForDiscount(),
						filteredHotels.get(filteredHotels.size() - 1).getDiscount(),
						filteredHotels.get(filteredHotels.size() - 1).getCostPerDay());
				filteredHotels.get(filteredHotels.size() - 1).setTotalCost(totalCost);
			}
		}

		Collections.sort(filteredHotels);

		if (filteredHotels.get(0).getTotalCost() <= maxAmount) {
			bookedHotel = filteredHotels.get(0);
			bookingStatus = true;
		}

		if (bookingStatus)
			return "\n" + "Hotel Booked for " + numberOfDays + " days in " + starRating + " star Hotel "
					+ bookedHotel.getHotelName() + " for the cost of $" + bookedHotel.getTotalCost();

		else

			return "Sorry! You don't have sufficient amount to book any hotel.";
	}

	public static double totalCost(int numberOfDays, int minDaysForDiscount, float discount, double costPerDay) {

		if (minDaysForDiscount < numberOfDays)
			return (numberOfDays * costPerDay) * (1 - (discount / 100));
		else
			return numberOfDays * costPerDay;
	}
}

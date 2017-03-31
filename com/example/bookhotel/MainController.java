package com.example.bookhotel;

/**
 * 
 * Namita Anand
 * 30 March 2017
 * HotelBookingChallenge
 *
 */
import static java.lang.System.out;

import java.util.Scanner;

public class MainController {

	static Hotel[] hotel = new Hotel[6];

	public static void main(String[] args) {

		MainController mainController = new MainController();
		Scanner input = new Scanner(System.in);

		int numberOfDays;
		int starRating;
		double maxAmount;

		mainController.createHotelsList();

		out.println("Enter the number of days : ");
		do {
			numberOfDays = input.nextInt();
			if (!(numberOfDays >= 1 && numberOfDays <= 31))
				out.println("Enter numbers between 1 and 31 ");
		} while (!(numberOfDays >= 1 && numberOfDays <= 31));

		out.println("Enter the Star Rating : ");
		do {
			starRating = input.nextInt();
			if (starRating != 1 && starRating != 3 && starRating != 5)
				out.println("Enter 1, 3 or 5 ");
		} while (starRating != 1 && starRating != 3 && starRating != 5);

		out.println("Enter the Maximum Amount : ");
		maxAmount = input.nextDouble();

		out.println(HotelBookingManager.bookHotel(numberOfDays, starRating, maxAmount));
		input.close();
	}

	public void createHotelsList() {

		hotel[0] = new Hotel("The Park", 5, 90, 20, 2);
		hotel[1] = new Hotel("Hotel Hyaat", 5, 82, 12, 3);
		hotel[2] = new Hotel("Raddison", 3, 60, 18, 3);
		hotel[3] = new Hotel("RainTree", 3, 58, 15, 2);
		hotel[4] = new Hotel("Accord", 1, 41.55, 11.8f, 3);
		hotel[5] = new Hotel("Fortune", 1, 43, 14.8f, 4);
	}
}

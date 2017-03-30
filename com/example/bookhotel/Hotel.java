package com.example.bookhotel;
/**
 * 
 * Namita Anand
 * 30 March 2017
 * HotelBookingChallenge
 *
 */

public class Hotel {

	private String hotelName;
	private int starRating;
	private double costPerDay;
	private float discount;
	private int minDaysForDiscount;
	private double totalCost;
	private static int length = 0;

	public Hotel(String hotelName, int starRating, double costPerDay, float discount, int minDaysForDiscount) {
		super();
		this.hotelName = hotelName;
		this.starRating = starRating;
		this.costPerDay = costPerDay;
		this.discount = discount;
		this.minDaysForDiscount = minDaysForDiscount;
		this.totalCost = 0;
		length++;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getStarRating() {
		return starRating;
	}

	public void setStarRating(int starRating) {
		this.starRating = starRating;
	}

	public double getCostPerDay() {
		return costPerDay;
	}

	public void setCostPerDay(double costPerDay) {
		this.costPerDay = costPerDay;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public int getMinDaysForDiscount() {
		return minDaysForDiscount;
	}

	public void setMinDaysForDiscount(int minDaysForDiscount) {
		this.minDaysForDiscount = minDaysForDiscount;
	}

	public static int getLength() {
		return length;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

}

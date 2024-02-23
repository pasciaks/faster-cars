package com.skilldistillery.objs2.labs;

public class ParkingLot {
	private Car[] cars;
	private int numCars = 0;

	private static int MAX_CARS = 10;

	public ParkingLot() {
		cars = new Car[MAX_CARS];
	}

	public void addCar(Car c) {
		cars[numCars] = c;
		numCars++; // increment to reflect that we have one more car
	}

	public Car[] getCars() {
		Car[] carCopy;
		carCopy = new Car[numCars];
		int counter = 0;
		for (int i = 0; i < MAX_CARS; i++) {
			if (cars[i] != null) {
				carCopy[counter] = cars[i];
				counter++;
			}
		}
		return carCopy;
	}
}

package com.skilldistillery.objs2.labs;

public class CarDealership {

	private ParkingLot parkingLot = new ParkingLot();

	public CarDealership() {
	}

	public void addCarToInventory(Car c) {
		parkingLot.addCar(c);
	}

	// After re factoring, the below is no longer needed
	// This functionality can be supported by findCarsByField
	public Car[] findCarsByModel(String model) {
		Car[] carsByModel = null;
		Car[] allParkedCars = this.getAllCars();

		int count = 0;
		for (Car c : allParkedCars) {
			if (c == null) {
			} else {
				if ((c.getModel()).equals(model)) {
					count++;
				}
			}
		}
		carsByModel = new Car[count];
		int stored = 0;
		for (Car c : allParkedCars) {
			if (c == null) {
			} else {
				if ((c.getModel()).equals(model)) {
					carsByModel[stored] = c;
					stored++;
				}
			}
		}
		return carsByModel;
	}

	public Car[] findCarsByField(String field, String value) {
		Car[] carsByField = null;
		Car[] allParkedCars = this.getAllCars();

		int count = 0;
		for (Car c : allParkedCars) {
			if (c == null) {
			} else {
				switch (field) {
				case "make":
					if ((c.getMake()).equals(value)) {
						count++;
					}
					break;
				case "model":
					if ((c.getModel()).equals(value)) {
						count++;
					}
					break;

				default:
					break;
				}
			}
		}
		carsByField = new Car[count];
		int stored = 0;
		for (Car c : allParkedCars) {
			if (c == null) {
			} else {

				switch (field) {
				case "make":
					if ((c.getMake()).equals(value)) {
						carsByField[stored] = c;
						stored++;
					}
					break;
				case "model":
					if ((c.getModel()).equals(value)) {
						carsByField[stored] = c;
						stored++;
					}
					break;

				default:
					break;
				}

			}
		}
		return carsByField;
	}

	public Car[] getAllCars() {
		return parkingLot.getCars();
	}

}

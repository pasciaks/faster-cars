package com.skilldistillery.objs2.labs;

public class DealerShipApp {

	private static CarDealership cDealer = new CarDealership();

	public static void main(String[] args) {

		DealerShipApp dsa = new DealerShipApp();

		dsa.run();

	}

	public void run() {

		Car car1 = new Car("Toyota", "Camry", "Black", 4, 25000.00);
		Car car2 = new Car("Ford", "F150", "White", 4, 35000.00);
		Car car3 = new Car("Honda", "Civic", "Red", 4);

		cDealer.addCarToInventory(car1);
		cDealer.addCarToInventory(car2);
		cDealer.addCarToInventory(car3);

		System.out.println("All cars\n\n");

		showAllCars();

		System.out.println("Only Camry cars\n\n");

		showCarsByModel("Camry");

		System.out.println("By make - Ford\n\n");

		showCarsByField("make", "Ford");

		System.out.println("By make - Toyota\n\n");

		showCarsByField("make", "Toyota");

	}

	public void showAllCars() {
		Car[] allCars = cDealer.getAllCars();
		for (Car c : allCars) {
			c.displayCar();
		}
		System.out.println();
	}

	public void showCarsByModel(String model) {
		Car[] carsByModel = cDealer.findCarsByModel("Camry");
		for (Car c : carsByModel) {
			c.displayCar();
		}
		System.out.println();
	}

	public void showCarsByField(String field, String value) {
		Car[] carsByModel = cDealer.findCarsByField(field, value);
		for (Car c : carsByModel) {
			c.displayCar();
		}
		System.out.println();
	}

}

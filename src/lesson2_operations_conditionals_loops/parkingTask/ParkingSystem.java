package lesson2_operations_conditionals_loops.parkingTask;


import java.util.Scanner;

public class ParkingSystem {

	private static Car[] parkingPlaces = new Car[10];

	public static void menu() {
		Scanner scan = new Scanner(System.in);
		int choice;
		String vin;

		do {
			System.out.println("Choose action: \n" +
					"1. Free places quantity\n" +
					"2. Park car\n" +
					"3. Leave parking\n" +
					"4. Exit");

			choice = scan.nextInt();
			switch (choice) {
				case 1:
					System.out.println(getFreePlaces());
					break;
				case 2:
					System.out.println("Choose place");
					getFreePlacesWithNumbers();
					int placeNumber = scan.nextInt();
					System.out.println("Provide car VIN");
					vin = scan.next();
					parkingPlaces[placeNumber] = new Car(vin);
					break;
				case 3:
					System.out.println("Provide car VIN");
					vin = scan.next();
					leaveParking(vin);
					break;
				case 4:
					System.out.println("Good day!");
					break;
			}
		} while (choice != 4);
	}

	private static void leaveParking(String vin) {
		for (int i = 0; i < parkingPlaces.length; i++) {
			if (parkingPlaces[i] != null && parkingPlaces[i].getVin().equals(vin)) {
				parkingPlaces[i] = null;
				System.out.println("Car with VIN: '" + vin + "' has been removed from parking");
				break;
			}else if (i == parkingPlaces.length - 1) {
				  System.out.println("There is no car with vin: '" + vin + "'");  
			}
		}
	}

	public static int getFreePlaces() {
		int sum = 0;
		for (int i = 0; i < parkingPlaces.length; i++) {
			if (parkingPlaces[i] != null) {
				continue;
			}
			sum++;
		}
		return sum;
	}

	public static void getFreePlacesWithNumbers() {
		System.out.println("Free places:");
		for (int i = 0; i < parkingPlaces.length; i++) {
			if (parkingPlaces[i] != null) {
				continue;
			}
			System.out.println("Place " + i);
		}
	}
}

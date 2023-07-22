package lesson2_operations_conditionals_loops.parkingTask;

public class Car {
	private String vin;

	public Car(String vin) {
		this.vin = vin;
	}

	@Override
	public String toString() {
		return "Car{" +
				"vin='" + vin + '\'' +
				'}';
	}

	public String getVin() {
		return this.vin;
	}
}

public class Car {
	private String brand;
	private String model;
	private String fuelType;

	public Car(String brand, String model, String fuelType) {
		this.brand    = brand;
		this.model    = model;
		this.fuelType = fuelType;
	}

	public String getBrand() { return brand; }
	public String getModel() { return model; }
	public String getFuelType() { return fuelType; }
}

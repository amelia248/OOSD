public class Address {
	private String street;
	private String town;
	private String county;

	public String getStreet() { return street; }
	public void setStreet(String street) { this.street = street; }

	public String getTown() { return town; }
	public void setTown(String town) { this.town = town; }

	public String getCounty() { return county; }
	public void setCounty(String county) { this.county = county; }

	public Address(String county, String town, String street) {
		this.county = county;
		this.town = town;
		this.street = street;
	}

	@Override
	public String toString() {
		return this.county + "," + this.town + "," + this.street;
	}
}

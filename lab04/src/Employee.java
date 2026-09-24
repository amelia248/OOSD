import java.util.Objects;

public class Employee {
	private static int nextAvailableEmployeeNumber = 1000;
	private static Car defaultCompanyCar;

	private String  employeeType;
	private Address address;
	private int     employeeNumber;
//	private int     officeRoomNumber;

	private Car companyCar;

	public Employee(String type, Address address /*, int officeNumber */) {
		this.employeeType = type;
		this.address      = address;

		employeeNumber = nextAvailableEmployeeNumber;
		nextAvailableEmployeeNumber++;

//		this.officeRoomNumber = officeNumber;

		if (this.employeeType.equals("Manager")) {
			this.companyCar = defaultCompanyCar;
		}
		else {
			this.companyCar = null;
		}
	}

	public Employee(Address address, String type, Car companyCar /*, int officeNumber */) {
		this.employeeType = type;
		this.address      = address;

		employeeNumber = nextAvailableEmployeeNumber;
		nextAvailableEmployeeNumber++;

//		this.officeRoomNumber = officeNumber;

		if (this.employeeType.equals("Manager")) {
			this.companyCar = companyCar;
		}
		else {
			this.companyCar = null;
		}
	}
}


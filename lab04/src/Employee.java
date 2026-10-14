import java.util.Objects;


public class Employee {
	private static int nextAvailableEmployeeNumber = 1000;
	private static int totalEmployees = 0;
	private static Car defaultCompanyCar = new Car("Ford", "Focus", "petrol");

	private String  employeeType;
	private Address address;
	private int     employeeNumber;
	private Office  office;

	private Car companyCar;

	public Employee(String type, Address address, Office office) {
		this.employeeType = type;
		this.address      = address;

		employeeNumber = nextAvailableEmployeeNumber;
		nextAvailableEmployeeNumber++;

		this.office = office;

		if (this.employeeType.equals("Manager")) {
			this.companyCar = defaultCompanyCar;
		}
		else {
			this.companyCar = null;
		}

		totalEmployees++;
	}

	public Employee(Address address, String type, Car companyCar, Office office) {
		this.employeeType = type;
		this.address      = address;

		employeeNumber = nextAvailableEmployeeNumber;
		nextAvailableEmployeeNumber++;

		this.office = office;

		if (this.employeeType.equals("Manager")) {
			this.companyCar = companyCar;
		}
		else {
			this.companyCar = null;
		}

		totalEmployees++;
	}

	public Address getAddress()             { return this.address; }
	public void    setAddress(Address addr) { this.address = addr; }

	public Car  getCar()        { return this.companyCar; }
	public void setCar(Car car) { this.companyCar = car; }

	public Office getOffice() { return this.office; }

	@Override
	public String toString() {
		return
		"Employee #"     + this.employeeNumber        + "\n"  +
		"\ttype:      \""+ this.employeeType          + "\"\n"+
		"\toffice no.: " + this.office.getNumber()    + "\n"  +
		"\tcar:        " + this.companyCar.toString() + "\n"  ;
	}
}


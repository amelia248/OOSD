public class Office {
	private static final int MAX_EMPLOYEES = 2;

	private static int nextAvailableRoomNumber = 100;

	private int roomNumber;
	private Employee[] employees;
	private int employeeCount;


	public Office() {
		this.roomNumber = nextAvailableRoomNumber;
		nextAvailableRoomNumber++;

		this.employees = new Employee[MAX_EMPLOYEES];
	}

	public int getNumber() { return this.roomNumber; }

	@Override 
	public String toString() {
		String str = 
		"Office #" + this.roomNumber + "\n" +
		"\tno. of employees assigned: " + this.employeeCount + "\n" + 
		"\tavailable spaces:" + (MAX_EMPLOYEES - this.employeeCount) + "\n";

		str += "Employee's in office:\n";
		for (int i = 0; i < this.employeeCount; i++) {
			str += this.employees[i].toString();
		}
		str += "No more employees\n";

		return str;
	}
}
import java.util.Scanner;

class MyHR {
	public static void main() {
		Office   offices[]     = new Office[3];
		Employee employees[]   = new Employee[5];
		int      employeeCount = 0;
		// Scanner scanner = new Scanner(null)

		Scanner scanner = new Scanner(System.in);  // Create a Scanner object

		for (int i = 0; i < offices.length; i++) {
			offices[i] = new Office();
		}
		boolean exitMenu = false;
		boolean showMenu = true;

		while (!exitMenu) {
			if (showMenu) {
				System.out.println("Menu enter a number for each option:");
				System.out.println("0: show offices & employee's");
				System.out.println("1: show employee's");
				System.out.println("2: add employee");
				System.out.println("3: exit program");
			}
			System.out.print("enter option (0..3) > ");

			int chosenOption =  Integer.parseInt(scanner.nextLine());
			switch (chosenOption) {
				case 0: {
					for (int i = 0; i < offices.length; i++) {
						System.out.println(offices[i].toString());
					}
				} break;
				
				case 1: {
					for (int i = 0; i < employeeCount; i++) {
						System.out.println(employees[i].toString());
					}
				} break;
				
				case 2: {
				} break;

				case 3: {
					exitMenu = true;
				} break;
			
				default: {
					System.out.println("invalid option");
					showMenu = false;
					continue;
				}
			}
			showMenu = true;
			
		}
	}
}
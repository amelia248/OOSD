// Student Name     : Amelia Hamer
// Student ID Number: C00317858
// Date             : 11-09-2026
// Purpose          : LAB 02 B Q3 : testing the Rectangle class with a printRectangle() method


void main() {
	Rectangle rect = new Rectangle();
	
	rect.setLength(5);
	rect.setWidth(10);

	System.out.println("rectangle: " + rect.toString());
	System.out.println("	area:      " + rect.getArea());
	System.out.println("	perimeter: " + rect.getPerimeter());

	System.out.println("printed rectangle:");
	rect.printRectangle();

}

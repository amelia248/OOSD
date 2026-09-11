public class Rectangle {
	private int length;
	private int width;

	public Rectangle() {
		length = 1;
		width = 1;
	}

	public int  getLength()      { return length; }
	public void setLength(int l) {
		if (l > 0 && l <= 40) length = l;
	}

	public int  getWidth()      { return width; }
	public void setWidth(int w) {
		if (w > 0 && w <= 40) width = w;
	}

	public String toString() {
		return "Length = " + getLength() + ", Width = " + getWidth();
	}

	// Q2 extension
	public int getArea() {
		return getLength() * getWidth();
	}

	// Q2 extension
	public int getPerimeter() {
		return 2 * (getLength() + getWidth());
	}

	// Q3 extension
	public void printRectangle() {
		for (int y = 0; y < length; y++) {
			for (int x = 0; x < width; x++) {
				char toPrint = ' ';

				if (x == 0 || x == width - 1) {
					toPrint = '*';
				}

				if (y == 0 || y == length - 1) {
					toPrint = '*';
				}

				System.out.print(toPrint);
			}
			System.out.println();
		}
	}
}

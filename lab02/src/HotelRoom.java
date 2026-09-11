// Student Name     : Amelia Hamer
// Student ID Number: C00317858
// Date             : 11-09-2026
// Purpose          : LAB 02 A : Implantation of the HotelRoom class


public class HotelRoom {

	private int    roomNumber;
	private String roomType;

	// Q2 extension
	private int    vacancy;
	private double rate;

	public HotelRoom() {
		setRoomNumber(0);
		setRoomType("Single");

		// Q2 extension
		setIsOccupied(0);
		setRate(100);
	}

	// Q3 extension
	public HotelRoom(int number, String type, int occupied, double roomRate) {
		setRoomNumber(number);
		setRoomType  (type);
		setIsOccupied(occupied);
		setRate      (roomRate);
	}

	public int  getRoomNumber()        { return roomNumber; }
	public void setRoomNumber(int num) { roomNumber = num; }

	public String getRoomType()            { return roomType; }
	public void   setRoomType(String type) { roomType = type; }

	// Q2 extension
	public int  getIsOccupied()             { return vacancy; }
	public void setIsOccupied(int occupied) { vacancy = occupied; }

	// Q2 extension
	public double getRate()         { return rate; }
	public void   setRate(double r) { rate = r; }


	// Q4 extension
	public boolean isOccupied() {
		if (vacancy == 0) return false;
		else              return true;
	}
}

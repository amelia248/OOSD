// Student Name     : Amelia Hamer
// Student ID Number: C00317858
// Date             : 11-09-2026
// Purpose          : LAB 02 A Q2 : testing the HotelRoom class with isOccupied & rate extension

void main() {
	HotelRoom roomA = new HotelRoom();
	roomA.setRoomNumber(200);
	roomA.setRoomType("Single");
	roomA.setRate(100);

	HotelRoom roomB = new HotelRoom();
	roomB.setRoomNumber(201);
	roomB.setRoomType("Double");
	roomB.setRate(80);

	System.out.println("roomA:");
	System.out.println("	number: " + roomA.getRoomNumber());
	System.out.println("	type:   " + roomA.getRoomType());
	System.out.println("	rate:  €" + roomA.getRate());

	System.out.println("roomB:");
	System.out.println("	number: " + roomB.getRoomNumber());
	System.out.println("	type:   " + roomB.getRoomType());
	System.out.println("	rate:  €" + roomB.getRate());

}

// Student Name     : Amelia Hamer
// Student ID Number: C00317858
// Date             : 11-09-2026
// Purpose          : LAB 02 A Q1 : testing the HotelRoom class

void main() {
	HotelRoom roomA = new HotelRoom();
	roomA.setRoomNumber(200);
	roomA.setRoomType("Single");

	HotelRoom roomB = new HotelRoom();
	roomB.setRoomNumber(201);
	roomB.setRoomType("Double");

	System.out.println("roomA:");
	System.out.println("	number: " + roomA.getRoomNumber());
	System.out.println("	type:   " + roomA.getRoomType());

	System.out.println("roomB:");
	System.out.println("	number: " + roomB.getRoomNumber());
	System.out.println("	type:   " + roomB.getRoomType());

}

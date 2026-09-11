// Student Name     : Amelia Hamer
// Student ID Number: C00317858
// Date             : 11-09-2026
// Purpose          : LAB 02 A Q3 : testing the HotelRoom class with second constructor extension

void printHotelRoomData(HotelRoom room, String name) {
	System.out.println(name + ":");
	System.out.println("	number: " + room.getRoomNumber());
	System.out.println("	type:   " + room.getRoomType());
	System.out.println("	rate:  €" + room.getRate());
}

void main() {
	HotelRoom roomA = new HotelRoom();
	roomA.setRoomNumber(200);
	roomA.setRoomType("Single");
	roomA.setRate(100);

	HotelRoom roomB = new HotelRoom();
	roomB.setRoomNumber(201);
	roomB.setRoomType("Double");
	roomB.setRate(80);

	HotelRoom roomC = new HotelRoom(202, "Single", 0, 90);

	printHotelRoomData(roomA, "room A");
	printHotelRoomData(roomB, "room B");
	printHotelRoomData(roomC, "room C");

}

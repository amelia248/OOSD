// Student Name     : Amelia Hamer
// Student ID Number: C00317858
// Date             : 11-09-2026
// Purpose          : LAB 02 A Q4 : testing the HotelRoom class with isOccupied() method

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


	if (!roomB.isOccupied()) {
		roomB.setIsOccupied(1);
		System.out.println("room B has been set to occupied for the first time");
	}
	else {
		System.out.println("room B failed to be set to occupied when done the first time");
	}

	if (!roomB.isOccupied()) {
		roomB.setIsOccupied(1);
		System.out.println("room B has been set to occupied for the second time");
	}
	else {
		System.out.println("room B failed to be set to occupied when done a second time");
	}

}

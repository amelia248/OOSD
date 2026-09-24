void main() {
	Calendar cal = Calendar.getInstance();
	Time t = new Time (cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE));

	long previousSecond = System.currentTimeMillis() / 1000;
	while (true) {
		long currentSecond = System.currentTimeMillis() / 1000;

		if (currentSecond > previousSecond) {
			previousSecond = currentSecond;
			t.tick();
			System.out.println("current time: " + t.toString());
		}
	}
}

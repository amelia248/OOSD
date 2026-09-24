void main() {
	Time t = new Time (23, 59, 59);
	System.out.println(t.toMilitaryString());
	System.out.println(t.toString());
	t.tick();
	System.out.println(t.toMilitaryString());
	System.out.println(t.toString());
}

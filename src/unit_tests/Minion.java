package unit_tests;

public class Minion {
	String name;
	int eyes;
	String color;
	String master;

	public Minion(String name, int eyes, String color, String master) {
		this.name = name;
		this.eyes = eyes;
		this.color = color;
		this.master = master;

	}

	void setName(String name) {
		this.name = name;
	}

	void setEyes(int eyes) {
		this.eyes = eyes;
	}

	void setColor(String color) {
		this.color = color;
	}

	void setMaster(String master) {
		this.master = master;
	}

	String getName() {
		return name;
	}

	int getEyes() {
		return eyes;
	}

	String getColor() {
		return color;
	}

	String getMaster() {
		return master;
	}
}

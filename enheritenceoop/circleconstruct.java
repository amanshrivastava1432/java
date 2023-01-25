package enheritenceoop;

public class circleconstruct extends shapeconstruct {
	int radius;

	public int getRadius() {
		return radius;
	}

	public circleconstruct(int radius, String color, int borderwidth) {
		super(color,borderwidth);
		this.radius = radius;
	}
}

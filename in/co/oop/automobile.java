package in.co.oop;

public class automobile {
	private String color;
	private int gear;
	private String make;

	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getGear(int speed) {
		switch (speed) {
		case 1:
			System.out.println("Speed is 0 - 20");
			break;
		case 2:
			System.out.println("Speed is 20 - 40");
			break;
		case 3:
			System.out.println("Speed is 40 - 60");
			break;
		case 4:
			System.out.println("Speed is 60 - 80");
			break;
			
		case 5:
			System.out.println("Speed is 80 - 100");
			break;
		default:
			System.out.println("Out of the range!!");
			break;
		}
		return speed;
	}

}
-`
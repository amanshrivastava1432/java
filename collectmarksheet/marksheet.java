package collectmarksheet;

public class marksheet {
	private String rollno;
	private String name;
	private int physics;
	private int chemestry;
	private int maths;
	public marksheet(String rollno, String name, int physics, int chemestry, int maths) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.physics = physics;
		this.chemestry = chemestry;
		this.maths = maths;
	}
	public String getRollno() {
		return rollno;
	}
	public String getName() {
		return name;
	}
	public int getPhysics() {
		return physics;
	}
	public int getChemestry() {
		return chemestry;
	}
	public int getMaths() {
		return maths;
	}
	
	

}

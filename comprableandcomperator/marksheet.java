package comprableandcomperator;

public class marksheet implements Comparable <marksheet> {
	String rollno;
	String firstname;
	String lastname;
	int marks;
	public marksheet(String rollno, String firstname, String lastname, int marks) {
		super();
		this.rollno = rollno;
		this.firstname = firstname;
		this.lastname = lastname;
		this.marks = marks;
	}
	public String getRollno() {
		return rollno;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public int getMarks() {
		return marks;
	}
	@Override
	public int compareTo(marksheet m) {
		// TODO Auto-generated method stub
		return rollno.compareTo(m.rollno);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
	
	return rollno+" ,"+firstname+" ,"+"lastname"+" , "+marks;
	
	}
	}


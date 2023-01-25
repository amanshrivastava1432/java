import java.time.LocalDate;
import java.time.Period;

public class dateyeartime {
	private static final int Longtime = 0;

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate birthDate = LocalDate.of(1993, 12, 05);
		int years = Period.between(birthDate, today).getYears();
		System.out.println(years);

	}

}

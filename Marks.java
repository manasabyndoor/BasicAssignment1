import java.util.Scanner;

public class Marks {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		// read 3 marks
		System.out.println("Enter mark1");
		int m1 = scan.nextInt();
		System.out.println("Enter mark2");

		int m2 = scan.nextInt();
		System.out.println("Enter mark3");
		int m3 = scan.nextInt();

		//conditions for checking the given criteria
		if (m1 >= 60 && m2 >= 60 && m3 >= 60) {
			System.out.println("Passed");

		} else if ((m1 >= 60 && m2 >= 60) || (m2 >= 60 && m3 >= 60) || (m1 >= 60 && m3 >= 60)) {
			System.out.println("Promoted");

		} else if (m1 >= 60 || m2 >= 60 || m3 >= 60 || (m1 < 60 && m2 < 60 && m3 < 60)) {
			System.out.println("Failed");
		}
	}
}
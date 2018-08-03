import java.util.Scanner;

public class Square {
	public static void main(String args[]) {
		int i;
		
		Scanner scan = new Scanner(System.in);
		//read number
		System.out.println("Enter any number");
		int num = scan.nextInt();
		int total = 0;
		// to calculate square
		total = num * num;
		System.out.println(num + "*1=" + num + "square=" + total);

	}
}

import java.util.Scanner;

public class Discount {
	public static void main(String args[]) {
		double newItem;
		double discount = 0.35;
		
		// read the price value from user
		System.out.println("Enter the price");
		Scanner scanner = new Scanner(System.in);
		
		newItem = scanner.nextDouble();
		double price;
		// calculate the price after discount
		price = newItem - (discount * newItem);

		System.out.println("Price after Discount" + price);

	}
}

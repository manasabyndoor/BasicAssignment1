import java.util.Scanner;

public class Duplicate {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// to read any word
		System.out.println("Enter any word:");
		String word = sc.nextLine();

		int length = word.length();
		char ch;
		String answer = "";
		// finding for duplicate
		for (int i = 0; i < length; i++) {
			ch = word.charAt(i);
			if (ch != ' ')
				answer = answer + ch;
			word = word.replace(ch, ' ');

		}
		System.out.println(answer);
	}

}

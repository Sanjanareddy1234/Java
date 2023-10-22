package Java_Code;

import java.util.Scanner;

public class PangramProgram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String i = scanner.nextLine();
		scanner.close();

		boolean isPangram = checkPangram(i);
		if (isPangram) {
			System.out.println("Given String is Pangram");
		} else {
			System.out.println("Given String Not a Pangram");
		}
	}
	public static boolean checkPangram(String val) {
		val = val.toLowerCase();
		for (char l = 'a'; l <= 'z'; l++) {
			if (val.indexOf(l) == -1) {
				return false;
			}
		}
		return true;
	}
}

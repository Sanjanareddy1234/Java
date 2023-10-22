package Java_Code;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the roman number");
		String str=s.next();
		System.out.println(romanToInt(str));
		
	}

	public static int romanToInt(String s) {
		Map<Character, Integer> r = new HashMap<>();
		r.put('I', 1);
		r.put('V', 5);
		r.put('X', 10);
		r.put('L', 50);
		r.put('C', 100);
		r.put('D', 500);
		r.put('M', 1000);
		int t = 0;
		int pV = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			char rC = s.charAt(i);
			int cV = r.get(rC);

			if (cV >= pV) {
				t += cV;
			}
			else {
				t -= cV;
			}
			pV = cV;
		}
		return t;
	}
}


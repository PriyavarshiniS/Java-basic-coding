package basics;

import java.util.Scanner;

public class Palindrome {
	public boolean isPalindrome(String s) {
		String a = s.toLowerCase();
		StringBuilder b = new StringBuilder();
		char c[] = s.toCharArray();
		for (char v : c) {
			if (Character.isLetterOrDigit(v)) {
				b.append(v);
			}
		}
			String d = b.toString();
			b.reverse();
			String e = b.toString();
			if (d.equals(e)) {
				return true;
			} else {
				return false;
			}

		}

	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		String s = var.nextLine();
		Palindrome v = new Palindrome();
		System.out.println(v.isPalindrome(s));   
		
	}
}



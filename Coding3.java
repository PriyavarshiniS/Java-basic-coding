package accenture;

import java.util.*;
import java.util.Scanner;

public class Coding3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();// 12
		int num = s.nextInt();// 718
		int rem;
		int ASCII = 55;
		while (num > 0) {
			rem = num % n;
			num= num / n;
			if (9 < rem && rem < 36) {
				System.out.print((char) (ASCII + rem));
			}
			else {
				System.out.println(rem);
			}
		}
	}

}

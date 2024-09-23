package Basics;

import java.util.*;

public class Fiveletter {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		char b[] = a.toCharArray();
		StringBuilder q=new StringBuilder();
		for(char v:b) {
			if(Character.isLetter(v)) {
				q.append(v);
			}
		}
		String z=q.toString();
		char x[]=z.toCharArray();
		for (int i = 0; i < x.length; i++) {
			if ((i) % 5 == 0&&i!=0) {
				System.out.println();
			}
			{
				System.out.print(x[i]);
			}

		}
	}

}
// Alternative method
/*

public class Fiveletters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] c = s.toCharArray();
		int ind = 0;
		for (char ch : c) {
			if (Character.isLetter(ch)) {
				c[ind++] = ch;
			}
		}
		int i = 0;
		while (i < c.length) {
			if(i%5==0&&i!=0) System.out.println();
			System.out.print(c[i++]+" ");
			
		}
	}
}   */
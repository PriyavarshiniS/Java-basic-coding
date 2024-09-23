package Basics;
//import java.util.*;
import java.util.Scanner;
public class Tcs {
	static boolean isPal(String s) {
		System.out.println(s);
		if (s.length() == 1)
			return true;
		StringBuffer sb = new StringBuffer();
		sb.append(s);
		sb.reverse();
		return (s.equals(sb.toString()));
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int cut = 0;
		int first = 0;
		int last = s.length() - 1;
		while(first<last) {
			if(isPal(s.substring(first,last))) {
				cut++;
				first=last+1;
				last=s.length()-1;
			}else {
				if(first==last-1) {
					cut++;
					first=last;
					last=s.length()-1;
				}
			}
			last--;
		}
		System.out.println(cut);
	}
}



package accenture;

import java.util.*;

public class Endpal {
	public static boolean ispal(String a) {
		//System.out.println(a);
		StringBuffer b = new StringBuffer(a);
		b.reverse();
		if (a.equals(b.toString())) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String a = s.next();
		char br[] = a.toCharArray();
		int i = 0;
		int j = br.length - 1;
		StringBuffer c = new StringBuffer();
		while (i <=j) {
			  if (ispal(a.substring(i, j + 1))) {
				c.append(a.substring(0, i));
				break;
			}
			  else   {
				  i++;
					//System.out.println(a.substring(i,j));
				}
		}

		c.reverse();
		System.out.print(c.toString());
	}

}

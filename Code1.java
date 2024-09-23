package accenture;
import java.util.*;
public class Code1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();//s.nextLine();
		int ct=0;
		String a=s.next();
		char c=s.next().charAt(0);
		char b[]=a.toCharArray();
		for(int i=0;i<b.length;i++) {
			if(b[i]==c) {
				ct++;
			}
		}
		System.out.println(ct);
	}

}

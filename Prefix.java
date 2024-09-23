package Basics;
import java.util.*;
public class Prefix {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		String a[]=new String[n];
		for(int i=0;i<n;i++) {
			a[i]=s.next();
		} int j=0;
		Arrays.sort(a);
		while(a[0].charAt(j)==a[n-1].charAt(j)) {
			j++;
		}
		//System.out.print(a[0].substring(0,j));
		System.out.print(a[0].substring(0,j));
}
}
//{geek, gee,geet,ge}
//0,1,2,3
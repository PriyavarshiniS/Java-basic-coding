package Basics;
import java.util.*;
public class Strrev {
	static  String rev1(String a) { //abc
		char z[]=a.toCharArray();//a ,b,c
		int j=0;
		char m[]=new char[z.length];
		for(int i=z.length-1;i>=0;i--) {
			m[j++]=z[i];	//c,b,a
		}
		return (String.copyValueOf(m));
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String b=s.nextLine();
		String arr[]=b.split(" ");
		int j=0;
		String g[]=new String[arr.length];
		for(int i=0;i<=arr.length-1;i++) {
			g[j++]=rev1(arr[i]);
		}
		
		System.out.print(Arrays.toString(g));
		
//		StringBuffer d=new StringBuffer(b); //both place and char channge
//		d.reverse();
//		String e=d.toString();
//		String a[]=e.split(" ");
		//String c[]=new String[a.length];
		//int j=0;
		//for(int i=a.length-1;i>=0;i--) {
			//c[j++]=a[i];
			
		//}
		//System.out.print(Arrays.toString(a));
		
		
}
}
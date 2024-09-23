package Basics;           //only numbers(based on access modifiers(public and static)andvoid and return types
import java.util.*;
public class Reverse {
	public void v1(int n) {
		int temp=n;
		int count =0;
		int r=0;
		while(n>0) {
			int rem=n%10;
			count++;
		    r =r*10+rem;
			n=n/10;
		}
		System.out.println(Math.abs(r)+" "+count);
		
	}
	public int[] v2(int n) {
		int temp=n;
		int count =0;
		int r=0;
		while(n>0) {
			int rem=n%10;
			count++;
		    r =r*10+rem;
			n=n/10;
		}
		int a[] =new int[2];
		a[0]=r;
		a[1]=count;
		return (a);
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in); 
		int n=s.nextInt();
		Reverse rev=new Reverse();
		int b[]=rev.v2(n);
		System.out.print(Arrays.toString(b));
		//for(int i=0;i<b.length;i++) {
			//System.out.print(b[i]);
		//System.out.print(b[0]+ " "+b[1]);
		//	}
	}
	

}

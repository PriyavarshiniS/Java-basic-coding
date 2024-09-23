package accenture;

import java.util.*;

public class Sums {
	public static int pivot(int a[],int n) {
		int ls=0,rs=0;
		for(int i=1;i<n;i++) {
			ls=sm(0,i-1,a);
			rs=sm(i+1,n-1,a);
			if(ls==rs) {
				return i;
			}
		  
		}
		return -1;
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		int ls,rs;
		int i=0; 
		System.out.println( pivot(a,n));
		
	}
	public static int sm(int start,int end,int a[]) {
		int b=0;
		for(int i=start;i<=end;i++) {
			b=b+a[i];
		}
		return b;
		
	}
	
	
}
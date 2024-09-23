package Basics;
import java.util.*;
public class Revarray {
		static int[] rev1 (int a[],int n) {
			int arr[]=new int[n];
			int j=0;
			for(int i=n-1;i>=0;i--) {
				arr[j++]=a[i];
			}
			return arr;
			
			
		}
		public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		int b[]=rev1(a,n);
		System.out.println(Arrays.toString(b));
		
		//for(int i=0;i<n;i++) {
		//int b[i]=rev1(a,n); */
		//for(int i=n-1;i>=0;i--) {
			
			//System.out.print ([a[i]]);
			//System.out.print( b[i] );
			//}
		
	}
	
	
	

}

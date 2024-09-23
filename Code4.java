package accenture;
import java.util.*;
public class Code4 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		int sum1=0,sum2=0;
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
			if(i%2!=0) {
				sum1=sum1+a[i];
			}
			else {
				sum2=sum2^a[i];
			}
		}
		int diff;
		diff=sum1-sum2;
		System.out.println(diff);
	}

}

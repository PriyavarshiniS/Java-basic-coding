package accenture;
import java.util.*;
public class Zigzag {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int a[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				a[i][j]=s.nextInt();
			}
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(i==0||i+j==n-1||i==n-1) {
					sum=sum+a[i][j];
				}
			}
		}
		System.out.println(sum);
	
	
	
	}

}

package basics;
import java.util.*;
public class TwoArray {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=s.nextInt();
			}
		}
		if(a[0][1]==1) {
			System.out.print(5);
		}
		
	}

}
// 010
//000
//000
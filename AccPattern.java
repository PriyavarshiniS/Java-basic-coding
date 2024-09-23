package accenture;
import java.util.*;
public class AccPattern {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	for(int i=0;i<n;i++) {
		int count=i;//=i;
		for(int j=0;j<=i;j++) {
			System.out.print(++count);//++count
			
		}
		for(int k=count-1;k>i;k--) {//k=count-1
			System.out.print(--count);
		}
		System.out.println();
	}
	
	

}
}


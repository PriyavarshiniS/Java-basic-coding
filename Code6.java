package accenture;
import java.util.*;
public class Code6 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int temp=n;
		int sum=0;
		while(n>0) {
		 int rem=n%10;
		 sum=sum+(rem*rem*rem);
		 n=n/10;
		}
		if(temp==sum) {
			System.out.println("armstrong");
		}
		else {
			System.out.println("notarmstrong");
		}
		
	}

}

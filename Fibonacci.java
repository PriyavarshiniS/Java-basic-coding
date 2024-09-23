package basics;
import java.util.*;
public class Fibonacci {
	public void fibo(int n) {
		int first=0;
		int second=1;
		int sum=first+second;
		for(int i=3;i<n;i++) {
			first=second;
			second=sum;
			sum=first+second;
			
		}System.out.print(sum);
		
		
	}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	Fibonacci v=new Fibonacci();
	v.fibo(n);
}
}

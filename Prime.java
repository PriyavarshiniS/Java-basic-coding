package basics;
import java.util.*;
public class Prime {
	public boolean prime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}return true;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		Prime v=new Prime();
		System.out.println( v.prime(n));
		
		
	}

}

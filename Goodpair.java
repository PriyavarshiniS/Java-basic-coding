package accenture;
import java.util.*;
public class Goodpair {
	public static String gp(int n,int m) {
		float sum1=(float)sumOfFactors(n);
		float sum2=(float)sumOfFactors(m);
		/*if(sum1/n==sum2/m) {
			return ("good Pair");
		}
		else {
			return
		}*/
		return (sum1/n==sum2/m)?"goodPair":"BADPAIR";
		
	}
	
	public static int sumOfFactors(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) { // or i<n;i++
			
			if(n%i==0) {
				sum=sum+i;
				
			}
		}return sum;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		System.out.print(gp(n,m));
		}
		
	}



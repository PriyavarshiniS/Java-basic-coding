package basics;
import java.util.*;
public class Count {
	public  int count(int n) {
		int c=0;
		int temp=n;
		while(n>0) {
			int rem =n%10;
			n=n/10;
			if(temp>0&&temp%rem==0) {
				c++;
			}
		}return c;
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
	    Count v=new Count();
	    int d=v.count(n);
	    System.out.print(d);
	}

}

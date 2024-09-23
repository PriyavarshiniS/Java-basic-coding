package accenture;
import java.util.*;
public class Partition {
	public static int par(String a) {
		int i=0;
		int ct=0;
		int j=a.length();
		while(i<j) {
		if(isPal(a.substring(i,j))) {
			ct++;
			i=j;
			j=a.length();
		}
		else {
			j--;
			
		}
		}
		return (ct-1);
		
	}
	
	public static boolean isPal(String a) {
		StringBuffer b=new StringBuffer(a);
	     b.reverse();
	     if(a.equals(b.toString())) {
	    	 return true;
	     }
	     else return false;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.next();
		System.out.print( par(a));
	}

}

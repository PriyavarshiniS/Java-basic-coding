package accenture;
import java.util.*;
public class StartEndPal {
	public static boolean isPal(String z) {
		StringBuffer c=new StringBuffer(z);
		c.reverse();
		//System.out.println(c.toString());
		if(z.equals(c.toString())) {
			return true;
		}
		else return false;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.next();
		//char b[]=a.toCharArray();
		int i=0;int j=a.length();
		LinkedList<String>l=new LinkedList<>();
		while(i<j) {
			if(isPal(a.substring(i,j))) {
				//System.out.println(a.substring(i,j));
				l.add(a.substring(i,j));
				i=j;
				j=a.length();
			
			}
			else j--;
			
		}
		System.out.println(l.get(0)+" "+l.get(l.size()-1));
		
		
		
		
	}

}
/*abababefe*/ //ababa  efe
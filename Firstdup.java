package accenture;
import java.util.*;
public class Firstdup {
	public static boolean Contains(char b[],char v,int i) {
		
		for(int j=0;j<i;j++) {
			if(b[j]==v) {
				return true;	
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.next();
		char b[]=new char[a.length()];
		for(int i=0;i<a.length();i++) {
			b[i]=a.charAt(i);
			if(Contains(b,b[i],i)) {
				System.out.println(b[i]);
				break;
			}
		}
		
		//int ct=0 ,s=Integer.MAX_VALUE;

		
	}

}
//appale p System.out.print(b[i]+" "+ct);
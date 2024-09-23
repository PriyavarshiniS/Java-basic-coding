package strings;
import java.util.*;
public class AssignHashmap {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.next();
		String b=s.next();
		char a1[]=a.toCharArray();//e,m
		char bob[]=b.toCharArray();//e
		int as=0,bs=0;
		for(int i=0;i<a1.length;i++) {
			if(a1[i]=='E') {
				as=as+1;
			}
			else if(a1[i]=='M') {
				as=as+3;
			}
			else if(a1[i]=='H') {
				as=as+5;
			}
			if(bob[i]=='E') {
				bs=bs+1;
			}
			else if(bob[i]=='M') {
				bs=bs+3;
			}
			else if(bob[i]=='H') {
				bs=bs+5;
			}
			
		}
		if(as>bs) {
			System.out.print("alice won");
			
		}
		else if(as==bs) {
			System.out.print("tie");
			
		}
		else {
			System.out.println("bob won");
		}
		
		
	}
	}



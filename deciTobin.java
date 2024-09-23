package accenture;

import java.util.*;

public class deciTobin {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		//LinkedList<Integer> a = new LinkedList<>();
    Stack<Integer> b=new Stack<>();
		while(n>0) {
			int rem=n%2;
			n=n/2;
			//a.add(rem);
			b.push(rem);
			
		}
	/*	for(int i=a.size()-1;i>=0;i--) {
			System.out.print(a.get(i));
		}*/
		while(!b.isEmpty())
         
		System.out.println( b.pop());
	}
}

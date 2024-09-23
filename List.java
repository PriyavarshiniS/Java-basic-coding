
package accenture;
import java.util.*;
public class List {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();//3
		LinkedList<Integer>l=new LinkedList<>();//{1,2,3}
	//	l.add(1);l.add('SD')
	
		for(int i=0;i<n;i++) {
			l.add(s.nextInt());	
		}
		int ar[]=new int[l.size()];
		//int j=0;
		for(int j=0;j<l.size();j++) {
			ar[j]=l.get(j);
			
		}
		System.out.print(Arrays.toString(ar));
		
		
				}

}

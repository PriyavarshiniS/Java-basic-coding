package accenture;
import java.util.*;
public class Code3 {
	public  static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		String b[]=new String[n];
		int j=0;
		for(int i=0;i<n;i++) {
			if(a[i]%2==0) {
				b[j++]="eve";
			}
			else b[j++]="odd";
		}
		System.out.print(Arrays.toString(b));
	}

}

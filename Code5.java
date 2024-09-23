package accenture;
import java.util.*;
public class Code5 {
	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		int h=0,p=0,v=0,m=0;
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]+a[j]==18) {
					p=a[i]*a[j];{
						if(p>h) {
							h=p;
							v=a[i];
							m=a[j];
						}
					}
				}
			}
		}
		
		int b[]=new int[2];
		if(v>m) {
			b[0]=v; b[1]=m;}
		else {
			b[0]=m;
			b[1]=v;
		}
		System.out.println(Arrays.toString(b));
	}
}


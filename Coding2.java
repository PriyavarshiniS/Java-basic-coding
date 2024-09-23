package accenture;
import java.util.*;
public class Coding2 {
	public static int LargeSmallSum(int a[],int n) {
		int k=0,j=0;
		int ar[]=new int[n/2];//odd
		int arr[]=new int[(n+1)/2];//even
		for(int i=0;i<n;i++) {
			
			if(i%2==0) {
				arr[j++]=a[i];
			}
			else {
				ar[k++]=a[i];
				}
		}
		int eve=Secondlargest(arr);
		int odd=Secondlargest(ar);
		return(eve+odd);
	}
	public static int Secondlargest(int b[]) {
		Arrays.sort(b);
		int sl=b[b.length-1];//3
		for(int i=b.length-1;i>=0;i--) {///123
			if(b[i]<sl&&b[i]!=b[b.length-1]) {
				sl=b[i];
				break;	
			}
			
		}
		System.out.println(sl);
		return sl;
		
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			 a[i]=s.nextInt();
		}
		
		System.out.print(LargeSmallSum(a,n));
	}

}

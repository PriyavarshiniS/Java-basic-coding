package Basics;
import java.util.*;
public class Duplicate {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		for(int i=0;i<n;i++){//1223
		for(int j=i+1;j<n;j++) {//2
			if(arr[j]==arr[i]) {//1==1
				arr[i++]=arr[j];
				arr[j]=arr[j+1]	;			//1
			}
			}
		}
		System.out.print(Arrays.toString(arr));
	}
}
/*
public class RemoveDuplicates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int narr[] = new int[n];
		for (int i = 0; i < n; i++) {
			narr[i] = sc.nextInt();
		}
		int i = 0;
		for (int j = i + 1; j < n; j++) {
			if (narr[i] != narr[j]) {
				narr[++i] = narr[j];
			}
		}
		for (int x = i + 1; x < n; x++) {
			narr[x] = 0;
		}
		System.out.println(Arrays.toString(narr));
	}
}*/
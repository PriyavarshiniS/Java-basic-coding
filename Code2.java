package accenture;
import java.util.*;
public class Code2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int v=s.nextInt();
		int h=m/v;
		int k=(int)(n*(Math.pow(h, 2)));
		System.out.println(k);
	}

}

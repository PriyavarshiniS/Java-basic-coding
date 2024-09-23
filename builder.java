package strings;
import java.util.*;
import java.util.Map.Entry;
public class builder {//12,10,15,25,10,36,8,36,9,36--3610
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int a[]=new int [n];
	for(int i=0;i<n;i++) {
		a[i]=s.nextInt();
	}
	HashMap<Integer,Integer>h =new HashMap<>();
	for(int c:a) {
		if(h.containsKey(c)) {
			int q=h.get(c)+1;
			h.put(c, q);
			
		}
		else
			h.put(c, 1);
		
	}
	TreeMap<Integer,Integer> t=new TreeMap<>();
	for(Entry<Integer,Integer>set:h.entrySet()) {
	  
	}
}
}

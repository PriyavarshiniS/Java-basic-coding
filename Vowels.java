package Basics;
import java.util.*;
import java.util.Map.Entry;
public class Vowels {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.next();
		char b[]=a.toCharArray();
		HashMap<Character,Integer>h=new LinkedHashMap<>();
		//for(int i=0;i<b.length;i++)
		for(char v:b) { //if(h.containsKey(b[i])
			if(h.containsKey(v)) {
				int q=h.get(v)+1;
						h.put(v, q);
			}
			else {
				h.put(v,1);
			}
			
		}
		for (Entry<Character,Integer> set :h.entrySet()) {
			System.out.println(set.getKey()+" "+set.getValue());
		}
		}
	
	
}

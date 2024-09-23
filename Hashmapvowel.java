package Basics;
import java.util.*;
import java.util.Map.Entry;
public class Hashmapvowel {
	public static void main(String[] args) {
	  Scanner s=new Scanner (System.in);
		String a=s.next();
		a.toLowerCase();
		char b[]=a.toCharArray();
		HashMap<Character,Integer>h=new LinkedHashMap<>();//alphabetical order TreeMap<char,int>=new TreeMap<>();
		for(int i=0;i<b.length;i++) {//for(char v:b)
			if(b[i]=='a'||b[i]=='e'||b[i]=='i'||b[i]=='o'||b[i]=='u') {
			if(h.containsKey(b[i])) {
				int v=h.get(b[i])+1;
				h.put(b[i],v);
			}else {
				h.put(b[i], 1);
			}
			
		}
	}
		for(Entry<Character,Integer>c:h.entrySet()) {
			System.out.println(c.getKey()+" "+c.getValue());
			
		}
	}
}

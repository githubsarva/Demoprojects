package InterviewPractice;

import java.util.HashMap;
import java.util.Map;

public class Hmap {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm= new HashMap<Integer, String>();
		hm.put(1, "Saravanan");
		hm.put(2, "Vinitha");
		hm.put(3, "DhanyasriSV");
		System.out.println("Iterating Hashmap");

		for(Map.Entry  m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}

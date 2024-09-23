package InterviewPractice;

import java.util.HashMap;
import java.util.Map;

public class Hmaps {
	public static void main(String[] args) {
		
		HashMap<String , String> hm1= new HashMap<String, String>();
		hm1.put("a", "Saravanan");
		hm1.put("b", "Vinitha");
		hm1.put("c", "DhanyasriSV");
		
		
		System.out.println("Iterating HashMap");
		
		for(Map.Entry m:hm1.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}

}

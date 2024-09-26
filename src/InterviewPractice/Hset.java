package InterviewPractice;

import java.util.HashSet;
import java.util.Iterator;

public class Hset {
	public static void main(String[] args) {
		
		HashSet<String> hs= new HashSet<String>();
		hs.add("Saravanan");
		hs.add("Saravanan");

		hs.add("Vinitha");
		hs.add("DhanyasriSV");
		
		hs.add("Saravanan");
		
		Iterator<String> i= hs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}

package InterviewPractice;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class GetHighValLowValFromList {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> list= new LinkedList<Integer>();
		list.add(1);
		list.add(10);
		list.add(100);
		list.add(9);
		Collections.sort(list);
		System.out.println(list.get(0));
		System.out.println(list.get(list.size()-1));
		
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));
	}

}
 
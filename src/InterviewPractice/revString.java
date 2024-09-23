package InterviewPractice;

public class revString {
	
	public static void main(String[] args) {
		
		
		String S="DhanyasriSV";
		
		String reverse="";
		
		int length=S.length();
		
		for(int i=length-1;i>=0;i--) {
			reverse= reverse +S.charAt(i);  
		}
		
		System.out.println("The reverse String is:"+reverse);
	}

}

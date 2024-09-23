package InterviewPractice;

public class RevStrPro {
	
	public static void main(String[] args) {
		
		String S = "Saravanan";
		String reverse = "";
		
		int length= S.length();
		
		for(int i=length-1;i>=0;i--) {
			reverse =reverse + S.charAt(i);
		}
		
		System.out.println("The Reversed String is:"+reverse);
	}

}

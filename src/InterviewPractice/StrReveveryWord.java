package InterviewPractice;

public class StrReveveryWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="I love Java";
		String[] word=s.split(" ");
		String reverseString="";
		System.out.println(word.length);
		
		for(int i=0;i<word.length;i++ ) {
			String Words=word[i];
			String reverseword="";
			for(int j=Words.length()-1;j>=0;j--) {
				reverseword=reverseword + Words.charAt(j);
			}
			reverseString=reverseString + reverseword + " ";
			
			
		}
		System.out.println("The Reversed String is:"+ reverseString);

	}

}

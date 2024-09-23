package InterviewPractice;

public class PrintingtheVowlsalone {
	
public static void main(String[] args) {
	
	String S ="Vinitha Dhanyasri";
    char[] ch=S.toCharArray();
   // System.out.println(ch);
   for(int i=0;i<S.length();i++){
   if (ch[i] == 'a' || ch[i] == 'e'|| ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u'){
    System.out.print(ch[i]);
  }
   }
	
}

}

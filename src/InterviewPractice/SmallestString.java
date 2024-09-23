package InterviewPractice;

import java.util.Scanner;

public class SmallestString {
	
	
	public static void main(String[] args) {
		String S="On J Compiler"; 
		
		String[] str=S.split(" ");
		
		String smallest="",largest=" ";
		
		int minlength=Integer.MAX_VALUE;
		int maxlength=Integer.MIN_VALUE;
		
		int i=0;
		
		   for(i=0;i<str.length;i++){
	            if(str[i].length() < minlength){
	                smallest=str[i];
	                minlength=str[i].length();
	            } 
	            
	      
		            if(str[i].length() > maxlength){
		                largest=str[i];
		                maxlength=str[i].length();
		            } 
		
	}
		   System.out.println("The SmallestValue is:"+smallest);
		   System.out.println("The LargestValue is:"+largest);
}

}
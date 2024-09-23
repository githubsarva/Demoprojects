package InterviewPractice;

public class Swap2numberswithoutvariable {
	
	public static void main(String[] args) {
		
		int x= 1;
		int y= 2;
		
		
		
		
		
		System.out.println("Before Swapping");
		System.out.println("X Value is:"+x);
		System.out.println("Y Value is:"+y);
		
		x= x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("***************");
		System.out.println("After Swapping");
		System.out.println("X Value is:"+x);
		System.out.println("Y Value is:"+y);
	}

}

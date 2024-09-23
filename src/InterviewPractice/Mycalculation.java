package InterviewPractice;

public class Mycalculation extends InhertitanceExample {
	
	public void multiplication(int x,int y) {
		z=x*y;
		System.out.println("The multiplication value is:"+z);
	}
	
	
	public static void main(String[] args) {
		
		int x=10; int y=20;
		
		Mycalculation demo= new Mycalculation();
		demo.addtion(x, y);
		demo.subtraction(x, y);
		demo.multiplication(x, y);
		
	}

}

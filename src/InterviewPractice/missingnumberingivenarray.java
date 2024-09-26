package InterviewPractice;

public class missingnumberingivenarray {
	
	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
		
		int sum1=0;
		
		for(int i=0;i<arr.length;i++) {
			sum1= sum1 + arr[i];
		}
		int sum2=0;
		for(int j=1;j<=10;j++) {
			 sum2= sum2+j;
		}
		
		System.out.println("The missing number is:"+(sum2-sum1));
	}

	
}

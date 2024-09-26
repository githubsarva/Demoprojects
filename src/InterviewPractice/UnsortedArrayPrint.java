package InterviewPractice;

public class UnsortedArrayPrint {
	
	public static void main(String[] args) {
		
		int[] arr ={3,2,1};
		
		int temp=0;
		
		//Printing array elements in given order

		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		
		// Printing the elements in Soreted ascending order
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
			System.out.println();
		
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}

}

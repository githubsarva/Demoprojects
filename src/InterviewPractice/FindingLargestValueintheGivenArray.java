package InterviewPractice;

public class FindingLargestValueintheGivenArray {
	
	public static void main(String[] args) {
		
		int[] arr={28,3,15,9,17,4,23,2};
	      int val=arr[0];
	      for(int i=0; i<arr.length; i++){
				if(arr[i] > val){
					val=arr[i];
				}
				
	      }
	      System.out.println("The Largest value:"+val);
	}

}

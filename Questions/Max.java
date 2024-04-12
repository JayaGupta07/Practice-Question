public class Max {

	public static void main(String[] args) {
		int arr[]= {23,45,67,55,100};
		 int max = arr[0];
		 for(int i=0; i<arr.length; i++) {
			 if(arr[i]>max)
				 max=arr[i];
			
		 }
		 System.out.println("The maximum number of an array is "+ max);
		 }

}
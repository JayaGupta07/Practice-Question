
public class Duplicate {

	public static void main(String[] args) {
		int arr[]= {2,3,4,3,6,8,8,10};
		int l = arr.length;
		System.out.println("The length of an array is "+ l);
		for(int i=0; i<l; i++) {
			for(int j=i+1; j<l; j++) {
				if(arr[i] == arr[j])
					System.out.println("The duplicates in an array is " + arr[j]);
			}
		}

	}

}

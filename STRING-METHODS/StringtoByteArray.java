import java.util.Arrays;
public class StringtoByteArray {

	public static void main(String[] args) {
		String name= "Jaya";
		byte[] arr = name.getBytes();
        System.out.println("String to byte array: " + Arrays.toString(arr));
        
	}

}

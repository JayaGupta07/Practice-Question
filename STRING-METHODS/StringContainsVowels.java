public class StringContainsVowels {

	public static void main(String[] args) {
		String word1= "Railword";
		String word2= "India";
		
	   System.out.println(word1.toLowerCase().matches(".*[aeiou].*"));
	   System.out.println(word2.toLowerCase().matches(".*[aeiou].*"));
		 
	}
}
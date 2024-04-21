import java.util.Arrays;
public class Anagram {

	public static void main(String[] args) {

        String word1 = "Calm";
        String word2 = "Clam";
        if(word1.length() == word2.length()) 
        {
             char[] Array1 = word1.toCharArray();
             char[] Array2 = word2.toCharArray();
             Arrays.sort(Array1);
             Arrays.sort(Array2);
             boolean result = Arrays.equals(Array1,Array2);
             if(result) 
             {
                System.out.println(word1 + " and " + word2 + " are anagrams of each other.");
              }
             else {
                System.out.println(word1 + " and " +  word2 + " are not anagrams of each other.");
              }
        }
        else {
           System.out.println(word1+ " and " + word2 + " are not anagrams of each other.");
        }
    

	}

}

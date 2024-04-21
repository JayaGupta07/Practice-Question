public class Palindrome{
    public static void main (String[] args) 
    {
       String word = "level";     
       String revword = "";
       for (int i = word.length() - 1; i >= 0; i--) 
        {
           revword += word.charAt(i);
        }
   
       if (word.equals(revword)) 
          {
              System.out.println("The string " + word + " is a Palindrome String.");
          } 
        else 
          {
           System.out.println("The string " + word + " is not a Palindrome String.");
          }
    }
    
}
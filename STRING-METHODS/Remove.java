
public class Remove
{
  public static void main(String args[]) 
    {
      String str = "My name is jaya";
      System.out.println("String after removing 'a' = "+str.replace("a", ""));    
      System.out.println("String after removing First 'a' = "+str.replaceFirst("a", ""));  
      System.out.println("String after replacing all capital letters = "+str.replaceAll("([A-Z])", "")); 
  }
}
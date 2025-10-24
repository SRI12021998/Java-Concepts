package testinlogical;
import java.util.*;
public class ParenthesisCheck 

{
  public static String BracketMatcher(String str) 
  {
    String input=str;
    int ob=0;
    int cb=0;
    int result;
    for (int i=0;i<input.length();i++)
    {
      String check=String.valueOf(input.charAt(i));
      if(check.equals("("))
      {
        ob++;
      }
      else if(check.equals(")"))
      {
        cb++;
      }
    } 
    try
    {
      result=ob%cb;
    }
    catch(Exception e)
    {
      result=0;
    }

    return result==0? "1":"0";
  }

  public static void main (String[] args) 
  {  
     Scanner s = new Scanner(System.in);
     System.out.println("Enter input value");
     String input=s.nextLine();
    System.out.print(BracketMatcher(input)); 
  }

}

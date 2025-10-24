package testinlogical;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;

class MinWinSubstring 
{

  public static String MinWindowSubstring(String[] strArr) 
  {
    String k=strArr[0];
    String n=strArr[1];
    LinkedHashMap<String, Integer> con=new LinkedHashMap<>();

    for(int i=0;i<=(k.length()-n.length());i++)
    {
    	for(int j=i+n.length();j<=k.length();j++)
    	{
    		con.put(k.substring(i,j), j-i);
    	}
    }
    
    Iterator<String> itr1=con.keySet().iterator();
    while(itr1.hasNext())
    {
    	String temp=itr1.next();
    	for(int i=0;i<n.length();i++)
    	{
    		if(temp.contains(n.substring(i,i+1)))
    		{
    			temp=temp.replaceFirst(n.substring(i,i+1), "");
    			continue;
    		}
    		else
    		{
    			itr1.remove();
    			break;
    		}
    	}
    }
    ArrayList<String> output=new ArrayList<>();
    output.addAll(con.keySet());
    Collections.sort(output,(s1,s2)->s1.length()-s2.length());
    return output.get(0);
  }

  public static void main (String[] args) 
  {  
    // // keep this function call here     
    // Scanner s = new Scanner(System.in);
    String[] input={"aaabaaddae", "aed"};
    System.out.println(MinWindowSubstring(input));
  }

}

package logical;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class DuplicateChar 
{
    public static void main(String[] args) 
    {
        String input="look for duplicated";
        HashMap <Character,Integer> output=new HashMap<>();//for removing repeated letters
        for(int i=0;i<input.length();i++)
        {
            for(int j=i+1;j<input.length();j++)
            {
                if(input.charAt(i)==input.charAt(j)&&input.charAt(i)!=32)//eliminating space
                {
                    output.put(input.charAt(j), j);
                    break;
                }
            }
        }
        Iterator<Character> itr=output.keySet().iterator();
        while (itr.hasNext()) 
        {
            System.out.print(itr.next()+" | ");
        }
    }
}

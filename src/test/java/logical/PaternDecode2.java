package logical;

import java.util.HashMap;
import java.util.Map;

public class PaternDecode2 //aabbcddab//output a3b3c1d2
{
    public static void main(String[] args) 
    {
        String input="aabbcddab";//output a3b3c1d2
        System.out.println(characterCount(input));
    }
    public static String characterCount(String i)
    {
        StringBuilder output = new StringBuilder();
        HashMap <Character, Integer> charCountMap = new HashMap<>();
        for(char ch: i.toCharArray())
        {
            charCountMap.put(ch, (charCountMap.getOrDefault(ch, 0))+1);
        }
        for(Map.Entry<Character,Integer> entry:charCountMap.entrySet())
        {
            output.append(String.valueOf(entry.getKey())+entry.getValue());
        }
        return output.toString();
    }
}

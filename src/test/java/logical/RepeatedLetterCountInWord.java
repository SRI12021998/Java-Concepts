package logical;

import java.util.*;

public class RepeatedLetterCountInWord 
{
    public static void main(String[] args) 
    {
        String sentence = "oh";
        System.out.println(DuplicateLettersChecker(sentence));
    }

    public static String DuplicateLettersChecker(String sentence)
    {
        String[] words = sentence.split(" ");

        String result = "";
        int maxRepeatOverall = 0;

        for (String word : words) 
        {
            Map<Character, Integer> freq = new HashMap<>();
            int maxRepeatInWord = 0;

            for (char c : word.toCharArray()) 
            {
                freq.put(c, freq.getOrDefault(c, 0) + 1);
                maxRepeatInWord = Math.max(maxRepeatInWord, freq.get(c));
            }

            if (maxRepeatInWord > maxRepeatOverall) 
            {
                maxRepeatOverall = maxRepeatInWord;
                result = word;
            }
        }
        if (maxRepeatOverall>1)
        {
            return result;
        }
        else 
        {
            return "-1";
        }
    }
}


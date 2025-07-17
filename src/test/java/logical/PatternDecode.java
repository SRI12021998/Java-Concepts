package logical;

public class PatternDecode 
{/*
    input - a2u9i
    output - e4a81o
    */
    public static void main(String[] args) 
    {
        String input="a2u9i";
        StringBuilder output = new StringBuilder();
        String vowels= "aeiou";
        for(int i=0; i<input.length(); i++)
        {
            if (Character.isLetter(input.charAt(i))) 
            {
                char currentChar = input.charAt(i);
                int a=vowels.indexOf(currentChar);
                output.append(vowels.charAt((a+1) % vowels.length()));
            }
            else if(Character.isDigit(input.charAt(i))) 
            {
                int currentDigit = Character.getNumericValue(input.charAt(i));
                output.append(currentDigit*currentDigit);
            }
        }
        System.out.println(output.toString());
    }
}

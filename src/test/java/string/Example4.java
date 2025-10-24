package string;

public class Example4 
{
    /**
     * This class demonstrates various string operations in Java.
     */
    public static void main(String[] args) 
    {
        String str1 = "Hello World";

        System.out.println(str1.toUpperCase());

        System.out.println(str1.toLowerCase());

        System.out.println(str1.length());

        System.out.println(str1.charAt(0));

        System.out.println(str1.indexOf('o'));

        System.out.println(str1.lastIndexOf('o'));

        System.out.println(str1.substring(0, 11));

        System.out.println(str1.replace('o', 'a'));

        System.out.println(str1.contains("World"));

        System.out.println(str1.startsWith("Hello"));

        System.out.println(str1.endsWith("World"));

        String[] words = str1.split(" ");
        for (String word : words) {
            System.out.println(word);
        }

        String str2 = "   Trim this string   ";
        System.out.println(str2.trim());

        String str3 = "Hello";
        String str4 = "Hello";
        System.out.println(str3.equals(str4));

        System.out.println(str3.equalsIgnoreCase("hello"));

        String str5 = "Hello";
        char[] charArray = str5.toCharArray();
        for (char c : charArray) {
            System.out.print(c + " ");
        }
    }    
}

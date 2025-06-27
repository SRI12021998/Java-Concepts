package logical;

public class StringSwap 
{
    public static void main(String[] args) 
    {
        String s1="first";
        String s2="second";
        s1=s1.concat(s2);//join s1 & s2
        s2=s1.substring(0,s1.length()-s2.length());
        s1=s1.substring(s2.length(), s1.length());
        System.out.println(s2);
        System.out.println(s1);
    }

    
}

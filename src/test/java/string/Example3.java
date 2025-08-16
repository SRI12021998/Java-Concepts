package string;

public class Example3 
{
    public static void main(String[] args) 
    {
        int a=1002;
        String temp=String.valueOf(a);
        System.out.println(temp);
        String temp2=Integer.toString(a);
        System.out.println(temp2);
        double b=100.5;
        String temp3=String.valueOf(b);
        System.out.println(temp3); 
        String temp4=Double.toString(b);
        System.out.println(temp4);
    }
}

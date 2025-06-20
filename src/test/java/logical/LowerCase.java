package logical;

public class LowerCase 
{
        public static void main(String[] args) 
    {
        String txt= "HELLO' WORLD";
        char [] ch = txt.toCharArray();
        for(int i=0; i<ch.length; i++)
        {
            if((int)ch[i]<96&&(int)ch[i]!=32&&(int)ch[i]!=39)
            {
                ch[i]= (char)((int)ch[i]+32);
            }
        }
        for (char c : ch)
        {
            System.out.print(c);
        }
    }
}

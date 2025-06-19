package polymorphism;

public class Sri extends Bala
{
    public static void main(String[] args) 
    {
        Sri s=new Sri();
        s.investment();
        
    }
    
    @Override
    public void investment() 
    {
       System.out.println("GOLD");
    }
}

package polymorphism;

public class Bala 
{
    public static void main(String[] args) 
    {
        Bala b=new Sri();
        b.investment();
        Sri s=(Sri)b;
        s.investment();
        Bala b1=new Bala();
        b1.investment();
    }
    public void investment()
    {
        System.out.println("FD");
    }
}

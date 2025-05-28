package functionalinterface;

public class FunctionalityCheck 
{

	public static void main(String[] args) 
	{
		MyFunctionalInterface mfi=()->{System.out.println("Hi from abstract method");};
		mfi.surviveLife();
		MyFunctionalInterface2 mfi2=(a,b)->System.out.println(a+b);
		mfi2.add(97, 2);
		MyFunctionalInterface3 mfi3=(age,name)->{if(age<30)return true; else return false; };
		System.out.println(mfi3.alive(27, "Sriram"));
	}

}

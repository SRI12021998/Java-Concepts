package rough;

public class Test1 
{
	public static void main(String[] args) 
	{
	        String[]s1={"dev","sunny","rob"};
	        for(int a=0;a<s1.length;a++)
	        {
	        	String temp=s1[a];
	        	for (int b=0;b<temp.length()-1;b++)
	        	{
		        	if(temp.charAt(b)==temp.charAt(b+1))
		        	{
		        		System.out.println("Duplicate element - "+s1[a]+" having character- "+temp.charAt(b+1) );
		        	}
	        	}
	        }
	}
}

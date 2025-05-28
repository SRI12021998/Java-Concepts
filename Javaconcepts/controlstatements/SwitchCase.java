package controlstatements;
import java.util.Scanner;
public class SwitchCase 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter the service required");
		String service=s.nextLine();//use nextline instead of next to read after space
		service=service.toUpperCase();
		switch (service)
		{
		case "BALANCE ENQUIRY":
		{
			System.out.println("Available cash balance is");
		}
		break;
		case "PASSWORD RESET":
		{
			System.out.println("Password reset successfull");
		}
		break;
		case "CASH WITHDRAWL":
		{
			System.out.println("Please collect your cash");
		}
		break;
		default:
		{
			System.out.println("Please enter valid input");
		}
		break;
		}
	}

}

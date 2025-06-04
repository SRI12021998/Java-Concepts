package datetime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ExampleDateTime 
{

	public static void main(String[] args) 
	{
		LocalTime l=LocalTime.of(23, 30, 59);
		System.out.println("Customized time:"+l);
		LocalDateTime l2=LocalDateTime.of(1998, 02, 12, 6, 10, 40);
		System.out.println("Birthdate & time:"+l2);
		DateTimeFormatter requiredFormat=DateTimeFormatter.ofPattern("yyyy-MMMM-dd-HH-mm-ss");
		String output=l2.format(requiredFormat).toUpperCase();
		System.out.println("Customized date in format: "+output);
		LocalDate localDate=LocalDate.now();
		System.out.println(localDate);
		DateTimeFormatter requiredMonthFormat=DateTimeFormatter.ofPattern("MMM", Locale.ENGLISH);
		DateTimeFormatter requiredYearFormat=DateTimeFormatter.ofPattern("YYYY");
		DateTimeFormatter requiredDateFormat=DateTimeFormatter.ofPattern("dd");
		String mon=localDate.format(requiredMonthFormat);
		String year=localDate.format(requiredYearFormat);
		String date=localDate.format(requiredDateFormat);
		System.out.println(mon+year+date);
		DateTimeFormatter newFormat=DateTimeFormatter.ofPattern("MMM",Locale.ENGLISH);
		for(int i=1;i<=12;i++)
		{
		LocalDateTime temp=LocalDateTime.of(1998, i, 14, 20, 30);
		System.out.println(temp.format(newFormat).toUpperCase());
		}
	}

}

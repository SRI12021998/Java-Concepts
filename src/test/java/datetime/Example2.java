package datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Example2 
{
    public static void main(String[] args) 
    {
        LocalDateTime ldt=LocalDateTime.of(2025, 9, 10, 0, 0, 0);
      
        String year=ldt.getYear()+"";
        System.out.println("Current year: " + year);
   
        String month=ldt.getMonth().toString();
        System.out.println("Current month: " + month);
  
        String day=ldt.getDayOfMonth()+"";
        System.out.println("Current day: " + day);

        String year2=DateTimeFormatter.ofPattern("yyyy").format(ldt);
        System.out.println("Formatted year: " + year2);
  
        String month2=DateTimeFormatter.ofPattern("MMM",Locale.ENGLISH).format(ldt);
        System.out.println("Formatted month: " + month2);
 
        String day2=DateTimeFormatter.ofPattern("dd").format(ldt);
        System.out.println("Formatted day: " + day2);
    }
}
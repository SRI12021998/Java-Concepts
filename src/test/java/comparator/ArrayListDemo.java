package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListDemo implements Comparator
{
    public static void main(String[] args) 
    {
        ArrayList <String> names = new ArrayList<>();
        names.add("Apple");
        names.add("Cherry");
        names.add("Elderberry");
        names.add("Banana");
        names.add("Date");
        
        System.out.println("Before sorting");
        System.out.println(names);

        // Comparator c=new ArrayListDemo();
        // names.sort(c);

        // System.out.println("After sorting");
        // System.out.println(names);

        Collections.sort(names);
        System.out.println(names);
    }

    @Override
    public int compare(Object o1, Object o2) 
    {
        String s1=o1.toString();
        String s2=String.valueOf(o2);
        if(s1.compareTo(s2)>0)
        {
            return 1;
        }
        else if(s1.compareTo(s2)<0)
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}

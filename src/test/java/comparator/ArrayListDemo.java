package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo
{    public static void main(String[] args) 
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

        Collections.sort(names);// Sorting the ArrayList in natural order
        System.out.println(names);
    }
}

package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArraListDemo2 
{
    public static void main(String[] args) 
    {
        ArrayList <String> animal=new ArrayList<>();
        animal.add("dog");
        animal.add("cat");
        animal.add("horse");
        animal.add("goat");
        animal.add("elephant");
        Collections.sort(animal,(s1,s2)->s2.compareTo(s1));
        System.out.println(animal);
        
        //   Collections.sort(animal,new Comparator()
        //   {
        //        public int compare(Object o1, Object o2)
        //        {
        //             String s1=o1.toString();
        //             String s2=o2.toString();
        //            if(s1.compareTo(s2)>0)
        //             return 1;
        //            else if(s1.compareTo(s2)<0)
        //             return -1;
        //            else
        //            return 0;
        //         }
        //   });
        // System.out.println(animal);
    }
}

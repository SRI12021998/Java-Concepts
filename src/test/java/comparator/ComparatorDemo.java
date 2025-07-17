package comparator;

import java.util.Comparator;

public class ComparatorDemo implements Comparator
{

    @Override
    public int compare(Object o1, Object o2) 
    {
       Laptop l1 = (Laptop) o1;
       Laptop l2 = (Laptop) o2;

       // Compare based on price
        // if(l1.price>l2.price)
        // {
        //     return 1;
        // }
        // else if(l1.price<l2.price)
        // {
        //     return -1;
        // }
        // else
        // {
        //     return 0;
        // }

         // Compare based on RAM
        // if(l1.ram > l2.ram)
        // {
        //     return 1;
        // }
        // else if(l1.ram < l2.ram)
        // {
        //     return -1;
        // }
        // else
        // {
        //     return 0;
        // }

        // Compare based on brand lexicographically
        if(l1.brand.compareTo(l2.brand) > 0)
        {
            return 1;
        }
        else if(l1.brand.compareTo(l2.brand) < 0)
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }

}

package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Laptop 
{
    int ram;
    String brand;
    String processor;
    double price;
    Laptop(int ram, String brand, String processor, double price) 
    {
        this.ram = ram;
        this.brand = brand;
        this.processor = processor;
        this.price = price;
    }
    public static void main(String[] args) 
    {
        Laptop hp=new Laptop(4, "PAVILION", "COREI5", 40000);
        Laptop dell=new Laptop(32, "INSPIRON", "COREI7", 60000);
        Laptop lenovo=new Laptop(8, "IDEAPAD", "AMD5", 45000);
        Laptop asus=new Laptop(16, "VIVOBOOK", "AMD7", 55000);


        Laptop[] laptops = {hp, dell, lenovo, asus};

        ArrayList<Laptop> laptopList = new ArrayList<>();

        //add lapops in arraylist
        for (Laptop laptop : laptops) 
        {
            laptopList.add(laptop);
        }

        // Display unsorted laptops
        System.out.println("Unsorted Laptops:");
        for (Laptop laptop : laptopList) 
        {
            System.out.println(laptop.brand + " " + laptop.ram + "GB RAM " + laptop.processor + " " + laptop.price);
        }

        Collections.sort( laptopList, new ComparatorDemo());

        // Display sorted laptops
        System.out.println();
        System.out.println("Sorted Laptops:");
        for (Laptop laptop : laptopList) 
        {
            System.out.println(laptop.brand + " " + laptop.ram + "GB RAM " + laptop.processor + " " + laptop.price);
        }
    }
}

package org.example.collections;

public class Main {

    public static void main(String[] args) {

        PhoneManager pm = new PhoneManager();

        pm.addPhone(new Phone(1, "iPhone 13", "Apple", 999.99, 12, "24-09-2021"));
        pm.addPhone(new Phone(2, "Galaxy S21", "Samsung", 799.99, 64, "29-01-2021"));
        pm.addPhone(new Phone(3, "Pixel 6", "Google", 599.99, 50, "13-10-2023"));
        pm.addPhone(new Phone(4, "OnePlus 9", "OnePlus", 699.99, 48, "23-03-2011"));

        System.out.println("All Phones:");
        pm.getAllPhones().forEach(System.out::println);

        System.out.println("\nAfter Sorting by Name:");
        pm.sortByName();
        pm.getAllPhones().forEach(System.out::println);

        System.out.println("\nfiltered by brand:");
        pm.filterByBrand("Samsung").forEach(System.out::println);
        pm.sortByCost();
        //print the list of phones after sorting by cost
        System.out.println("\nAfter Sorting by Cost in Ascending order:");
        pm.getAllPhones().forEach(System.out::println);
        pm.sortByCostDesc();
        System.out.println("\nAfter Sorting by Cost in descending order:");
        pm.getAllPhones().forEach(System.out::println);

        pm.sortByDate();
        System.out.println("\nAfter Sorting by Date in Ascending order:");
        pm.getAllPhones().forEach(System.out::println);
        pm.sortByDateDesc();
        System.out.println("\nAfter Sorting by Date in Descending order:");
        pm.getAllPhones().forEach(System.out::println);


    }
}

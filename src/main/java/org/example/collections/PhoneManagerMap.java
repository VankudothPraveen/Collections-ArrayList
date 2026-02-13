package org.example.collections;
import java.util.*;
public class PhoneManagerMap {
    // make the map private for encapsulation
    public Map<Integer, Phone> phoneMap=new HashMap<>();

    // ...existing code...
    public void addPhoneToMap(Phone phone) {
        phoneMap.put(phone.getId(), phone);
    }

    public void removeById(int id) {
        phoneMap.remove(id);
    }
    public List<Phone> filterByBrand(String brand) {
        List<Phone> filtered = new ArrayList<>();
        for (Phone p : phoneMap.values()) {
            if (p.getBrand().equalsIgnoreCase(brand)) {
                filtered.add(p);
            }
        }
        return filtered;
    }
    public void sortByCost() {
        List<Phone> phoneList = new ArrayList<>(phoneMap.values());
        Collections.sort(phoneList, new CostComparator());
        for (Phone phone : phoneList) {
            System.out.println(phone);
        }
    }
    public void sortByCostDesc() {
        List<Phone> phoneList = new ArrayList<>(phoneMap.values());
        Collections.sort(phoneList, new costComparatorDesc());
        for (Phone phone : phoneList) {
            System.out.println(phone);
        }
    }
    public void sortByDate() {
        List<Phone> phoneList = new ArrayList<>(phoneMap.values());
        phoneList.sort((p1, p2) -> {
            String[] d1 = p1.getDateOfManufacture().split("-");
            String[] d2 = p2.getDateOfManufacture().split("-");

            int day1 = Integer.parseInt(d1[0]);
            int month1 = Integer.parseInt(d1[1]);
            int year1 = Integer.parseInt(d1[2]);

            int day2 = Integer.parseInt(d2[0]);
            int month2 = Integer.parseInt(d2[1]);
            int year2 = Integer.parseInt(d2[2]);

            if (year1 != year2) return year1 - year2;
            if (month1 != month2) return month1 - month2;
            return day1 - day2;
        });

    }
    public void sortByDateDesc() {
        List<Phone> phoneList = new ArrayList<>(phoneMap.values());
        phoneList.sort((p1, p2) -> {
            String[] d1 = p1.getDateOfManufacture().split("-");
            String[] d2 = p2.getDateOfManufacture().split("-");

            int day1 = Integer.parseInt(d1[0]);
            int month1 = Integer.parseInt(d1[1]);
            int year1 = Integer.parseInt(d1[2]);

            int day2 = Integer.parseInt(d2[0]);
            int month2 = Integer.parseInt(d2[1]);
            int year2 = Integer.parseInt(d2[2]);

            if (year1 != year2) return year2 - year1;
            if (month1 != month2) return month2 - month1;
            return day2 - day1;
        });
    }

    public void getAllPhones() {
        for (Phone phone : phoneMap.values()) {
            System.out.println(phone);
        }
    }



}

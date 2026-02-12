package org.example.collections;

import java.util.*;

public class PhoneManager {

    private List<Phone> phones = new ArrayList<>();

    public void addPhone(Phone phone) {
        phones.add(phone);
    }

    public void removeById(int id) {
        Iterator<Phone> it = phones.iterator();
        while (it.hasNext()) {
            if (it.next().getId() == id) {
                it.remove();
            }
        }
    }

    public List<Phone> filterByBrand(String brand) {
        List<Phone> filtered = new ArrayList<>();
        for (Phone p : phones) {
            if (p.getBrand().equalsIgnoreCase(brand)) {
                filtered.add(p);
            }
        }
        return filtered;
    }

    public void sortByName() {
        Collections.sort(phones, new NameComparator());
    }

    public void sortByCost() {
        Collections.sort(phones, new CostComparator());
    }

    public void sortByDate() {
        phones.sort((p1, p2) -> {
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

    public List<Phone> getAllPhones() {
        return phones;
    }
}

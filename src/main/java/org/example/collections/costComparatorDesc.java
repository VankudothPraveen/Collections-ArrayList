package org.example.collections;

import java.util.Comparator;

public class costComparatorDesc implements Comparator<Phone> {
    @Override
    public int compare(Phone p1, Phone p2) {
        return Double.compare(p2.getCost(), p1.getCost());
    }
}

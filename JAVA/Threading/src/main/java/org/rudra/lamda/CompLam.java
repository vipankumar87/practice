package org.rudra.lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

class Data{
    private String name;

    public Data(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                '}';
    }
}


public class CompLam {
    public static void main(String[] args) {
        List<Data> list = new ArrayList<Data>();
        list.add(new Data("H"));
        list.add(new Data("A"));
        list.add(new Data("C"));
        list.add(new Data("G"));
        list.add(new Data("D"));
        list.add(new Data("B"));
        list.add(new Data("F"));
        list.add(new Data("E"));
        Collections.sort(list, (o1, o2) -> o1.getName().compareTo(o2.getName()));
        for (Data data : list) {
            System.out.println(data);
        }

        IntPredicate less = value -> value < 18;
        IntPredicate more = value -> value > 18;

        // Combine predicates to check if the value is neither less than nor more than 18
        IntPredicate between = less.or(more).negate();

        // Test the predicate with 18
        System.out.println("predicate: " + between.test(18)); // Output: false
        System.out.println("predicate: " + between.test(20)); // Output: false
        System.out.println("predicate: " + between.test(16)); // Output: false
        System.out.println("predicate: " + between.test(19)); // Output: false
        System.out.println("predicate: " + between.test(18)); // Output: true
    }
}

package org.rudra.lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
    }
}

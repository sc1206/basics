package com.company.ListJiHe;

import java.util.Arrays;

public class ListJi {
    public static void main(String[] args) {
/*        ArrayList<String> list = new ArrayList<>();
        list.add("xz");
        list.add("xdf");
        String first = list.get(0);
        String end=list.get(1);
        System.out.println(first+end);*/

 /*       List<Number> list = new ArrayList<>();
        list.add(new Integer(123));
        list.add(new Double(23.1));
        Number first = list.get(0);
        Number end = list.get(1);
        System.out.println(first + "and" + end);*/
        Person[] ps = new Person[]{
                new Person("Bob", 16),
                new Person("Tom", 14),
                new Person("Zun", 19),
        };
        Arrays.sort(ps);
        System.out.println(Arrays.toString(ps));
    }

}

class Person implements Comparable<Person> {
    String name;
    int score;

    Person(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }

    public String toString() {
        return this.name + "," + this.score;
    }
}



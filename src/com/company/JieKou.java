package com.company;

public class JieKou {
    public static void main(String[] args) {
        StudentThree st = new StudentThree("xzxdf");
        st.run();
    }
}

interface PersonTwo {
    String getName();

    default void run() {
        System.out.println(getName() + "run");
    }
}

class StudentThree implements PersonTwo {
    private String name;

    public StudentThree(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}

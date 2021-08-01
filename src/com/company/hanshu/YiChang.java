package com.company.hanshu;

public class YiChang {
    public static void main(String[] args) throws Exception {
        Class stdClass = Students.class;
        System.out.println(stdClass.getMethod("getScore", String.class));
        System.out.println(stdClass.getMethod("getName"));
        System.out.println(stdClass.getDeclaredMethod("getGrade", int.class));

    }

}

class Students extends Persons {
    public int getScore(String type) {
        return 99;
    }

    private int getGrade(int year) {
        return 1;
    }
}

class Persons {
    public String getName() {
        return "Persons";
    }
}

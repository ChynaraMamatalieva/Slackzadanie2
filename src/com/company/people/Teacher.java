package com.company.people;

public class Teacher extends Adam {
    @Override
    public String toString() {
        teach();
        return "Teacher{}";
    }

    private static void teach() {

        System.out.println("Teacher is teaching");
    }
}

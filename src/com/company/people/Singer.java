package com.company.people;

public class Singer extends Adam {
    @Override
    public String toString() {
        sing();
        return "Singer{}";
    }

    private static void sing(){
        System.out.println("Singer is singing");
    }
}

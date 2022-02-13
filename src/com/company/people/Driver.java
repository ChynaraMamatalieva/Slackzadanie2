package com.company.people;

public class Driver extends Adam {
    @Override
    public String toString() {
        drive();
        return "Driver{}";
    }

    private static void drive(){

        System.out.println("Driver is driving");
    }
}

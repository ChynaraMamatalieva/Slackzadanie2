package com.company;

import com.company.people.Driver;
import com.company.people.Singer;
import com.company.people.Teacher;

public class Main {

    public static void main(String[] args) {
	Teacher teach = new Teacher();
    teach.setName("Malika");
    teach.setDesignation("English Teacher");
    teach.setAge(23);
        System.out.println(teach.getName()+" "+teach.getDesignation()+" "+teach.getAge());
    teach.toString();
        System.out.println("                                     ");

        Driver drive = new Driver();
        drive.setName("Bakyt");
        drive.setDesignation("Taxi driver");
        drive.setAge(36);
        System.out.println(drive.getName()+" "+drive.getDesignation()+" "+drive.getAge());
        drive.toString();
        System.out.println("                    ");

        Singer sing = new Singer();
        sing.setName("Mirbek");
        sing.setDesignation("Singing songs");
        sing.setAge(38);
        System.out.println(sing.getName()+" "+sing.getDesignation()+" "+sing.getAge());
        sing.toString();




    }
}

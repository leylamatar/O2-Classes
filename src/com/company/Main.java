package com.company;

public class Main {

    public static void main(String[] args) {
        courses course1 = new courses(22,"c#", "üctersiz"); //referans oluşturma , intanse
       

        courses course2 = new courses();
        course2.id = 33;
        course2.name = "java + react";
        course2.detail = "ücretsiz.";

        courses course3 = new courses();
        course3.id = 44;
        course3.name = "programlamaya giriş için temel kurs";
        course3.detail = "ücretsiz.";

        courses[] course = {course1,course2,course3};
        for (courses courses : course ){
            System.out.println("kurs id : "+courses.id);

            System.out.println("kurs ismi : "+courses.name);
            System.out.println("kurs detayı : "+courses.detail);
            System.out.println("------------------");
        }
        coursesManager coursesManagers = new coursesManager();
        coursesManagers.myCourse(course2);
        coursesManager othercourses = new coursesManager();
        othercourses.othercourses(course1);
        othercourses.othercourses(course3);




    }
}

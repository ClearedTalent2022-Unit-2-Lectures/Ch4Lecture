package org.launchcode;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        // Let's create an of the Student class, AKA a Student object
        Student jake = new Student("Jake", "Osborn", "Tom");
        System.out.println(jake.getFirstName());
        System.out.println(jake.getLastName());
        System.out.println(jake.getTA());

        // Here we reassign the value of TA using the setter to model
        // the fact that Jake switched from Tom's TA group to Amanda's
        jake.setTA("Amanda");
        System.out.println(jake.getTA());

        System.out.println(jake.studentInfo());

        Student joveth = new Student("Joveth", "Sampson", "Amanda");
        System.out.println(joveth.studentInfo());

        // Let's print the static courseName property from the
        // Student class to the console
        System.out.println(Student.courseName);

        // Now let's call the static courseInfo method from the Student class
        System.out.println(Student.courseInfo());

        // ------------------------------------------------
        // More instance method examples
//        String name = "JOVETH";
//        System.out.println(name.toLowerCase());
//        System.out.println(name.contains("O"));

        // Some static method examples
        // JavaScript: Math.random()
    }
}

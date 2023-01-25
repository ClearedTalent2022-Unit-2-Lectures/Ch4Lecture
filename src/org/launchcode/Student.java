package org.launchcode;

public class Student {
    // We need to think of this Student as a template/blueprint
    // for how all students will look in our application
    // firstName, lastName, TA
    // Some other examples that might be applicable:
    // location, branch, etc...

    // Can we think of any static properties that might be useful to include
    // in our Student class
    public static String courseName = "Cleared Talent CodeCamp 2022-23";

    // These are all instance properties

    private String firstName;
    private String lastName;
    private String TA;

    public Student(String firstName, String lastName, String TA) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.TA = TA;
    }

    // Getters are methods designed simply to allow us to read the value
    // of a private field

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTA() {
        return TA;
    }

    // Setters are method designed to allow us to reassign the value of a private
    // field

    public void setTA(String TA) {
        this.TA = TA;
    }

    public String studentInfo() {
        return firstName + " " +  lastName + " is in " + TA + "'s TA group.";
    }

    // Now let's create an example of a static method
    // This method could for example just return a nicely formatted
    // string that states the course name
    public static String courseInfo() {
        return "LaunchCode course name: " + courseName;
    }
}

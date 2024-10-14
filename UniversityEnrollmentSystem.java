// Base Class
class Person {
    // Private member variables 
    private String name;
    private int age;

    // Constructor to initialize the Person object
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display the name and age of the Person
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass of Person
class Student extends Person {
    // Private member variables
    private String studentID;
    private String course;
    private int units;
    private final int feePerUnit = 1000;

    // Constructor to initialize the Student object
    public Student(String name, int age, String studentID, String course, int units) {
        super(name, age);
        this.studentID = studentID;
        this.course = course;
        this.units = units;
    }

    // Method to calculate the total fee
    public double calculateFees() {
        return units * feePerUnit;
    }

    // Overriding displayinfo() to include student's details
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentID);
        System.out.println("Course: " + course);
        System.out.println("Units: " + units);
        System.out.println("Total Fee: " + calculateFees());
    }
}

class Instructor extends Person {
    private String employeeID;
    private String department;
    private double salary;

    public Instructor(String name, int age, String employeeID, String department, double salary) {
        super(name, age);
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Overriding displayinfo() to include instructor's details
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

public class UniversityEnrollmentSystem {
    public static void printDetails(Person p) {
        p.displayInfo();
    }

    public static void main(String[] args) {
        // Create two Student objects
        Student student1 = new Student("Roxane Ponegal", 20, "231000334", "Computer Engineering", 6);
        Student student2 = new Student("Kheam Airah Requinala", 19, "231000338", "Computer Studies", 4);

        // Create two Instructor objects
        Instructor instructor1 = new Instructor("Engr. Tanya Carmela Jovillano", 22, "I54321", "College of Engineering and Architecture", 65000);
        Instructor instructor2 = new Instructor("Engr. Mariam Angela Caning", 25, "I09876", "College of Engineering and Architecture", 70000);

        // Print details of all persons using polymorphism
        printDetails(student1);
        System.out.println("--------------------");
        printDetails(student2);
        System.out.println("--------------------");
        printDetails(instructor1);
        System.out.println("--------------------");
        printDetails(instructor2);
    }
}
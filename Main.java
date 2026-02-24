package org.example;

import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Repository repository = new Repository();

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");

            choice = readInt();

            switch (choice) {
                case 1 -> repository.addStudent(readStudent());
                case 2 -> displayStudents();
                case 3 -> System.out.println("Exiting program...");
                default -> System.out.println("Invalid choice.");
            }

        } while (choice != 3);

        scanner.close();
    }

    private static Student readStudent() {

        System.out.print("First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Middle Initial: ");
        String middleInitial = scanner.nextLine();

        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Age: ");
        int age = readInt();

        System.out.print("Course: ");
        String course = scanner.nextLine();

        System.out.print("Section: ");
        int section = readInt();

        System.out.print("Student Number: ");
        int studentNumber = readInt();

        System.out.print("Address: ");
        String address = scanner.nextLine();

        System.out.print("Phone Number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Enrolled? (Y/N): ");
        boolean isEnrolled = scanner.nextLine().equalsIgnoreCase("Y");

        return new Student.Builder()
                .setFirstName(firstName)
                .setMiddleInitial(middleInitial)
                .setLastName(lastName)
                .setAge(age)
                .setCourse(course)
                .setSection(section)
                .setStudentNumber(studentNumber)
                .setAddress(address)
                .setPhoneNumber(phoneNumber)
                .setIsEnrolled(isEnrolled)
                .build();
    }

    private static void displayStudents() {
        List<Student> students = repository.getAllStudents();

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        students.forEach(System.out::println);
    }

    private static int readInt() {
        while (!scanner.hasNextInt()) {
            System.out.print("Enter a valid number: ");
            scanner.next();
        }
        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }
}

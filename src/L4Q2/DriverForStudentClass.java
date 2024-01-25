package L4Q2;

import java.util.ArrayList;
import java.util.Collections;

// Driver Class
public class DriverForStudentClass
{
    // Header Method
    public static void myHeader(int labE_number, int q_number)
    {
        System.out.println("=======================================================");
        System.out.printf("Lab Exercise: %d-Q%d%n", labE_number, q_number);
        System.out.println("Prepared by: Tyler Liquornik");
        System.out.println("Student Number: 251271244");
        System.out.printf("Goal of this exercise: %s%n", "Comparisons with Collections.sort()");
        System.out.println("=======================================================");
    }

    // Footer Method
    public static void myFooter(int labE_number, int q_number)
    {
        System.out.println("=======================================================");
        System.out.printf("Completion of Lab Exercise %d-Q%d is successful!%n", labE_number, q_number);
        System.out.println("Signing off - Tyler");
        System.out.println("=======================================================");
    }

    // Driver method
    public static void main(String[] args)
    {
        // Print the header
        myHeader(3, 2);

        // Doubly Linked List to store data of type MyStudent
        ArrayList<Student> students = new ArrayList<>();

        // Populating the DLL
        students.add(new Student());
        students.add(new Student("Harry", "Potter", 75.5));
        students.add(new Student("Ron", "Weasley", 86.0));
        students.add(new Student("Hermoine", "Granger", 91.7));
        students.add(new Student("Parvati", "Patil", 93.75));

        // Print the score-card
        System.out.println("The Score Card: ");
        for (Student student : students)
        {
            System.out.println("\t" + student);
        }

        // Sort the list in descending order
        Collections.sort(students);
        Collections.reverse(students);

        // Print the score-card sorted by score
        System.out.println("\nThe sorted list in terms of score in descending order....");
        for (Student student : students)
        {
            System.out.println("\t" + student);
        }

        // Sort the list by last name
        Collections.sort(students, new HelperClassCompareLastNames());

        // Print the score-card sorted by last name
        System.out.println("\nThe sorted list in terms of last names....");
        for (Student student : students)
        {
            System.out.println("\t" + student);
        }

        // Sort the list by first name
        Collections.sort(students, new HelperClassCompareFirstNames());

        // Print the score-card sorted by first name
        System.out.println("\nThe sorted list in terms of first names....");
        for (Student student : students)
        {
            System.out.println("\t" + student);
        }

        // Print the footer
        myFooter(3, 2);
    }
}

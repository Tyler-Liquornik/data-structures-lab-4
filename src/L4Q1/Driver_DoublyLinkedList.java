package L4Q1;

public class Driver_DoublyLinkedList
{
    // Header Method
    public static void myHeader(int labE_number, int q_number)
    {
        System.out.println("=======================================================");
        System.out.printf("Lab Exercise: %d-Q%d%n", labE_number, q_number);
        System.out.println("Prepared by: Tyler Liquornik");
        System.out.println("Student Number: 251271244");
        System.out.printf("Goal of this exercise: %s%n", "Comparing Custom Objects");
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

    // Driver Method
    public static void main(String[] args)
    {
        // Print the header
        myHeader(3, 1);

        // Doubly Linked List to store data of type MyStudent
        DoublyLinkedList<MyStudent> TylerList = new DoublyLinkedList<>();

        // First 4 student objects are initialized and added to the DLL
        System.out.println("Adding 4 students to the list.");
        MyStudent s0 = new MyStudent();
        TylerList.addLast(s0);
        MyStudent s1 = new MyStudent("Harry", 67.35);
        TylerList.addLast(s1);
        MyStudent s2 = new MyStudent("Luna", 87.5);
        TylerList.addLast(s2);
        MyStudent s3 = new MyStudent("Vincent", 60.5);
        TylerList.addLast(s3);

        // Print the DLL
        System.out.printf("The list Content: %s%n", TylerList);

        // Info prompt
        System.out.println("Adding Hermione to the list in between Luna and Vincent.....");

        // Getting node 2 and 3
        DoublyLinkedList.Node<MyStudent> node2 = TylerList.findNode(s2);
        DoublyLinkedList.Node<MyStudent> node3 = TylerList.findNode(s3);

        // Initialize student
        MyStudent s4 = new MyStudent("Hermoine", 89.2);

        // Add the other student object between nodes 2 and 3
        TylerList.addBetween(s4, node2, node3);

        // Print the DLL
        System.out.printf("The list Content: %s%n", TylerList);

        // Print the footer
        myFooter(3,1 );
    }
}
package L4Q1;

import java.util.ArrayList;

// Doubly Linked List (Linked list able to be traversed linearly in both directions)
public class DoublyLinkedList<E>
{
    // Node Class
    public static class Node<E>
    {
        // Node Fields
        private E element;
        private Node<E> prev;
        private Node<E> next;

        // Node Custom Constructor
        public Node(E element, Node<E> prev, Node<E> next)
        {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }

        // Node Accessor
        public E getElement()
        {
            return element;
        }

        // Accessor for pointer to previous node

        public Node<E> getPrev()
        {
            return prev;
        }

        // Accessor for pointer to next node
        public Node<E> getNext() {
            return next;
        }

        // Mutator for pointer to previous node
        public void setPrev(Node<E> p) {
            prev = p;
        }

        // Mutator for pointer to next node
        public void setNext(Node<E> n) {
            next = n;
        }
    }

    // DLL fields

    private Node<E> header;
    private Node<E> trailer;
    private int size = 0;

    // DLL default constructor
    public DoublyLinkedList()
    {
        // Header and trailer contain no element, act solely as pointers
        header = new Node<>(null, null, null);
        trailer = new Node<>(null, header, null);
        header.setNext(trailer);
    }

    // DLL size
    public int size()
    {
        return size;
    }

    // Check if DLL size has no elements
    public boolean isEmpty()
    {
        return size == 0;
    }

    // Add node to the end of the DLL by putting it just before the trailer
    // Reminder that the trailer is a pointer to the last node and always null
    public void addLast(E e)
    {
        addBetween(e, trailer.getPrev(), trailer);
    }

    // Add a node between two other nodes
    public void addBetween(E e, Node<E> predecessor, Node<E> successor)
    {
        // Create the new node (incl pointers to prev and next nodes)
        Node<E> newest = new Node<>(e, predecessor, successor);

        // Change the previous and next nodes to point to new node
        predecessor.setNext(newest);
        successor.setPrev(newest);

        // Increment the size after having added a new node
        size++;
    }

    // Find the first node in a linear search whose element data matches the arguments
    public Node<E> findNode(E e)
    {

        // Pointer to current node
        Node<E> current = header;

        // Iterate through the node, checking for a successful match at each node
        for (int i = 0; i < size; i++)
        {
            // Move to the next node
            if (current.next != null)
                current = current.next;

            // Check for a match
            if (current.element.equals(e))
                return current;
        }

        // Flag return if no match found
        return null;
    }

    // Print the nodes as a stringified array
    public String toString()
    {

        // Dynamic array to track to populate with node values
        ArrayList<E> dynamicArr = new ArrayList<>();

        // Pointer to current node
        Node<E> current = header;

        // Iterate through the node, adding each element to the dynamic ArrayList
        for (int i = 0; i < size; i++)
        {
            // Move to the next node
            if (current.next != null)
                current = current.next;

            // Populate the array
            dynamicArr.add(i, current.getElement());
        }

        // Return the stringified array
        return dynamicArr.toString();
    }
}
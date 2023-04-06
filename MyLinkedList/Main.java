package MyLinkedList;
import java.util.LinkedList;

import static MyLinkedList.Node.reverseLinkedList;

class Main {
    public static void main(String[] args) {

        // Example of LinkedList to be reversed
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("First");
        linkedList.add("Second");
        linkedList.add("Third");
        linkedList.add("Fourth");
        linkedList.add("Fifth");
        System.out.println("LinkedList: " + linkedList);

        // Example of reversed LinkedList
        LinkedList<String> reversedLinkedList = reverseLinkedList(linkedList);
        System.out.println("Reversed LinkedList: " + reversedLinkedList);

        // Example of using Queue
        Queue<String> queue = new Queue<>();

        queue.enqueue("First in Queue");
        queue.enqueue("Second in Queue");
        queue.enqueue("Third in Queue");

        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("First element in queue: " + queue.first());
        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("First element in queue: " + queue.first());



    }

}
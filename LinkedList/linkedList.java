package LinkedList;

import java.util.LinkedList;
import java.util.PrimitiveIterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class linkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(1);
        ll.add(2);
        ll.add(3);

        System.out.println("this LinkedList > ");
        System.out.println(ll);

        queue(args);

        prtQueue(args);
    }

    public static void queue(String[] args) {
        Queue<Integer> qeInt = new LinkedList<Integer>();
        qeInt.add(1);
        qeInt.add(2);
        qeInt.add(5);

        /*Удаляет поледний элимент
        * добавленый в Queue => [1,2] 5 удалится */

        int item = qeInt.remove(); // first in, first out
        System.out.println("this Queue > ");
        System.out.println(qeInt);
    }

    public static void prtQueue(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.add(4);

        System.out.println("this PriorityQueue > ");
        System.out.println(pq);
    }

}


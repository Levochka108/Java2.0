package MyLinkedList;

import java.util.LinkedList;

public class NodeImpl<T> extends Node<T> {
        T item;
        MyLinkedList.Node<T> next;

    NodeImpl(T element, MyLinkedList.Node<T> next) {
        super(element);
        this.item = element;
            this.next = next;
        }
        public static <T> LinkedList<T> reverseLinkedList(LinkedList<T> linkedList) {
            // создаем новый связный список, куда добавим элементы в обратном порядке
            LinkedList<T> reversedLinkedList = new LinkedList<>();

            // получаем размер первоначального списка
            int size = linkedList.size();

            // добавляем элементы из первоначального связного списка в обратном порядке в новый связный список
            for (int i = size - 1; i >= 0; i--) {
                reversedLinkedList.add(linkedList.get(i));
            }

            return reversedLinkedList;
        }
    }

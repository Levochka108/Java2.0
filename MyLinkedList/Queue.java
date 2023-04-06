package MyLinkedList;
import java.util.LinkedList;
import java.util.NoSuchElementException;

class Queue<T> {
    Node<T> first; // Node для первого элемента очереди
    Node<T> last; // Node для последнего элемента очереди

    public void enqueue(T element) { // добавление элемента в конец очереди
        if (isEmpty()) {
            first = last = new Node<>(element);
        } else {
            Node<T> oldArgLast = last;
            last = new Node<>(element);
            oldArgLast.next = last;
        }
    }

    public T dequeue() { // удаление первого элемента из очереди
        if (isEmpty()) {
            throw new NoSuchElementException("Queue Underflow");
        } else {
            T element = first.item;
            if (first == last) {
                first = last = null;
            } else {
                first = first.next;
            }
            return element;
        }
    }

    public T first() { // получение первого элемента из очереди
        if (isEmpty()) {
            throw new NoSuchElementException("Queue Underflow");
        } else {
            return first.item;
        }
    }

    public boolean isEmpty() { // проверка на пустоту
        return first == null;
    }
}
class Node<T> {
    T item;
    Node<T> next;

    Node(T element) {
        this.item = element;
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
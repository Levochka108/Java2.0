package PriorityCollectionsJava;
import java.util.LinkedList;


/*
* Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
* Реализуйте очередь с помощью LinkedList со следующими методами:
* enqueue() - помещает элемент в конец очереди,
* dequeue() - возвращает первый элемент из очереди и удаляет его,
* first() - возвращает первый элемент из очереди, не удаляя.
*
* */
/*class SendMessage {
    String message;
    public SendMessage(String message) {
        this.message = message;
    }
    public static void main(String[] args) {
        //https://javarush.com/groups/posts/1938-linkedlist код писал по образу Car
        LinkedList<SendMessage> sendMessage = new LinkedList<>();
        SendMessage sendText1 = new SendMessage("Hello! This program is work!");
        SendMessage sendText2 = new SendMessage("Java is not easy languages.");
        SendMessage sendText3 = new SendMessage("But I'm happy that you are my teacher!");
        SendMessage sendTest4 = new SendMessage("What is developed in Java?");
        SendMessage sendTest5 = new SendMessage("I can master the visual part of the program. But the logic suffers a little. It's easier for me to look at an example and do something similar.");

        sendMessage.add(sendText1);
        sendMessage.add(sendText2);
        sendMessage.add(sendText3);
        System.out.println(sendMessage);

        sendMessage.addFirst(sendText3);
        sendMessage.addLast(sendTest5);
        System.out.println(sendMessage);

    }


    @Override // ?
    public String toString() {
        return "SendMessage{" +
                "message='" + message + '\'' +
                '}';
    }
}*/
class MyClass {
    static String message;

    public MyClass(String message) {
        MyClass.message = message;
    }

    public static void main(String[] args) {
        LinkedList<MyClass> inShop = new LinkedList<>();

/*

       inShop.add(client1);
        inShop.add(client2);
        inShop.add(client3);
        inShop.add(client4);
        inShop.add(client5);
        inShop.add(client6);
        inShop.add(client7);
        inShop.add(client8);
        inShop.add(client9);
*/
        System.out.println(inShop);

        for (int i = 1; i < 11; i++){
            MyClass myClass = new MyClass("Client "+ i);
            inShop.equals(myClass);
        }

        System.out.println(inShop);


    }

    public String toString() {
        return "Client{" +
                "count='" + message + '\'' +
                '}';

    }
}

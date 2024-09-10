package mylinkedlist;

public class Main {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        
        linkedList.addLast(4);
        linkedList.addLast(5);
        linkedList.addLast(6);
        linkedList.display();

        linkedList.deleteUseWhile(2);
        System.out.println("Chuoi sau khi xoa phan tu tai index 2:"); 
        linkedList.display();

        linkedList.sort();
        System.out.println("Chuoi sau khi sap xep:");
        linkedList.display();
    }
}

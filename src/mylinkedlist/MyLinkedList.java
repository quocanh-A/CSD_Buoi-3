package mylinkedlist;

public class MyLinkedList {
    private Node head;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;

    }

    public void add(int data, int index) {
        Node newNode = new Node(data);
        if (index == 0) {
            addFirst(data);
            return;
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node nextNode = temp.next;
            temp.next = newNode;
            newNode.next = nextNode;
        }
    }

    public int length() {
        int count = 0;
        if (head == null) {
            return 0;
        } else {
            Node temp = head;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
        }
        return count;
    }

    public void deleteFirst() {
        if (head == null) {
            return;
        } else {
            head = head.next;
        }
    }

    public void display() {
        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void deleteLast() {
        if (head == null)
            return;
        if (head.next == null) {
            deleteFirst();
            return;
        }
        Node temp = head;
        Node previous = null;
        while (temp.next != null) {
            previous = temp;
            temp = temp.next;
        }
        previous.next = null;
    }

    public void delete(int index) {
        if (index == 0) {
            deleteFirst();
            return;
        } else if (index == length() - 1) {
            deleteLast();
            return;
        } else {
            Node preNodeDelete = head;
            for (int i = 1; i < index; i++) {
                preNodeDelete = preNodeDelete.next;
            }
            preNodeDelete.next = preNodeDelete.next.next;
        }
    }

    public boolean search(int data) {
        if (head == null)
            return false;
        Node temp = head;
        while (temp != null) {
            if (temp.getData() == data)
                return true;
        }
        return false;
    }

    public Node searchAtPosition(int index) {
        if (index < 0 || index >= length())
            return null;
        Node temp = head;
        for (int i = 0; i <= index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // BTVN1: Viết hàm delete theo while
    public void deleteUseWhile(int index) {
        if (index == 0) {
            deleteFirst();
            return;
        } else if (index == length() - 1) {
            deleteLast();
            return;
        } else {
            Node preNodeDelete = head;
            int count = 1;

            while (count < index) {
                preNodeDelete = preNodeDelete.next;
                count++;
            }
            preNodeDelete.next = preNodeDelete.next.next;
        }
    }

    // BTVN2: Viết cho anh hàm sort()
    public void sort() {
        if (head == null || head.next == null) { 
            return;
        }
        for (Node i = head; i != null; i = i.next) {
            for (Node j = i.next; j != null; j = j.next) {
                if (i.data < j.data) { 
                    int temp = i.data;
                    i.data = j.data;
                    j.data = temp;
                }
            }
        }
    }
}

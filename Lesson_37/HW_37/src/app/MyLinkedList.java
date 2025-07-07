package app;

import app.model.Person;


public class MyLinkedList implements MyList {
    private Node head = null;
    private Node tail = null;
    private int size = 0;

    class Node {

        private Node prev;
        private Person value;
        private Node next;

        public Node(Node prev, Person value, Node next) {
            this.prev = prev;
            this.value = value;
            this.next = next;
        }
    }

    public Integer indexOf(Person person) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.value.equals(person)) {
                return index;
            }
            current = current.next;
            index++;

        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(Person person) {
        if (head == null) {
            Node node = new Node(null, person, null);
            head = node;
            tail = node;
        } else {
            Node node = new Node(tail, person, null);
            tail.next = node;
            tail = node;
        }
        size++;
    }

    @Override
    public Person get(int index) {
        if (index < 0 || index >= size) {
            return null;
        } else {
            return getNodeByIndex(index).value;
        }
    }

    private Node getNodeByIndex(int index) {
        Node currentNode = head;
        int counter = 0;
        while (counter < index && currentNode != null) {
            currentNode = currentNode.next;
            counter++;
        }
        return currentNode;
    }

    @Override
    public String toString() {
        String res = "";
        Node currentNode = head;
        while (currentNode != null) {
            res += currentNode.value + System.lineSeparator();
            currentNode = currentNode.next;
        }
        return res;
    }

    @Override
    public void add(Person person, int index) {
        if (index <= 0) {
            Node newNode = new Node(null, person, head);
            if (head != null) {
                head.prev = newNode;
            }
            head = newNode;
            if (tail == null) {
                tail = newNode;
            }
        } else {
            Node newNode = new Node(tail, person, null);
            if (tail != null) {
                tail.next = newNode;
            }
            tail = newNode;
            if (head == null) {
                head = newNode;
            }
        }
        size++;
    }


}
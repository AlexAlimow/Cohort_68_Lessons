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

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(Person person) {
        Node newNode = new Node(tail, person, null);
        if (tail != null) {
            tail.next = newNode;
        }
        tail = newNode;

        if (head == null) {
            head = newNode;
        }
        size++;
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
        } else if (index >= size) {
            add(person); // Добавляем в конец
        } else {
            Node currentNode = getNodeByIndex(index);
            Node newNode = new Node(currentNode.prev, person, currentNode);
            if (currentNode.prev != null) {
                currentNode.prev.next = newNode;
            } else {
                head = newNode;
            }
            currentNode.prev = newNode;
        }
        size++;
    }

    @Override
    public Person get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        return getNodeByIndex(index).value;
    }

    private Node getNodeByIndex(int index) {
        Node current = head;
        int i = 0;
        while (current != null && i < index) {
            current = current.next;
            i++;
        }
        return current;
    }

    @Override
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
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.value).append(System.lineSeparator());
            current = current.next;
        }
        return sb.toString();
    }
}

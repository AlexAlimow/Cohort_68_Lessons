package app;

import app.model.Product;

import java.util.Iterator;

public class MyLinkedList implements MyList {
    private Node head = null;
    private Node tail = null;
    private int size = 0;


    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(Product product) {
        if (head == null) {
            Node node = new Node(null, product, null);
            head = node;
            tail = node;
        } else {
            Node node = new Node(tail, product, null);
            tail.next = node;
            tail = node;
        }
        size++;
    }

    @Override
    public void add(Product product, int index) {
        if (index >= size) {
            add(product);
        } else if (index <= 0) {
            addFirst(product);
        } else {
            Node nextNode = getNodeByIndex(index);
            Node prevNode = nextNode.prev;
            Node newNode = new Node(prevNode, product, nextNode);

            prevNode.next = newNode;
            nextNode.prev = newNode;
            size++;
        }
    }

    private void addFirst(Product product) {
        Node newNode = new Node(null, product, head);
        head.prev = newNode;
        head = newNode;
        size++;

    }

    @Override
    public Product get(int index) {
        if (index < 0 || index >= size) {
            return null;
        } else {
            return getNodeByIndex(index).value;
        }

    }

    private Node getNodeByIndex(int index) {
        Node currenNode = head;
        int counter = 0;
        while (counter < index && currenNode != null) {
            currenNode = currenNode.next;
            counter++;
        }
        return currenNode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node currentNode = head;
        while (currentNode != null) {
            sb.append(currentNode.value).append(System.lineSeparator());
            currentNode = currentNode.next;
        }
        return sb.toString();
    }

    @Override
    public int indexOf(Product product) {
        Node currentNode = head;
        int index = 0;
        while (currentNode != null) {
            if (currentNode.value.equals(product)) {
                return index;
            }
            currentNode = currentNode.next;
            index++;
        }
        return -1;

    }

    @Override
    public Iterator<Product> iterator() {
        return new Iterator<Product>() {
            private Node current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public Product next() {
                Product value = current.value;
                current = current.next;
                return value;
            }
        };
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    class Node {

        private Node prev;
        private Product value;
        private Node next;

        public Node(Node prev, Product value, Node next) {
            this.prev = prev;
            this.value = value;
            this.next = next;
        }

    }


}


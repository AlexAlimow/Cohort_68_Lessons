package app;

import app.model.Product;

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
            size++;
            prevNode.next = newNode;
            newNode.prev = newNode;
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
        String res = "";
        Node currentNode = head;
        while (currentNode != null) {
            res += currentNode.value + System.lineSeparator();
            currentNode = currentNode.next;
        }
        return res;
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


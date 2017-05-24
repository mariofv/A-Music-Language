package data_structures;

public class AmlList<E> {
    private class Node {
        E element;
        Node next;
        Node previous;

        private Node(E element) {
            this.element = element;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public class Iterator {
        private Node n;

        private Iterator(Node n) {
            this.n = n;
        }

        public E getElement() {
            return n.element;
        }

        public boolean end() {
            return n == null;
        }

        public void next() {
            n = n.next;
        }

        public boolean equals(Iterator it) {
            return n == it.n;
        }
    }

    public AmlList() {
        size = 0;
    }

    public Iterator getFirst() {
        return new Iterator(first);
    }

    public void add(E element) {
        Node node = new Node(element);
        if (first == null) first = node;
        else {
            last.next = node;
            node.previous = last;
        }
        last = node;
        ++size;
    }

    public void remove(Iterator iterator) {
        Node node = iterator.n;
        assert node != null;

        if (node == first) first = node.next;
        else node.previous.next = node.next;

        if (node == last) last = node.previous;
        else node.next.previous = node.previous;

        --size;
    }

    public void addLeft(E data, Iterator iterator) {
        Node node = iterator.n;
        assert node != null;

        Node newNode = new Node(data);

        newNode.next = node;

        if (node == first) first = newNode;
        else {
            node.previous.next = newNode;
            newNode.previous = node.previous;
        }

        node.previous = newNode;
    }

    public int size() {
        return size;
    }
}

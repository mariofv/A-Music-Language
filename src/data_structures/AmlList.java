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
    }

    public void remove(Iterator iterator) {
        Node node = iterator.n;
        assert node != null;

        if (node == first) first = node.next;
        else node.previous.next = node.next;

        if (node == last) last = node.previous;
        else node.next.previous = node.previous;
    }
}

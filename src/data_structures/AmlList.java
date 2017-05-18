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
        Node n;

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
    }

    public Iterator getFirst() {
        return new Iterator(first);
    }

    public void add(E element) {
        if (first == null) {
            first = new Node(element);
            last = first;
            return;
        }
        Node node = new Node(element);
        last.next = node;
        node.previous = last;
        last = node;
    }

    public void remove(Iterator iterator) {
        Node node = iterator.n;
        assert node != null;
        if (first == node) {
            first = node.next;
        }
        if (last == node) {
            last = node.previous;
        }
        if (node.next != null) {
            node.next.previous = node.previous;
        }
        if (node.previous != null) {
            node.previous.next = node.next;
        }
    }
}

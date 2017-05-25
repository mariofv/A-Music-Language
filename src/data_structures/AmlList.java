package data_structures;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class AmlList<E> implements Iterable<E> {

    @Override
    public java.util.Iterator<E> iterator() {
        ListData node = new ListData(null);
        node.next = first;
        return new AmlIterator(node);
    }

    @Override
    public void forEach(Consumer<? super E> action) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Spliterator<E> spliterator() {
        throw new UnsupportedOperationException();
    }

    private class ListData {
        E element;
        ListData next;
        ListData previous;

        private ListData(E element) {
            this.element = element;
        }
    }

    private ListData first;
    private ListData last;
    private int size;

    public class Iterator {
        private ListData n;

        private Iterator(ListData n) {
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
        first = last = new ListData(null);
    }

    public Iterator getFirst() {
        return new Iterator(first);
    }

    public AmlIterator listIterator() {
        return new AmlIterator(first);
    }

    public void add(E element) {
        ListData node = new ListData(element);
        if (first == null) first = node;
        else {
            last.next = node;
            node.previous = last;
        }
        last = node;
        ++size;
    }

    public void remove(Iterator iterator) {
        ListData node = iterator.n;
        assert node != last;

        if (node == first) first = node.next;
        else node.previous.next = node.next;
        node.next.previous = node.previous;

        --size;
    }

    public void addLeft(E data, Iterator iterator) {
        ListData node = iterator.n;

        ListData newNode = new ListData(data);

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

    public class AmlIterator implements ListIterator<E> {

        private ListData node;

        public AmlIterator(ListData node) {
            this.node = node;
        }

        @Override
        public boolean hasNext() {
            return node.next != last;
        }

        @Override
        public E next() {
            node = node.next;
            return node.element;
        }

        @Override
        public boolean hasPrevious() {
            return node != first;
        }

        @Override
        public E previous() {
            node = node.previous;
            return node.element;
        }

        @Override
        public int nextIndex() {
            throw new UnsupportedOperationException();
        }

        @Override
        public int previousIndex() {
            throw new UnsupportedOperationException();
        }

        @Override
        public void remove() {
            assert node != null;

            if (node == first) first = node.next;
            else node.previous.next = node.next;
            if (node == last) last = node.previous;
            else node.next.previous = node.previous;

            --size;
            node = null;
        }

        @Override
        public void set(E e) {
            node.element = e;
        }

        @Override
        public void add(E e) {
            throw new UnsupportedOperationException();
        }

        public void addLeft(E e) {
            ListData newNode = new ListData(e);
            System.out.println("Adding at the left");
            newNode.next = node;

            if (node == first) {
                first = newNode;
                System.out.println("New first");
            }
            else {
                System.out.println("Node is not first");
                node.previous.next = newNode;
                newNode.previous = node.previous;
            }

            node.previous = newNode;
        }

        public boolean isLast() {
            return node == last;
        }

        public E getElement() {
            return node.element;
        }
    }

}

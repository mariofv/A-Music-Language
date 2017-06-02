package data_structures;

import java.util.ListIterator;
/*
import java.util.Spliterator;
import java.util.function.Consumer;
*/
public class AmlList<E> implements Iterable<E> {

    @Override
    public java.util.Iterator<E> iterator() {
        return new AmlIterator(first);
    }
/*
    @Override
    public void forEach(Consumer<? super E> action) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Spliterator<E> spliterator() {
        throw new UnsupportedOperationException();
    }
*/
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

    public AmlList() {
        size = 0;
        first = last = new ListData(null);
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

    public int size() {
        return size;
    }

    public class AmlIterator implements ListIterator<E> {

        private ListData node;

        private AmlIterator(ListData node) {
            this.node = node;
        }

        @Override
        public boolean hasNext() {
            return node != last;
        }

        @Override
        public E next() {
            E element = node.element;
            node = node.next;
            return element;
        }

        @Override
        public boolean hasPrevious() {
            throw new UnsupportedOperationException();
        }

        @Override
        public E previous() {
            throw new UnsupportedOperationException();
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
            assert node != last;

            if (node == first) first = node.next;
            else node.previous.next = node.next;
            node.next.previous = node.previous;

            --size;
            node = node.next;
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
            newNode.next = node;

            if (node == first) {
                first = newNode;
            }
            else {
                node.previous.next = newNode;
                newNode.previous = node.previous;
            }

            node.previous = newNode;
        }

        public boolean isEnd() {
            return node == last;
        }

        public E getElement() {
            return node.element;
        }
    }

}
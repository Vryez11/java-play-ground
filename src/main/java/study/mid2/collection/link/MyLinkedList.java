package main.java.study.mid2.collection.link;

public class MyLinkedList<E> {

    private Node<E> first;
    private int size = 0;

    public void add(E e) {
        Node<E> newNode = new Node<>(e);
        if (first == null) {
            first = newNode;
            size++;
            return;
        }

        Node<E> lastNode = getLastNode();
        lastNode.next = newNode;
        size++;
    }

    public void add(int index, E e) {
        Node<E> newNode = new Node<>(e);
        if (index == 0) {
            newNode.next = first;
            first = newNode;
            size++;
            return;
        }

        Node<E> prev = getNode(index - 1);
        newNode.next = prev.next;
        prev.next = newNode;
        size++;
    }

    public E set(int index, E e) {
        Node<E> node = getNode(index);
        E oldVlaue = node.getItem();
        node.setItem(e);
        return oldVlaue;
    }

    public E remove(int index) {
        Node<E> removeNode = getNode(index);
        E removedItem = removeNode.getItem();
        if (index == 0) {
            first = removeNode.next;
        } else {
            Node<E> prev = getNode(index - 1);
            prev.next = removeNode.next;
        }
        removeNode.setItem(null);
        removeNode.next = null;
        size--;
        return removedItem;
    }

    public E get(int index) {
        Node<E> node = getNode(index);
        return node.getItem();
    }

    public Node<E> getNode(int index) {
        Node<E> now = first;
        for (int i = 0; i < index; i++) {
            now = now.next;
        }
        return now;
    }

    public Node<E> getLastNode() {
        Node<E> now = first;

        while (now.next != null) {
            now = now.next;
        }
        return now;
    }

    public int indexOf(E e) {
        int index = 0;
        for (Node<E> now = first; now != null; now = now.next) {
            if (e.equals(now.getItem())) return index;
            index++;
        }

        return -1;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "first=" + first +
                ", size=" + size +
                "}";
    }
}

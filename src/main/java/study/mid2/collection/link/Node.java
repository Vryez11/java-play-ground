package main.java.study.mid2.collection.link;

public class Node<E> {

    private E item;
    public Node<E> next;

    public Node(E item) {
        this.item = item;
    }

    public E getItem() {
        return this.item;
    }

    public void setItem(E item) {
        this.item = item;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<E> x = this;
        sb.append("[");
        while (x != null) {
            sb.append(x.item);
            if (x.next != null) {
                sb.append("->");
            }
            x = x.next;
        }
        sb.append("]");
        return sb.toString();
    }
}

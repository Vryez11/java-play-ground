package main.java.study.mid2.collection.link;

public class NodeMain {

    public static void main(String[] args) {

        Node<Integer> firstNode = new Node<>(10);
        firstNode.next = new Node<>(100);
        firstNode.next.next = new Node<>(1000);

        System.out.println(firstNode);

        System.out.println("모든 노드 탐색하기");
        printAll(firstNode);

        Node<Integer> lastNode = getLastNode(firstNode);
        System.out.println("lastNode = " + lastNode);

        int index = 2;
        Node<?> index2Node = getNode(firstNode, index);
        System.out.println("index2Node = " + index2Node.getItem());

        System.out.println("데이터 추가하기");
        add(firstNode, 10000);
        System.out.println(firstNode);
    }

    private static void printAll(Node<?> node) {
        Node<?> now = node;
        while (now != null) {
            System.out.println(now.getItem());
            now = now.next;
        }
    }

    private static <E> Node<E> getLastNode(Node<E> node) {
        Node<E> now = node;
        while (now.next != null) {
            now = now.next;
        }
        return now;
    }

    private static Node<?> getNode(Node<?> node, int index) {
        Node<?> now = node;
        for (int i = 0; i < index; i++) {
            now = now.next;
        }
        return now;
    }

    private static <E> void add(Node<E> node, E item) {
        Node<E> lastNode = getLastNode(node);
        lastNode.next = new Node<>(item);
    }
}

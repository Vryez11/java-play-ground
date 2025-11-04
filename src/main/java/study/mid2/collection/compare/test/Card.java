package main.java.study.mid2.collection.compare.test;

public class Card implements Comparable<Card> {

    private final String emblem;
    private final int number;

    public Card(String emblem, int number) {
        this.emblem = emblem;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public int compareTo(Card o) {
        if (this.number == o.number) {
            return this.emblem.compareTo(o.emblem);
        }

        return Integer.compare(this.number, o.number);
    }

    @Override
    public String toString() {
        return number + "(" + emblem + ")";
    }
}

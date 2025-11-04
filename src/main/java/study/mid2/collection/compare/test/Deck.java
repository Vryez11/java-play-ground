package main.java.study.mid2.collection.compare.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> deck = new ArrayList<>();
    private int count;

    Deck() {
        for (int i = 1; i <= 13; i++) {
            deck.add(new Card("\u2660", i));
            deck.add(new Card("\u2665", i));
            deck.add(new Card("\u2666", i));
            deck.add(new Card("\u2663", i));
        }

        shuffleDeck();
        this.count = 0;
    }

    private void shuffleDeck() {
        Collections.shuffle(deck);
        this.count = 0;
    }

    public List<Card> divideDeck() {
        List<Card> cards = deck.subList(count, count + 5);
        count += 5;
        return cards;
    }
}

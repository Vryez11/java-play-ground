package main.java.study.mid2.collection.compare.test;

import java.util.Arrays;
import java.util.List;

public class Player {

    private List<Card> cards;
    private int numberSum = 0;
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public void receiveCards(List<Card> cards) {
        this.cards = cards;
        this.numberSum = 0;
        cards.sort(null);
        this.calculateSum();
    }

    public void showCards() {
        System.out.println(this.name + "의 카드:" + this.cards);
    }

    public void showResult(Player player) {
        if (this.numberSum > player.getNumberSum()) {
            System.out.println(this.name + " 승리");
        } else if (this. numberSum < player.getNumberSum()) {
            System.out.println(player.name + " 승리");
        } else {
            System.out.println("무승부");
        }
    }

    public int getNumberSum() {
        return numberSum;
    }

    private void calculateSum() {
        for (Card card : cards) {
            this.numberSum += card.getNumber();
        }
    }
}

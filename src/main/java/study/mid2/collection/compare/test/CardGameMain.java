package main.java.study.mid2.collection.compare.test;

public class CardGameMain {

    public static void main(String[] args) {

        Deck deck = new Deck();

        Player player1 = new Player("플레이어1");
        Player player2 = new Player("플레이어2");

        player1.receiveCards(deck.divideDeck());
        player2.receiveCards(deck.divideDeck());

        player1.showCards();
        player2.showCards();

        player1.showResult(player2);
    }
}

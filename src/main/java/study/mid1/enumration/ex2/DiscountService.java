package main.java.study.mid1.enumration.ex2;

public class DiscountService {

    public int discount(Grade grade, int price) {
        int discountPercent = 0;

        discountPercent = switch (grade) {
            case Grade.BASIC -> 10;
            case Grade.GOLD -> 20;
            case Grade.DIAMOND -> 30;
        };

        return price * discountPercent / 100;
    }
}

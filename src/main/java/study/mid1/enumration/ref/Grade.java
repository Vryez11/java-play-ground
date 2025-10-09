package main.java.study.mid1.enumration.ref;

public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30);

    private final int discountPercent;

    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return this.discountPercent;
    }

    public int discount(int price) {
        return price * this.discountPercent / 100;
    }
}

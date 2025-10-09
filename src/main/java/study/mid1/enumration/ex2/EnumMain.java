package main.java.study.mid1.enumration.ex2;

public class EnumMain {

    public static void main(String[] args) {

        int price = 10000;
        DiscountService service = new DiscountService();

        int basic = service.discount(Grade.BASIC, price);
        int gold = service.discount(Grade.GOLD, price);
        int diamond = service.discount(Grade.DIAMOND, price);

        System.out.println("basic = " + basic);
        System.out.println("gold = " + gold);
        System.out.println("diamond = " + diamond);
    }
}

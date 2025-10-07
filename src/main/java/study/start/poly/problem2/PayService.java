package main.java.study.start.poly.problem2;

import static main.java.study.start.poly.problem2.PayStore.findPay;

public class PayService {

    public void processPay(String option, int amount) {

        boolean result;
        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);

        Pay payment = findPay(option);

        result = payment.pay(amount);

        if (result) {
            System.out.println("결제가 성공했습니다.");
            return;
        }

        System.out.println("결제가 실패했습니다.");
    }
}

package main.java.study.adv3.optional.logger;

public class LogMain1 {

    static void main(String[] args) {

        Logger logger = new Logger();
        logger.setDebug(true);
        logger.debug(10  + 20);

        System.out.println("=== 디버그 모드 끄기 ===");
        logger.setDebug(false);
        logger.debug(100 + 200);
    }
}

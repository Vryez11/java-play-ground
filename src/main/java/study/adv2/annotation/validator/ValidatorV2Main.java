package main.java.study.adv2.annotation.validator;

import static main.java.study.adv2.annotation.validator.Validator.validator;
import static main.java.study.adv2.util.MyLogger.log;

public class ValidatorV2Main {

    public static void main(String[] args) {
        User user = new User("user1", 0);
        Team team = new Team("", 0);

        try {
            log("== user 검증 ==");
            validator(user);
        } catch (Exception e) {
            log(e);
        }

        try {
            log("== team 검증 ==");
            validator(team);
        } catch (Exception e) {
            log(e);
        }
    }
}

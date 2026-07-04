package main.java.study.adv3.optional;

import main.java.study.adv3.optional.model.Address;
import main.java.study.adv3.optional.model.User;

import java.util.Optional;

public class AddressMain2 {

    static void main(String[] args) {

        User user1 = new User("user1", null);
        User user2 = new User("user2", new Address("Hello Street"));

        printStreet(user1);
        printStreet(user2);
    }

    private static void printStreet(User user) {
        getUserStreet(user).ifPresentOrElse(
                System.out::println,
                () -> System.out.println("Unknown")
        );
    }

    static Optional<String> getUserStreet(User user) {
        return Optional.ofNullable(user)
                    .map(User::getAddress)
                    .map(Address::getStreet);
    }
}

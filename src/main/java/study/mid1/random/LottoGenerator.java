package main.java.study.mid1.random;

import java.util.Random;

public class LottoGenerator {

    private final Random random = new Random();
    private int[] lottoNumbers;
    private int count;

    public int[] generate() {
        lottoNumbers = new int[6];
        count = 0;

        while (count < 6) {
            int randomInt = random.nextInt(45) + 1;

            if (isUnique(randomInt)){
                lottoNumbers[count++] = randomInt;
            }
        }

        return lottoNumbers;
    }

    private boolean isUnique(int number) {
        if (count == 0) return true;

        for (int i = 0; i < count; i++) {
            if (lottoNumbers[i] == number) return false;
        }

        return true;
    }
}

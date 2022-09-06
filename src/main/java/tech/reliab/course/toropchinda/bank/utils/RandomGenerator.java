package tech.reliab.course.toropchinda.bank.utils;

import java.util.Random;

public class RandomGenerator {

    /**
     *
     * @param min
     * @param max
     * @return
     */
    public static int generateInt(int min, int max) {
        return new Random().nextInt(max - min + 1) + min;
    }

    /**
     *
     * @param min
     * @param max
     * @return
     */
    public static float generateFloat(int min, int max) {
        return new Random().nextFloat(max - min + 1) + min;
    }

    /**
     * pri nreitinge 100 skidka 50%
     * @param i
     * @param i1
     * @param rating
     * @return
     */
    public static float generateRateUseRating(int i, int i1, int rating) {
        float random = generateFloat(0, 20);
        return (float) (random * (1 - rating*0.5));
    }


}




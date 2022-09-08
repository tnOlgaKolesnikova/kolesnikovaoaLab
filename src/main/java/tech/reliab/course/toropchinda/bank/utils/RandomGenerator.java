package tech.reliab.course.toropchinda.bank.utils;

import java.util.Random;

public class RandomGenerator {

    /**
     * Генератор случайных значений
     *
     * @param min
     * @param max
     * @return
     */
    public static int generateInt(int min, int max) {
        return new Random().nextInt(max - min + 1) + min;
    }

    /**
     * Генерация процентной ставки на основе рейтинга банка
     *
     * @param rating Рейтинг от 0 до 100
     * @return
     */
    public static int generateRateUseRating(int min, int max, int rating) {
        int length = max-min;
        int exactRateByRating = (int) Math.ceil(rating / (100 / length));
        int inverseRateByRating = Math.abs(exactRateByRating-max);
        return generateInt(inverseRateByRating, inverseRateByRating);
    }

    /**
     * Генератор кредитного рейтинга без рандома на основе месячного дохода
     *
     * @param mountIncome месячный доход от 1 до 10000
     * @return
     */
    public static int generateCreditRating(int mountIncome) {
        return (int) Math.round(Math.ceil(mountIncome / 1000)) * 100;
    }

}




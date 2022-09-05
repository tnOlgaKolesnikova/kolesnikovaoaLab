package tech.reliab.course.toropchinda.bank.utils;

import java.util.Random;

public class RandomGenerator {

    public static int generate(int min, int max) {
        return new Random().nextInt(max - min + 1) + min;
    }

    public static byte generate(byte min, byte max) {
        int result = new Random().nextInt(max - min + 1) + min;
        return (byte) result;
    }
/*
    public static float generateRate(float maximum, byte rating) {
        /** Расчет допустимых границ ставки в зависимости от рейтинга*/
       /* float min =;
        float max =;
    }

}


package by.javatr.task2training.utils;

import by.javatr.task2training.entities.Colors;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomUtils {
    private static Random random = new Random();
    private static int borderOfWeight = 500;
    private static int borderOfCountBalls = 30;

    public static Colors getRandomColor() {
        List<Colors> colorsList = Arrays.asList( Colors.values() );
        return colorsList.get( random.nextInt( colorsList.size() ) );
    }

    public static float getRandomWeight() {
        return (float) (Math.random() * borderOfWeight);
    }

    public static int getRandomNumber() {
        return (int) (Math.random() * borderOfCountBalls);
    }
}

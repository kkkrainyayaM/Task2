package by.javatr.task2training.utils;

import by.javatr.task2training.entities.Color;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomUtils {
    private static Random random = new Random();
    private static final int BORDEROFWEIGHT = 500;
    private static final int BORDEROFCOUNT = 30;

    public static Color getRandomColor() {
        List<Color> colorsList = Arrays.asList( Color.values() );
        return colorsList.get( random.nextInt( colorsList.size() ) );
    }

    public static float getRandomWeight() {
        return (float) (Math.random() * BORDEROFWEIGHT);
    }

    public static int getRandomNumber() {
        return (int) (Math.random() * BORDEROFCOUNT);
    }
}

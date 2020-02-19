package by.javatr.task2training.util;

import by.javatr.task2training.entities.Colors;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomUtils {

    public static Colors getRandomColor() {
        Colors[] colors = Colors.values();
        Random random = new Random();
        List<Colors> colorsList = Arrays.asList( colors );
        Colors color = colorsList.get( random.nextInt( colorsList.size() ) );
        return color;
    }

    public static float getRandomWeight() {
        return (float) (Math.random() * 500);
    }

    public static int getRandomNumOfBalls() {
        return (int) (Math.random() * 30);
    }
}

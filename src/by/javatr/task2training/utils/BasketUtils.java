package by.javatr.task2training.utils;

import by.javatr.task2training.entities.Ball;
import by.javatr.task2training.entities.Basket;
import by.javatr.task2training.entities.Color;

public class BasketUtils {

    private BasketUtils() {
    }

    public static float getSumWeightOfBalls(Basket basket) {
        return (float) basket.getBalls().stream().mapToDouble( Ball::getWeight ).sum();
    }

    public static int getCountOfColorBalls(Basket basket, Color color) {
        return (int) basket.getBalls().stream().filter( ball -> color == ball.getColor() ).count();
    }

    public static int getCountOfBlueBalls(Basket basket) {
        return getCountOfColorBalls( basket, Color.BLUE );
    }
}

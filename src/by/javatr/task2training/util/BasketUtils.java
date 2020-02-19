package by.javatr.task2training.util;

import by.javatr.task2training.entities.Ball;
import by.javatr.task2training.entities.Basket;
import by.javatr.task2training.entities.Colors;

public class BasketUtils {

    private BasketUtils() {
    }

    public static int getWeight(Basket basket) {
        int weight = 0;
        for (Ball ball :
                basket.getBalls()) {
            weight += ball.getWeight();
        }
        return weight;
    }

    public static int getNumOfColorBalls(Basket basket, Colors color) {
        int num = 0;
        for (Ball ball :
                basket.getBalls()) {
            if( (ball.getColor() == color) ) {
                num++;
            }
        }
        return num;
    }

    public static int getNumOfBlueBalls(Basket basket) {
        return getNumOfColorBalls( basket, Colors.BLUE );
    }
}

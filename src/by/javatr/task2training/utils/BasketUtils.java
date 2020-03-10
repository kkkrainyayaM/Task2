package by.javatr.task2training.utils;

import by.javatr.task2training.entities.Basket;
import by.javatr.task2training.entities.Color;

public class BasketUtils {

    private BasketUtils() {
    }

    public static float getSumWeightOfBalls(Basket basket) {
        float sum = 0;
        while (basket.iterator().hasNext()) {
            sum += basket.iterator().next().getWeight();
        }
        return sum;
    }

    public static int getCountOfColorBalls(Basket basket, Color color) {
        int count = 0;
        while (basket.iterator().hasNext()) {
            if( basket.iterator().next().getColor().equals( color ) ) {
                count++;
            }
        }
        return count;
    }

    public static int getCountOfBlueBalls(Basket basket) {
        return getCountOfColorBalls( basket, Color.BLUE );
    }
}

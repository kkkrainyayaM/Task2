package by.javatr.task2training.runner;

import by.javatr.task2training.entities.Ball;
import by.javatr.task2training.entities.Basket;
import by.javatr.task2training.util.BasketUtils;
import by.javatr.task2training.entities.Colors;
import by.javatr.task2training.util.RandomUtils;

public class Main {

    public static void main(String[] args) {

        Basket basket = new Basket();

        for (int i = 0; i < RandomUtils.getRandomNumOfBalls(); i++) {

            Ball ball = new Ball( RandomUtils.getRandomWeight(), RandomUtils.getRandomColor() );
            basket.addBall( ball );
            System.out.println( "Ball (weight: " + ball.getWeight() + "; color: " + ball.getColor() + ") was added;" );

        }
        System.out.println( "Sum weight of balls in basket = " + BasketUtils.getWeight( basket ) );
        System.out.println( "Number of blue balls = " + BasketUtils.getNumOfBlueBalls( basket ) );
    }
}

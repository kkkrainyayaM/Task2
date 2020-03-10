package by.javatr.task2training.runner;

import by.javatr.task2training.entities.Ball;
import by.javatr.task2training.entities.Basket;
import by.javatr.task2training.exceptions.NegativeArgumentException;
import by.javatr.task2training.exceptions.NullBallException;
import by.javatr.task2training.utils.BasketUtils;
import by.javatr.task2training.utils.RandomUtils;

public class Main {

    public static void main(String[] args) {
        try {
            Basket basket = new Basket();
            int numOfBalls = RandomUtils.getRandomNumber();
            for (int i = 0; i < numOfBalls; i++) {

                Ball ball = new Ball( RandomUtils.getRandomWeight(), RandomUtils.getRandomColor() );
                basket.addBall( ball );
                System.out.println( ball.toString() + " was added;" );

            }
            System.out.println( "Sum weight of balls in basket = " + BasketUtils.getSumWeightOfBalls( basket ) );
            System.out.println( "Number of blue balls = " + BasketUtils.getCountOfBlueBalls( basket ) );
        }
        catch (NegativeArgumentException | NullBallException e) {
            e.printStackTrace();
        }
    }
}

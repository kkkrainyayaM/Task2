package by.javatr.task2training.runner;

import by.javatr.task2training.entities.Ball;
import by.javatr.task2training.entities.Basket;
import by.javatr.task2training.util.BasketUtil;
import by.javatr.task2training.entities.Colors;

public class Main {

    public static void main(String[] args) {

        Basket basket = new Basket();
        int numberOfBalls = (int) (Math.random()*30);

        for(int i = 0; i<numberOfBalls; i++){

            int weight = (int)(Math.random()*500);
            Ball ball = new Ball(weight, Colors.randomColor() );
            basket.addBall( ball );
            System.out.println( "Ball (weight: "+ ball.getWeight()+ "; color: "+ ball.getColor()+") was added;" );

        }
        System.out.println( "Sum weight of balls in basket = "+ BasketUtil.getWeight( basket ) );
        System.out.println( "Number of blue balls = "+ BasketUtil.getNumOfBlueBalls( basket ) );
    }
}

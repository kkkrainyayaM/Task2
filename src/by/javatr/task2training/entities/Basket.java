package by.javatr.task2training.entities;

import java.util.ArrayList;
import java.util.Objects;

public class Basket {

    private ArrayList<Ball> balls = new ArrayList<>();

    public ArrayList<Ball> getBalls() {
        return balls;
    }

    public void addBall(Ball ball) {
        balls.add( ball );
    }

    public Ball getBallByIndex(int index) {
        Ball ball = null;
        if( index >= 0 ) {
            ball = balls.get( index );
        }
        return ball;
    }


    @Override
    public boolean equals(Object o) {
        if( this == o ) return true;
        if( !(o instanceof Basket) ) return false;
        Basket basket = (Basket) o;
        return getBalls().equals( basket.getBalls() );
    }

    @Override
    public int hashCode() {
        return Objects.hash( getBalls() );
    }

    @Override
    public String toString() {
        return "Basket{" +
                "balls=" + balls +
                '}';
    }

}

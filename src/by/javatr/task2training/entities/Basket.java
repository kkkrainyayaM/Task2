package by.javatr.task2training.entities;

import java.util.ArrayList;
import java.util.Objects;

public class Basket {

    private ArrayList<Ball> basket = new ArrayList<>();

    public ArrayList<Ball> getBalls() {
        return basket;
    }

    public void addBall(Ball ball) {
        basket.add( ball );
    }

    public Ball getBallByIndex(int index) {
        if( index < 0 ) throw new IllegalArgumentException( "Index cannot be less 0" );
        return basket.get( index );
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
                "balls=" + basket +
                '}';
    }

}

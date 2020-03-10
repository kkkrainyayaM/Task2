package by.javatr.task2training.entities;

import by.javatr.task2training.exceptions.NegativeArgumentException;
import by.javatr.task2training.exceptions.NullBallException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Basket {

    private List<Ball> basket;

    public Basket(List<Ball> newBasket) {
        basket = newBasket;
    }

    public Basket() {
        basket = new ArrayList<>();
    }

    public Iterator<Ball> iterator() {
        return new BasketIterator();
    }

    private class BasketIterator implements Iterator<Ball> {
        private int index;

        public BasketIterator() {
            index = 0;
        }

        public boolean hasNext() {
            return index < basket.size();
        }

        public Ball next() {
            index++;
            return basket.get( index - 1 );
        }

        public void remove() {
            basket.remove( index - 1 );
            index--;
        }
    }

        /*public List<Ball> getBalls() {
            return basket;
        }*/

    public void addBall(Ball ball) throws NullBallException {
        if( ball == null ) throw new NullBallException( "Ball couldn't be null" );
        basket.add( ball );
    }

    public void addBall(Ball ball, int index) throws NullBallException {
        if( ball == null ) throw new NullBallException( "Ball couldn't be null" );
        basket.add( index, ball );
    }

    public Ball getBall(int index) throws NegativeArgumentException {
        if( index < 0 ) throw new NegativeArgumentException( "Index cannot be less 0" );
        return basket.get( index );
    }

    public void deleteBall(Ball ball) throws NullBallException {
        if( ball == null ) throw new NullBallException( "Ball couldn't be null" );
        basket.remove( ball );
    }

    public boolean hasBall(Ball ball) throws NullBallException {
        if( ball == null ) throw new NullBallException( "Ball couldn't be null" );
        return basket.contains( ball );
    }


    @Override
    public boolean equals(Object o) {
        if( this == o ) return true;
        if( o.getClass() != this.getClass() ) return false;
        Basket basket1 = (Basket) o;
        return basket.equals( basket1.basket );
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        return prime * result + basket.hashCode();
    }

    @Override
    public String toString() {
        return "Basket{" +
                "balls=" + basket +
                '}';
    }

}

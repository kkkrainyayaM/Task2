package by.javatr.task2training.entities;

import java.util.Objects;

public class Ball {
    private float weight;
    private Colors color;


    public Ball(float weight, Colors color) {
        if( weight < 0 ) throw new IllegalArgumentException( "Weight cannot be less 0" );
        this.weight = weight;
        this.color = color;
    }

    public Ball() {
        this.weight = 0;
        this.color = Colors.BLUE;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if( weight < 0 ) throw new IllegalArgumentException( "Weight cannot be less 0" );
        this.weight = weight;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }


    @Override
    public boolean equals(Object o) {
        if( this == o ) return true;
        if( !(o instanceof Ball) ) return false;
        Ball ball = (Ball) o;
        return getWeight() == ball.getWeight() &&
                getColor() == ball.getColor();
    }

    @Override
    public int hashCode() {
        return Objects.hash( getWeight(), getColor() );
    }

    @Override
    public String toString() {
        return "Ball{" +
                "weight=" + weight +
                ", color=" + color +
                '}';
    }
}

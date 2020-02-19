package by.javatr.task2training.entities;

import java.util.Objects;

public class Ball {
    private float weight;
    private Color color;


    public Ball(float weight, Color color) {
        if( weight < 0 ) throw new IllegalArgumentException( "Weight cannot be less 0" );
        this.weight = weight;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if( weight < 0 ) throw new IllegalArgumentException( "Weight cannot be less 0" );
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


    @Override
    public boolean equals(Object o) {
        if( this == o ) return true;
        if( !(o instanceof Ball) ) return false;
        Ball ball = (Ball) o;
        return weight == ball.weight &&
                color == ball.color;
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

package by.javatr.task2training.entities;

import by.javatr.task2training.exceptions.NegativeArgumentException;

public class Ball {
    private float weight;
    private Color color;

    public Ball(float weight, Color color) throws NegativeArgumentException {
        if( weight < 0 ) throw new NegativeArgumentException( "Weight cannot be less 0" );
        this.weight = weight;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(float weight) throws NegativeArgumentException {
        if( weight < 0 ) throw new NegativeArgumentException( "Weight cannot be less 0" );
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) throws NegativeArgumentException {
        if( color == null ) throw new NegativeArgumentException( "Color should be not null" );
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if( this == o ) return true;
        if( o.getClass() != this.getClass() ) return false;
        Ball ball = (Ball) o;
        return weight == ball.weight &&
                color == ball.color;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) weight;
        result = prime * result + color.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "weight=" + weight +
                ", color=" + color +
                '}';
    }
}

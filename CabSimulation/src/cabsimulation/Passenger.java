/*
I, Manan Patel, 000735153 certify that this material is my original work.
No other person's work has been used without due acknowledgement.

 */
package cabsimulation;

/**
 *
 * @author manan
 */
public class Passenger {

    private double weight;
    private boolean inFrontSeat;

    public Passenger(double weight, boolean front) {
        this.weight = weight;
        this.inFrontSeat = front;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isInFrontSeat() {
        return inFrontSeat;
    }

}

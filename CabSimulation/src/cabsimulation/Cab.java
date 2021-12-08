/*
I, Manan Patel, 000735153 certify that this material is my original work.
No other person's work has been used without due acknowledgement.

 */
package cabsimulation;

/**
 *
 * @author manan
 */
public class Cab {

    private static double companyTotalFare;
    private static double rate;
    private double taxiTotalFare;
    private int tripCounter;
    private int cabID;
    Passenger traveller;
    private double fare;
    private double daysTotal;

    public Cab(int cabID) {
        this.cabID = cabID;
    }

    public String pickUp(Passenger rider) {
        this.traveller = rider;
        tripCounter++;

        if (traveller.getWeight() >= 40 && traveller.isInFrontSeat() == true) {
            return String.format("Cab %d pickup %d. Passenger in front seat. Airbag is on.", cabID, tripCounter);

        } else if (traveller.getWeight() < 40 && traveller.isInFrontSeat() == true) {
            return String.format("Cab %d pickup %d. Passenger in front seat.", cabID, tripCounter);
        } else {
            return String.format("Cab %d pickup %d.", cabID, tripCounter);
        }

    }

    public boolean dropOff(int minutes) {
        fare = minutes * rate;
        taxiTotalFare = fare + taxiTotalFare;

        return true;
    }

    public void fareSum() {
        fare = (taxiTotalFare * fare / 100);
    }

    public void endOfShift() {
        companyTotalFare = companyTotalFare + taxiTotalFare;
    }

    public String report() {
        return String.format("Cab %d had %d trips and earned $%.2f (%.2f%% of day's total)", cabID, tripCounter, companyTotalFare, fare);
    }

    public static double getRate() {
        return rate;
    }

    public static void setRate(double rateT) {
        rate = rateT;
    }

}

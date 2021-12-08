/*
I, Manan Patel, 000735153 certify that this material is my original work.
No other person's work has been used without due acknowledgement.

 */
package cabsimulation;

import java.util.Scanner;

/**
 *
 * @author manan
 */
public class CabSimulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.printf("What is today's rate? ");
        double rate = input.nextDouble();
        Cab.setRate(rate);

        Cab cab01 = new Cab(1111);
        Cab cab02 = new Cab(2222);

        while (true) {
            System.out.printf("Which Cab? ");
            int cabID = input.nextInt();

            if (cabID == 1111 || cabID == 2222) {
                System.out.printf("New passenger weight(kg): ");
                double weight = input.nextDouble();

                System.out.printf("In front seat? (y/n) ");
                String front = input.next();

                Passenger traveller;

                if (front.equals("y")) {
                    traveller = new Passenger(weight, true);
                } else {
                    traveller = new Passenger(weight, false);
                }

                Cab cabNull = null;
                if (cabID == 1111) {
                    cabNull = cab01;
                }

                if (cabID == 2222) {
                    cabNull = cab02;
                }

                System.out.println(cabNull.pickUp(traveller));

                System.out.printf("How long is the trip in minutes? ");
                int time = input.nextInt();

                cabNull.dropOff(time);

            } 
            
            else {
                break;
            }
        }

        System.out.println("");

        cab01.endOfShift();
        cab01.fareSum();
        System.out.println(cab01.report());

        cab02.endOfShift();
        cab02.fareSum();
        System.out.println(cab02.report());

    }
}

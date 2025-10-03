
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double numGal;
        double mpg;
        double gasPrice;
        boolean goodGal = false;
        boolean goodMpg = false;
        boolean goodPrice = false;
        double mileCost;
        double distanceLeft;

        do {
            System.out.println("Enter the current number of gallons of gas in your vehicle: ");
            if(scan.hasNextDouble()) {

                if(numGal > 0)

                scan.nextLine();
                goodGal = true;
                    do {
                        System.out.println("Enter the fuel efficiency in MPG: ");
                        scan.nextLine();

                    if(scan.hasNextDouble()) {
                        mpg = scan.nextDouble();
                        scan.nextLine();
                        if(mpg > 0) {
                            goodMpg = true;
                        }

                            do {
                                System.out.println("Enter the current price for a gallon of gas: ");
                                scan.nextLine();
                                if (scan.hasNextDouble() && gasPrice > 0) {
                                    gasPrice = scan.nextDouble();
                                    scan.nextLine();
                                    goodPrice = true;


                                } else {
                                    System.out.println("Error: Invalid data type. Please try again.");
                                    scan.nextLine();
                                }
                            }while (!goodGal);
                        }
                    scan.nextLine();

                } while (!goodMpg);
                    mileCost = (100 / mpg) * gasPrice;
                    distanceLeft = numGal / mpg;
            }
        } while (!goodPrice);
        System.out.printf("Cost per 100 miles in $: %20.3f", mileCost);
        System.out.printf("Distance Left in Miles: %18.2f", distanceLeft);
    }
}


import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sideLength = 0;
        double sideWidth = 0;
        boolean valid;

        do {
            System.out.println("Enter length of rectangle: ");
            if (scan.hasNextDouble()) {
                sideLength = scan.nextDouble();
                valid = sideLength > 0;
                scan.nextLine();
                if (!valid)
                    System.out.println("Error, you have entered an invalid side length. Please try again.");
            } else {
                System.out.println("Invalid number format. Please try again.");
                scan.nextLine();
                valid = false;

            }
        } while (!valid);

        do {
            System.out.println("Enter width of rectangle:");
            do {
                System.out.println("Enter width of rectangle: ");
                if (scan.hasNextDouble()) {
                    sideWidth = scan.nextDouble();
                    valid = sideWidth > 0;
                    if (!valid)
                        System.out.println("Error, you have entered an invalid side width. Please try again.");
                } else {
                    System.out.println("Invalid number format. Please try again.");
                    scan.nextLine();
                    valid = false;
                }
            } while (!valid);

            double area = sideLength * sideWidth;
            double perimeter = 2 * (sideLength + sideWidth);
            double diagonal = Math.sqrt(Math.pow(sideLength, 2) + Math.pow(sideWidth, 2));

            System.out.printf("sideLength: 6%.2f/n", sideLength);
            System.out.printf("sideWidth: 6%.2f/n", sideWidth);
            System.out.printf("Area: 5%.2f/n", area);
            System.out.printf("Perimeter: 8%.2f/n", perimeter);
            System.out.printf("Diagonal: 7%.2f/n", diagonal);
        }





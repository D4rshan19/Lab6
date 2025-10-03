import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double userTemp = 0;
        boolean valid = false;

        do {
            System.out.println("Enter the temperature in degrees celsius");
            if(scan.hasNextDouble()) {
                userTemp = scan.nextDouble();
                scan.nextLine();
                valid = true;
            }
            else {
                System.out.println("Error: Invalid data type. Please try again.");
                scan.nextLine();
            }
        } while (!valid);

        double tempF = (userTemp * 9/5) + 32;
        System.out.printf("Degrees C: %6.2f", userTemp);
        System.out.printf("\nDegrees F: %6.2f" , tempF);
    }
}

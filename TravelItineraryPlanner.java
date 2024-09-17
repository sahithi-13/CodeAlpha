import java.util.*;

public class TravelItineraryPlanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your destination: ");
        String destination = scanner.nextLine();
        System.out.print("Enter your transportation mode: ");
        String transportationMode = scanner.nextLine();
        System.out.print("Enter your activity: ");
        String activity = scanner.nextLine();

        System.out.println("Itinerary for " + name);
        System.out.println("---------------------");
        System.out.println("Destination: " + destination);
        System.out.println("Transportation Mode: " + transportationMode);
        System.out.println("Activity: " + activity);

        System.out.print("Add more days to itinerary? (yes/no): ");
        String response = scanner.nextLine();
        while (response.equalsIgnoreCase("yes")) {
            System.out.print("Enter destination: ");
            destination = scanner.nextLine();
            System.out.print("Enter transportation mode: ");
            transportationMode = scanner.nextLine();
            System.out.print("Enter activity: ");
            activity = scanner.nextLine();
            System.out.println("Destination: " + destination);
            System.out.println("Transportation Mode: " + transportationMode);
            System.out.println("Activity: " + activity);
            System.out.print("Add more days to itinerary? (yes/no): ");
            response = scanner.nextLine();
        }
    }
}



























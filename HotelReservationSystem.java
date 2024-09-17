

import java.util.*;

public class HotelReservationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define hotel rooms
        String[] rooms = {"101", "102", "103", "104", "105"};

        // Define room types
        String[] roomTypes = {"Single", "Double", "Suite"};

        // Define room rates
        double[] roomRates = {100.0, 200.0, 500.0};

        // Initialize room status
        boolean[] roomStatus = new boolean[rooms.length];

        // Main menu
        while (true) {
            System.out.println("Hotel Reservation System");
            System.out.println("1. Check Availability");
            System.out.println("2. Make Reservation");
            System.out.println("3. Cancel Reservation");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkAvailability(rooms, roomStatus);
                    break;
                case 2:
                    makeReservation(rooms, roomTypes, roomRates, roomStatus, scanner);
                    break;
                case 3:
                    cancelReservation(rooms, roomStatus, scanner);
                    break;
                case 4:
                    System.out.println("Thank you for using the Hotel Reservation System!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Method to check room availability
    public static void checkAvailability(String[] rooms, boolean[] roomStatus) {
        System.out.println("Room Availability:");
        for (int i = 0; i < rooms.length; i++) {
            if (!roomStatus[i]) {
                System.out.println("Room " + rooms[i] + " is available.");
            } else {
                System.out.println("Room " + rooms[i] + " is not available.");
            }
        }
    }

    // Method to make a reservation
    public static void makeReservation(String[] rooms, String[] roomTypes, double[] roomRates, boolean[] roomStatus, Scanner scanner) {
        System.out.print("Enter room number: ");
        String roomNumber = scanner.next();
        System.out.print("Enter room type (Single/Double/Suite): ");
        String roomType = scanner.next();
        System.out.print("Enter number of nights: ");
        int nights = scanner.nextInt();

        int roomIndex = Arrays.asList(rooms).indexOf(roomNumber);
        if (roomIndex != -1 && !roomStatus[roomIndex]) {
            roomStatus[roomIndex] = true;
            System.out.println("Reservation made successfully!");
            System.out.println("Room Number: " + roomNumber);
            System.out.println("Room Type: " + roomType);
            System.out.println("Number of Nights: " + nights);
            System.out.println("Total Cost: " + roomRates[Arrays.asList(roomTypes).indexOf(roomType)] * nights);
        } else {
            System.out.println("Room not available!");
        }
    }

    // Method to cancel a reservation
    public static void cancelReservation(String[] rooms, boolean[] roomStatus, Scanner scanner) {
        System.out.print("Enter room number: ");
        String roomNumber = scanner.next();

        int roomIndex = Arrays.asList(rooms).indexOf(roomNumber);
        if (roomIndex != -1 && roomStatus[roomIndex]) {
            roomStatus[roomIndex] = false;
            System.out.println("Reservation cancelled successfully!");
        } else {
            System.out.println("Room not reserved!");
        }
    }
}

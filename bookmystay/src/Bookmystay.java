package PACKAGE_NAME;

public class Bookmystay {

    public static void main(String[] args) {

        String singleType = "Single Room";
        int singleBeds = 1;
        double singlePrice = 1000.0;
        int singleAvailable = 5;

        String doubleType = "Double Room";
        int doubleBeds = 2;
        double doublePrice = 2000.0;
        int doubleAvailable = 3;

        String suiteType = "Suite Room";
        int suiteBeds = 3;
        double suitePrice = 5000.0;
        int suiteAvailable = 2;

        System.out.println("===== HOTEL ROOM DETAILS =====\n");

        // Single Room
        System.out.println("Room Type: " + singleType);
        System.out.println("Beds: " + singleBeds);
        System.out.println("Price per Night: ₹" + singlePrice);
        System.out.println("Available: " + singleAvailable);
        System.out.println("---------------------------");

        // Double Room
        System.out.println("Room Type: " + doubleType);
        System.out.println("Beds: " + doubleBeds);
        System.out.println("Price per Night: ₹" + doublePrice);
        System.out.println("Available: " + doubleAvailable);
        System.out.println("---------------------------");

        // Suite Room
        System.out.println("Room Type: " + suiteType);
        System.out.println("Beds: " + suiteBeds);
        System.out.println("Price per Night: ₹" + suitePrice);
        System.out.println("Available: " + suiteAvailable);
        System.out.println("---------------------------");

        System.out.println("\nProgram Terminated.");
    }
}
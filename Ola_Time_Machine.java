import java.util.Scanner;

public class TimeTravel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("🚀 Welcome to the Time Travel Simulator! 🚀");
        System.out.print("Enter your name, Time Traveler: ");
        String name = scanner.nextLine();

        System.out.println("\nHello, " + name + "! Where would you like to go?");
        System.out.println("1. Travel to the Future 🚀");
        System.out.println("2. Travel to the Past ⏳");
        System.out.print("Choose (1 or 2): ");
        int choice = scanner.nextInt();

        System.out.print("\nHow many years do you want to travel? ");
        int years = scanner.nextInt();

        int currentYear = java.time.Year.now().getValue();  // Get current year
        int newYear = (choice == 1) ? (currentYear + years) : (currentYear - years);

        System.out.println("\n⏳ Calculating time jump...\n");
        try {
            Thread.sleep(3000); // Simulate time travel delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("🌟 You have arrived in the year " + newYear + "! 🌟");

        // Fun message based on the year
        if (newYear > currentYear) {
            System.out.println("Welcome to the future! Are there flying cars yet? 🚗💨");
        } else {
            System.out.println("Welcome to the past! Don't mess with history! 🏛️");
        }

        scanner.close();
    }
}

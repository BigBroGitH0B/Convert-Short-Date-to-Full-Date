import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AssignOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a short date
        System.out.print("Enter a short date (YYYY-MM-DD): ");
        String shortDate = scanner.nextLine();

        // Validate the input format
        if (isValidShortDate(shortDate)) {
            // Extract year, month, and day
            int year = Integer.parseInt(shortDate.substring(0, 4));
            int month = Integer.parseInt(shortDate.substring(5, 7));
            int day = Integer.parseInt(shortDate.substring(8, 10));

            // Convert month number to month name
            String monthName = getMonthName(month);

            // Display the full date representation
            System.out.println("Full Date: " + monthName + " " + day + ", " + year);
        } else {
            System.out.println("Invalid short date format. Please enter in the format YYYY-MM-DD.");
        }

        scanner.close();
    }

    private static boolean isValidShortDate(String shortDate) {
        // Validate the format using a simple regex
        return shortDate.matches("\\d{4}-\\d{2}-\\d{2}");
    }

    private static String getMonthName(int month) {
        String[] monthNames = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};

        // Ensure the month number is within a valid range
        if (month >= 1 && month <= 12) {
            return monthNames[month - 1];
        } else {
            return "Invalid Month";
        }
    }
}
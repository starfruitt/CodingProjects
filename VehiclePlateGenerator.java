import java.util.Random;

public class VehiclePlateGenerator {
    public static void main(String[] args) {
        Random random = new Random();

        // Generate three random uppercase letters
        char letter1 = (char) ('A' + random.nextInt(26));
        char letter2 = (char) ('A' + random.nextInt(26));
        char letter3 = (char) ('A' + random.nextInt(26));

        // Generate four random digits
        int digit1 = random.nextInt(10);
        int digit2 = random.nextInt(10);
        int digit3 = random.nextInt(10);
        int digit4 = random.nextInt(10);

        // Combine letters and digits into a plate number
        String plateNumber = "" + letter1 + letter2 + letter3 + digit1 + digit2 + digit3 + digit4;

        // Display the plate number
        System.out.println("Generated vehicle plate number: " + plateNumber);
    }
}
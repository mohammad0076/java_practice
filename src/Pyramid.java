public class Pyramid {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); // Print asterisk without moving to a new line
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}

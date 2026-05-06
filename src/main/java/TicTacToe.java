import java.util.Scanner;

public class TicTacToe {

    public static int getUserSlot() {
        Scanner scanner = new Scanner(System.in);
        int slot;

        while (true) {
            System.out.print("Enter slot number (1-9): ");

            if (scanner.hasNextInt()) {
                slot = scanner.nextInt();

                if (slot >= 1 && slot <= 9) {
                    return slot;
                }
            } else {
                scanner.next();
            }

            System.out.println("Invalid input. Try again.");
        }
    }

    public static void main(String[] args) {


        int userSlot = getUserSlot();

        System.out.println("User selected slot: " + userSlot);
    }
}
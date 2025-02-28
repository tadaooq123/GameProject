package HW1;
import java.util.*;

public class GameSimulation {
    public static void main(String[] args) {
        GameEventManager gameEventManager = new GameEventManager();

        GameObserver warrior = new Warrior();
        GameObserver mage = new Mage();
        GameObserver archer = new Archer();

        gameEventManager.addPlayer(warrior);
        gameEventManager.addPlayer(mage);
        gameEventManager.addPlayer(archer);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Trigger Game Event");
            System.out.println("2. Add New Player");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter event description: ");
                String event = scanner.nextLine();
                gameEventManager.notifyPlayers(event);
            } else if (choice == 2) {
                System.out.println("Adding a new Class dynamically!");
                GameObserver newClass = new Class();
                gameEventManager.addPlayer(newClass);
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Invalid choice! Try again.");
            }
        }
        scanner.close();
    }
}

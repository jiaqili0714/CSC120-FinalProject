import java.util.Scanner;
import java.util.HashMap;

public class MyThread extends Thread {
    private boolean running;
    private boolean paused;
    private HashMap<String, Integer> inventory;

    public void startThread() {
        running = true;
        start();
    }

    public void pauseThread() {
        paused = true;
    }

    public void resumeThread() {
        paused = false;
    }

    public void stopThread() {
        running = false;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (running) {
            if (!paused) {
                String input = scanner.nextLine();
                if (input.equals("r")) {
                    System.out.println("Enter the name of the item you want to remove:");
                    String itemToRemove = scanner.nextLine();
                    if (inventory.containsKey(itemToRemove)) {
                        inventory.remove(itemToRemove);
                        System.out.println(itemToRemove + " has been removed from your inventory.");
                    } else {
                        System.out.println("You do not have " + itemToRemove + " in your inventory.");
                    }
                }
            }
        }
    }
}
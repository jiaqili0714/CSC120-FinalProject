import java.util.Scanner;

public class Game {

    private Scanner scanner = new Scanner(System.in);

    public void pressReturn(){
        System.out.println("Press `return` to continue...");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
        }
    }
    

}

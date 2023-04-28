import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dialogue dialogue = new Dialogue();
        Scanner scanner = new Scanner(System.in);

        System.out.println("  ");
        System.out.println("Welcome to the Castle of Hearts a legendary castle known for its magical power to bring true love to those who are worthy.");
        System.out.println("   /\\  ");
        System.out.println("  /  \\ ");
        System.out.println(" /    \\ ");
        System.out.println("/______\\");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("|  ❤️   |");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("|______|");

        System.out.println("  ");

        System.out.println("Please enter your name:");
        String travelerName = scanner.nextLine();
        System.out.println("Please enter your pronouns:");
        String travelerPronouns = scanner.nextLine();
        System.out.println("Nice to meet you Traveler "+ travelerName + ". " + "Your pronuous are: " + travelerPronouns);
        System.out.println("  ");


        System.out.println("Press `return` to continue...");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
        }

        System.out.println("  ");
        System.out.println("As you enter the castle, you encounter the charming and mysterious Lord, the owner of the castle. Nathaniel is known for his wit, intellect, and aloof demeanor. Intrigued by his enigmatic presence, you are determined to win his heart and embark on a quest to earn his affection.");
        System.out.println("  ");
        System.out.println("  ");

        System.out.println("-------------- Scene 1: Entering the Castle --------------");
        System.out.println("    ");
        System.out.println(" ");

        System.out.println("░█████╗░██╗░░░░░░█████╗░██╗░░░██╗██████╗░░██████╗  ██╗░░██╗███████╗██████╗░███████╗");
        System.out.println("██╔══██╗██║░░░░░██╔══██╗██║░░░██║██╔══██╗██╔════╝  ██║░░██║██╔════╝██╔══██╗██╔════╝");
        System.out.println("██║░░╚═╝██║░░░░░██║░░██║██║░░░██║██║░░██║╚█████╗░  ███████║█████╗░░██████╔╝█████╗░░");
        System.out.println("██║░░██╗██║░░░░░██║░░██║██║░░░██║██║░░██║░╚═══██╗  ██╔══██║██╔══╝░░██╔══██╗██╔══╝░░");
        System.out.println("╚█████╔╝███████╗╚█████╔╝╚██████╔╝██████╔╝██████╔╝  ██║░░██║███████╗██║░░██║███████╗");
        System.out.println("░╚════╝░╚══════╝░╚════╝░░╚═════╝░╚═════╝░╚═════╝░  ╚═╝░░╚═╝╚══════╝╚═╝░░╚═╝╚══════╝");

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("The sky was shrouded in heavy clouds as the traveler made their way towards the Castle of Hearts. A chilly breeze swept through the air, causing the traveler to wrap their cloak tightly around their shoulders, the anticipation building in their chest.");

    }
}

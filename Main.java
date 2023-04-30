import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Dialogue dialogue = new Dialogue();
        Game game = new Game();
        Inventory inventory = new Inventory();
        MyThread myThread = new MyThread();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> userChoices = new ArrayList<Integer>();



        

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


        game.pressReturn();

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
        System.out.println(" ");
        
        game.pressReturn();

        System.out.println("As they approached the castle gates, the rain began to drizzle, adding to the eerie atmosphere. The traveler couldn't help but feel a sense of trepidation mixed with curiosity. What secrets did the castle hold? What mysteries awaited them within its walls?");
        System.out.println(" ");

        game.pressReturn();

        System.out.println("With each step, the traveler's mind raced with questions. They wondered about the curse that was said to plague the castle, and about the enigmatic Nathaniel, the master of the castle, whom they were about to meet. They wondered what lay ahead, and whether they were prepared for the challenges that awaited them.");
        System.out.println(" ");

        game.pressReturn();

        System.out.println("Inside, their inner voice urged them to be cautious, to tread carefully, and to stay vigilant. They knew that Nathaniel was known for his aloof demeanor and guarded heart, and winning his trust would not be easy. But they were determined to uncover the truth.");
        System.out.println(" ");

        game.pressReturn();

        System.out.println("As they approached the castle entrance, the traveler's heart quickened with anticipation. They took a deep breath, steeling themselves for what lay ahead. The rain dripped from their cloak as they reached out to open the castle doors, their mind racing with curiosity, nerves, and a longing for adventure.");
        System.out.println(" ");
        System.out.println(" ");
        game.pressReturn();

        System.out.println("\uD83E\uDD34" + ": " + "Welcome to the Castle of Hearts, traveler. I am Lord Nathaniel. What business do you have here?");
        String[] choices1 = {"I seek shelter from the storm. Your castle seemed like the safest option.", "I heard tales of the legendary Castle of Hearts and its magical power to bring true love. I came to see it for myself.", "None of your business. I'm just passing through.","I'm here to explore and uncover the secrets of this castle."};
        int[] points1 = {5, 0, 2,5};
        int pointsEarned1 = dialogue.displayDialogueWithChoices("Choose what you want to respond:)", choices1, points1,userChoices);
        //System.out.println("arraylist size: " + userChoices.size());
        String[] responses1 = {"Very well. You may stay for the night, but do not overstay your welcome.","Ah, another one seeking fairy tale endings, I see. Well, don't get your hopes up too soon. The castle's power is not for the faint-hearted or the unworthy.","Is that so? Well, be careful where you tread in this castle. Some secrets are best left undisturbed.","Curious, aren't you? The castle holds many secrets, but not all are meant to be discovered by outsiders."};
        dialogue.displayDialogueResponse(responses1,userChoices);


        

    }
}


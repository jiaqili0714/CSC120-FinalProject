import java.util.Scanner;
import java.util.ArrayList;

public class Dialogue {

    private Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> userChoices = new ArrayList<Integer>();
    private int redoCounter = 0;


    // method for displaying simple text dialogue
    public void displayDialogue(String text) {
        System.out.println(text);
    }

    // method for displaying dialogue with choices and returning user's response
    public int displayDialogueWithChoices(String text, String[] choices, int[] points, ArrayList<Integer> userChoices) {
        System.out.println(text);
        for (int i = 0; i < choices.length; i++) {
            System.out.println((i + 1) + ". " + choices[i]);
        }
        int choice = scanner.nextInt();
        while (choice < 1 || choice > choices.length) {
            System.out.println("Invalid choice. Please enter a number between 1 and " + choices.length + ".");
            choice = scanner.nextInt();
        }
        System.out.println("You chose: " + choices[choice-1]);
        System.out.println("You earned " + points[choice-1] + " points.");
        userChoices.add(choice);
        return points[choice - 1];
    }

    public void displayDialogueResponse(String[] responses, ArrayList<Integer> userChoices) {
        int lastChoice = userChoices.get(userChoices.size() - 1);
        System.out.println(responses[lastChoice - 1]);
        }

    
        
    

//testing
public static void main(String[] args) {
    Dialogue dialogue = new Dialogue();
    ArrayList<Integer> userChoices = new ArrayList<Integer>();
    int totalPoints = 0;

    // Conversation 1: Simple text dialogue
    dialogue.displayDialogue("Hello, welcome to our game!");

    // Conversation 2: Dialogue with choices and points
    String[] choices1 = {"Choice 1", "Choice 2", "Choice 3"};
    int[] points1 = {10, 20, 30};
    int pointsEarned1 = dialogue.displayDialogueWithChoices("What is your favorite choice?", choices1, points1,userChoices);
    totalPoints += pointsEarned1;



    // Conversation 3: Dialogue with choices and points
    String[] choices2 = {"Choice A", "Choice B", "Choice C"};
    int[] points2 = {5, 15, 25};
    int pointsEarned2 = dialogue.displayDialogueWithChoices("What is your second favorite choice?", choices2, points2,userChoices);
    totalPoints += pointsEarned2;

    // Conversation 4: Simple text dialogue
    dialogue.displayDialogue("Thanks for playing! Your total points earned are: " + totalPoints);
}
}
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
        int totalPoints = 0;  
        int redoCounter = 0;

        Thread inputThread = new Thread(() -> {
            while (true) {
                String input = scanner.nextLine();
                if (!input.isEmpty() && !input.matches("[0-9]+|[yYnN]")) {
                    System.out.println("  ");
                    System.out.println("  ");
                    System.out.println("*** This is a dialogue game, so you don't have any command to use unless we instruct you do so ***");
                    System.out.println("  ");
                    System.out.println("  ");
                }
            }
        });
        inputThread.start();

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

        //Choice 1
        System.out.println("\uD83E\uDD34" + ": " + "Welcome to the Castle of Hearts, traveler. I am Lord Nathaniel. What business do you have here?");
        String[] choices1 = {"I seek shelter from the storm. Your castle seemed like the safest option.", "I heard tales of the legendary Castle of Hearts and its magical power to bring true love. I came to see it for myself.", "None of your business. I'm just passing through.","I'm here to explore and uncover the secrets of this castle."};
        int[] points1 = {5, 0, 2,5};
        int pointsEarned1 = dialogue.displayDialogueWithChoices("Choose what you want to respond:)", choices1, points1,userChoices);
        //System.out.println("arraylist size: " + userChoices.size());
        String[] responses1 = {"\uD83E\uDD34" + ": " + "Very well. You may stay for the night, but do not overstay your welcome.","\uD83E\uDD34" + ": " + "Ah, another one seeking fairy tale endings, I see. Well, don't get your hopes up too soon. The castle's power is not for the faint-hearted or the unworthy.","\uD83E\uDD34" + ": " + "Is that so? Well, be careful where you tread in this castle. Some secrets are best left undisturbed.","\uD83E\uDD34" + ": " + "Curious, aren't you? The castle holds many secrets, but not all are meant to be discovered by outsiders."};
        System.out.println("");
        dialogue.displayDialogueResponse(responses1,userChoices);
        totalPoints += pointsEarned1;
        
        //redo option
        if (redoCounter == 0) {
            // ask the user if they want to redo their choices
            System.out.println("Do you want to redo your choices? (y/n)" + "  You only have 1 opportunity to redo choices throughout the game, so use it wisely!");

            // get the user's response
            String input = scanner.nextLine().toLowerCase();

            if (input.equals("y")) {
                // increment the redo counter
                redoCounter++;
                //return the totalPoints back to its original state
                totalPoints -=pointsEarned1;
                System.out.println("");
                System.out.println("Now you may redo your choice");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                // display the dialogue and choices again
                int pointsEarned1_redo = dialogue.displayDialogueWithChoices("Choose what you want to respond:)", choices1, points1,userChoices);
                System.out.println("");
                dialogue.displayDialogueResponse(responses1,userChoices);
                totalPoints += pointsEarned1_redo;
            }
         if(input.equals("n")){
            System.out.println("You still have 1 opportunity left to redo your choices");
        }
    }

        game.pressReturn();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("-------------- Scene 2: Next Morning --------------");
        System.out.println("    ");
        System.out.println(" ");
        System.out.println("Greeted by a solemn-faced servant who led them through the grand hallways to their bedroom. The castle's interior was opulent, with intricate tapestries adorning the walls and the soft glow of candlelight casting flickering shadows.");
        System.out.println(" ");
        game.pressReturn();
        System.out.print("The servant showed them to a cozy room with a large, canopied bed, and bid them goodnight before leaving. Alone in the unfamiliar surroundings, the traveler felt a mixture of nervousness and excitement. The weight of the castle's secrets and Nathaniel's enigmatic presence lingered in their mind.");
        System.out.println(" ");
        game.pressReturn();
        System.out.println("As they settled into the plush bed, their thoughts raced. What would tomorrow bring? Would they be able to uncover the truth about the castle's curse and Nathaniel's aloof demeanor? Could they win his trust and unravel the mysteries that shrouded the Castle of Hearts?");
        System.out.println(" ");
        game.pressReturn();



        System.out.println("  ");
        System.out.println("        \\     (      /");
        System.out.println("   `.    \\     )    /    .'");
        System.out.println("     `.   \\   (    /   .'");
        System.out.println("       `.  .-''''-.  .'");
        System.out.println(" `~._    .'/_    _\\`.    _.~'");
        System.out.println("     `~ /  / \\  / \\  \\ ~'");
        System.out.println("_ _ _ _|  _\\O/  \\O/_  |_ _ _ _");
        System.out.println("       | (_)  /\\  (_) |");
        System.out.println("    _.~ \\  \\      /  / ~._");
        System.out.println(".~'     `. `.__.' .'     `~.");
        System.out.println("       .'  `-,,,,-'  `.");
        System.out.println("     .'   /    )   \\   `.");
        System.out.println("   .'    /    (     \\    `.");
        System.out.println("        /      )     \\     ");

        System.out.println("--------------  Next Day --------------");
        game.pressReturn();

        System.out.println("The traveler woke up to the sound of a gentle knock on their chamber door. Rubbing their eyes, they opened the door to find Nathaniel standing there, dressed in a crisp suit, with a warm smile on his face.");
        System.out.println("  ");
        game.pressReturn();
        System.out.println("\uD83E\uDD34" + ": " + "Good morning! I hope you slept well.");

        //Choice 2
        String[] choices2 = {"Yes, thank you. The bed was quite comfortable.", "I didn’t give your permission to enter my room, though you did knock on the door…"};
        int[] points2 = {3, 5};
        int pointsEarned2 = dialogue.displayDialogueWithChoices("Choose what you want to respond:)", choices2, points2,userChoices);
        String[] responses2 = {"\uD83E\uDD34" + ": " +"I'm glad to hear that. I thought we could have breakfast together and then I can show you around the castle.","I see you're not easily intimidated. You have a sharp tongue, traveler." ,"\uD83E\uDD34" + ": " +"I thought we could have breakfast together and then I can show you around the castle."};
        dialogue.displayDialogueResponse(responses2,userChoices);
        totalPoints += pointsEarned2;
        game.pressReturn();

        //redo option
        if (redoCounter == 0) {
            // ask the user if they want to redo their choices
            System.out.println("Do you want to redo your choices? (y/n)" + "  You only have 1 opportunity to redo choices throughout the game, so use it wisely!");

            // get the user's response
            String input = scanner.nextLine().toLowerCase();

            if (input.equals("y")) {
                // increment the redo counter
                redoCounter++;
                //return the totalPoints back to its original state
                totalPoints -=pointsEarned1;
                System.out.println("");
                System.out.println("Now you may redo your choice");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                // display the dialogue and choices again
                int pointsEarned2_redo = dialogue.displayDialogueWithChoices("Choose what you want to respond:)", choices2, points2,userChoices);
                System.out.println("");
                dialogue.displayDialogueResponse(responses2,userChoices);
                totalPoints += pointsEarned2_redo;
            }
         if(input.equals("n")){
            System.out.println("You still have 1 opportunity left to redo your choices");
            System.out.println("");
            System.out.println("");
        }
    }

        System.out.println("You tell Nathan that you want to use the bathroom first, and Nathan is waiting for you in the dining room now.");;
        System.out.println("  ");
        game.pressReturn();

        System.out.println("As you explore the guest room's bathroom, you notice a small drawer tucked away in one corner. Curious, you pull it open, revealing an aged music box nestled inside. Its ornate design and faded colors suggest it has been here for a long time, perhaps forgotten. Your curiosity is piqued as they reach out to pick it up, noticing the intricate engravings and the delicate craftsmanship.");
        System.out.println("  ");
        game.pressReturn();

        System.out.println("\u266B"); //maybe add a music box picture here

        System.out.println("");
        System.out.println("");


        System.out.println("");
        System.out.println("");



        //Choice 3
        String[] choices3 = {"Wind up the music box and listen to the melody.", "Leave the music box untouched and close the drawer."};
        int[] points3 = {0, 0};
        int pointsEarned3 = dialogue.displayDialogueWithChoices("Which action do you want to take", choices3, points3,userChoices);
        String [] responses3 = {"The music box plays a beautiful melody, and you decide to keep it. (Your inventory now has 1 music box)","You don't think it's a good idea to touch other people's stuff. (Your inventory has no change)"};
        System.out.println("");
        System.out.println("");
        dialogue.displayDialogueResponse(responses3, userChoices);
        totalPoints += pointsEarned3;
        if(userChoices.get(userChoices.size() - 1)==1){
            inventory.addItem("music box", 1);
        }
        game.pressReturn();
        System.out.println("");
        System.out.println("");

        //redo option
        if (redoCounter == 0) {
            // ask the user if they want to redo their choices
            System.out.println("Do you want to redo your choices? (y/n)" + "  You only have 1 opportunity to redo choices throughout the game, so use it wisely!");

            // get the user's response
            String input = scanner.nextLine().toLowerCase();

            if (input.equals("y")) {
                // increment the redo counter
                redoCounter++;
                inventory.remove("music box");
                //return the totalPoints back to its original state
                totalPoints -=pointsEarned1;
                System.out.println("");
                System.out.println("Now you may redo your choice");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                // display the dialogue and choices again
                int pointsEarned3_redo = dialogue.displayDialogueWithChoices("Which action do you want to take", choices3, points3,userChoices);
                System.out.println("");
                dialogue.displayDialogueResponse(responses3,userChoices);
                totalPoints += pointsEarned3_redo;
                if(userChoices.get(userChoices.size() - 1)==1){
                    inventory.addItem("music box", 1);
                }
                System.out.println("Does the inventory contains music box? ");
                System.out.println(inventory.hasItem("music box"));
            }
         if(input.equals("n")){
            System.out.println("You still have 1 opportunity left to redo your choices");
            System.out.println("");
            System.out.println("");
        } 
    }


        System.out.println("You quickly walk to the dining room. You can't help but feel a sense of curiosity as you sit down for breakfast with Nathaniel.");
        System.out.println("  ");
        System.out.println("  ");
        game.pressReturn();
        
        System.out.println("Nathaniel, I couldn't help but notice there seems to be a mysterious aura surrounding this castle. What happened here?");
        System.out.println("  ");
        System.out.println("  ");
        game.pressReturn();

        //Choice 4
        String[] choices4 = {"Ask Nathaniel about the castle's history.", "Inquire about the castle's secrets.", "Express curiosity about Nathaniel's family."};
        int[] points4 = {5, 3, 0};
        int pointsEarned4 = dialogue.displayDialogueWithChoices("Choose what you want to ask:)", choices4, points4,userChoices);
        String [] responses4 = {"\uD83E\uDD34" + ": " + "How quaint of you to ask. Well, this castle was here long before I started running it. However, there’s quite the charm and backstory to it. The castle was originally built to protect a royal family who fled here to try and find safety, but when the members of the royal family fled again, the castle was left here.","\uD83E\uDD34" + ": " + "Well, I see you are very curious. Maybe you’ll just have to stick around to find out.","\uD83E\uDD34" + ": " + "I don’t share much of my personal life with strangers, it’s just not my preferred topic of conversation. All I will say is that this castle belonged to my parents and that I run it now."};
        System.out.println("  ");
        System.out.println("  ");
        dialogue.displayDialogueResponse(responses4, userChoices);
        totalPoints += pointsEarned4;
        game.pressReturn();
        System.out.println("  ");
        System.out.println("  ");

        //redo option
        if (redoCounter == 0) {
            // ask the user if they want to redo their choices
            System.out.println("Do you want to redo your choices? (y/n)" + "  You only have 1 opportunity to redo choices throughout the game, so use it wisely!");

            // get the user's response
            String input = scanner.nextLine().toLowerCase();

            if (input.equals("y")) {
                // increment the redo counter
                redoCounter++;
                //return the totalPoints back to its original state
                totalPoints -=pointsEarned1;
                System.out.println("");
                System.out.println("Now you may redo your choice");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                // display the dialogue and choices again
                int pointsEarned4_redo = dialogue.displayDialogueWithChoices("Choose what you want to ask:)", choices4, points4,userChoices);
                System.out.println("");
                dialogue.displayDialogueResponse(responses4,userChoices);
                totalPoints += pointsEarned4_redo;
            }
         if(input.equals("n")){
            System.out.println("You still have 1 opportunity left to redo your choices");
            System.out.println("");
            System.out.println("");
        }
    }


        System.out.println("");
        System.out.println("  ");
        System.out.println("Out come plates upon plates of fruit, muffins, danishes, donuts, waffles, eggs, bagels, fresh bread, and various spreads and jams while you and Nathaniel chat at breakfast.");
        game.pressReturn();
        //food pictures go here


        System.out.println("");
        System.out.println("  ");
        System.out.println("\uD83E\uDD34" + ": " + "Well then, shall we eat?");
        game.pressReturn();
        System.out.println("");
        System.out.println("  ");
        System.out.println("Oh my goodness, this is quite the breakfast spread. Is this all for us?");
        game.pressReturn();
        System.out.println("");
        System.out.println("  ");
        System.out.println("\uD83E\uDD34" + ": " + "Yes, it absolutely is. We don’t typically host guests like yourself on a day to day basis. Since guests are so far and few between, when we do have them, we like to treat them very well. Please, help yourself");
        game.pressReturn();


        System.out.println("");
        System.out.println("  ");
        System.out.println("  ");
        System.out.println("Nathaniel watches you very closely while you help yourself to a couple of the different options laid out on the table for breakfast, and the sense of curiosity you have towards Nathaniel only heightens.");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("-------------- Scene 3: Around the Castle --------------");
        System.out.println("");
        System.out.println("  ");

        System.out.println("After breakfast, you and Nathaniel decide to take a stroll around the castle as planned. Yet, just as you get up from the table and you’re about to start walking, one of the servers asks if he can speak to Nathaniel privately. Nathaniel excuses himself and says that it should only take a moment.");
        game.pressReturn();
        System.out.println("");
        System.out.println("Nathaniel and the server exit the room and walk into the room next door, which is a state-of-the-art kitchen. You can’t help but wonder about what they are talking about just 1 room over, and what the problem could be so early in the morning as well. Everything in the castle seems so mysterious. You know it could be an innocent conversation occurring between Nathaniel and the server, but something is telling you that there’s a bit more to the story here.");
        game.pressReturn();
        System.out.println("");


        //Choice 5
        String[] choices5 = {"Eavesdrop on Nathaniel and his server", "Explore the dining room in the meantime", "Sit patiently and wait for Nathaniel to come back"};
        int[] points5 = {0, 3, 5};
        int pointsEarned5 = dialogue.displayDialogueWithChoices("What do you do?", choices5, points5,userChoices);
        String [] responses5 = {"\uD83E\uDD34" + ": " + "You get close to the doorway that leads to the other room, and there, you overhear voices at a volume slightly higher than a whisper. You focus in closely to try to decipher what they’re saying, and you believe you hear the phrase “don’t let them take the treasure.”","\uD83E\uDD34" + ": " + "You decide that while Nathaniel and his server work out whatever they’re working out, you’ll start taking a look around the castle to see what you can find, and maybe you’ll uncover something special. You don’t want to leave this room just yet, so you decide to take a look around.","\uD83E\uDD34" + ": " + "You decide that Nathaniel will probably be out soon, so you sit back down at the breakfast table, waiting for him."};
        System.out.println("");
        System.out.println("");
        dialogue.displayDialogueResponse(responses5, userChoices);
        totalPoints += pointsEarned5;
        game.pressReturn();
        System.out.println("");

        //redo option
        if (redoCounter == 0) {
            // ask the user if they want to redo their choices
            System.out.println("Do you want to redo your choices? (y/n)" + "  You only have 1 opportunity to redo choices throughout the game, so use it wisely!");

            // get the user's response
            String input = scanner.nextLine().toLowerCase();

            if (input.equals("y")) {
                // increment the redo counter
                redoCounter++;
                //return the totalPoints back to its original state
                totalPoints -=pointsEarned1;
                System.out.println("");
                System.out.println("Now you may redo your choice");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                // display the dialogue and choices again
                int pointsEarned5_redo = dialogue.displayDialogueWithChoices("What do you do?", choices5, points5,userChoices);
                System.out.println("");
                dialogue.displayDialogueResponse(responses5,userChoices);
                totalPoints += pointsEarned5_redo;
            }
         if(input.equals("n")){
            System.out.println("You still have 1 opportunity left to redo your choices");
            System.out.println("");
            System.out.println("");
        }
    }

        System.out.println("");
        System.out.println("Nathaniel quickly exits the kitchen and comes back into the dining room.");
        game.pressReturn();
        System.out.println("");
        System.out.println("\uD83E\uDD34" + ": " + "Alright, let’s head out for that tour.");
        game.pressReturn();
        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("-------------- Scene 4: The Unveiling --------------");
        System.out.println("");

        System.out.println("Nathaniel graciously takes the traveler on a tour of the castle, showing them its grand halls, ornate chambers, and hidden passages. The traveler is mesmerized by the rich history and intricate details of the castle's architecture.");
        System.out.println("");
        game.pressReturn();
        System.out.println("As they explore one of the castle's hallways, the traveler's curiosity gets the best of them, and they can't resist asking Nathaniel about the castle's secret.");
        System.out.println("");
        game.pressReturn();
        System.out.println("");


        //checks if the player has music box
        if(inventory.hasItem("music box")){
            System.out.println("Nathaniel, I couldn't help but notice the aged music box I found in the bathroom drawer. It seemed quite significant. Can you tell me more about it?");
            System.out.println("");
            game.pressReturn();
            System.out.println("You hand the music box to Nathaniel. (item music box has been removed from your inventory)");
            game.pressReturn();
            System.out.println("");
            System.out.println("Nathaniel like you a little bit more now (points +3)");
            totalPoints += 3 ;
            System.out.println("");
            game.pressReturn();
            System.out.println("Nathaniel's stoic demeanor softens as he gazes at the music box with a fond expression.");
            game.pressReturn();
            System.out.println("");
            System.out.println("\uD83E\uDD34" + ": " + "Ah, the music box. It holds a special place in the history of this castle. He takes a moment to collect his thoughts before continuing.");
            
        } if(!inventory.hasItem("music box") && totalPoints >= 9){
            System.out.println("Nathaniel, I saw a music box in the bathroom's drawer. Could you tell me more about it?");
            System.out.println("");
            game.pressReturn();
            System.out.println("You hand the music box to Nathaniel. (item music box has been removed from your inventory)");
            game.pressReturn();
            System.out.println("");
            System.out.println("Nathaniel like you a little bit more now (points +3)");
            totalPoints += 3 ;
            System.out.println("");
            game.pressReturn();
            System.out.println("Nathaniel's stoic demeanor softens as he starts to think about the music box with a fond expression.");
            game.pressReturn();
            System.out.println("");
            System.out.println("\uD83E\uDD34" + ": " + "Ah, the music box. It holds a special place in the history of this castle. He takes a moment to collect his thoughts before continuing.");
        } else{ // if the player hasn't earned enough points and doesn't have the music box, they will not know the story of the music box
            System.out.println("Nathaniel, I saw a music box in the bathroom's drawer. Could you tell me more about it?");
            System.out.println("");
            game.pressReturn();
            System.out.println("");
            System.out.println("As you spoke, Nathaniel's expression changed. His body language shifted and he seemed to be tensing up. You could tell that your words had struck a nerve and he was now reacting emotionally, with his anger directed towards you.");
            System.out.println("");
            game.pressReturn();
            System.out.println("\uD83E\uDD34" + ": " + "Enough! I don't want to talk about this...");
        }


        
        if(totalPoints >= 12){
            System.out.println("");
            game.pressReturn();
            System.out.println("\uD83E\uDD34" + ": " + "It once belonged to the royal family who sought refuge here. It was said to be a treasured possession of the youngest princess, who played it often to soothe her troubled heart during those trying times.");
            System.out.println("");
            game.pressReturn();
            System.out.println("The traveler is intrigued, sensing that there is more to the story.");
            System.out.println("");
            game.pressReturn();
            System.out.println("");
            System.out.println("What happened to the princess and the royal family?");
            System.out.println("");
            System.out.println("");
            game.pressReturn();
            System.out.println("\uD83E\uDD34" + ": " + "The royal family eventually had to flee again, leaving the castle behind. But the princess had hidden the music box here, hoping that one day someone worthy would find it and unlock its secret.");
            System.out.println("");
            System.out.println("");
            game.pressReturn();
            System.out.println("“What’s `it's secret?`");
            System.out.println("");
            game.pressReturn();
            System.out.println("");
            System.out.println("Nathaniel ponders for a minute, as if contemplating how much more to share.");
            System.out.println("");
            game.pressReturn();
            System.out.println("\uD83E\uDD34" + ": " + "Well, its purpose is to protect whoever is its owner. It protected the princess during her time here, and was a beloved treasure of the entire royal family, who sought refuge here in this very castle from a curse that was chasing them. It is one of many treasures that was left behind along with the castle.");
            System.out.println("");
            game.pressReturn();
            System.out.println("So, how did you end up here?");
            System.out.println("");
            game.pressReturn();
            System.out.println("Nathaniel prepares to answer yet another of the traveler’s questions, when suddenly, an alarm goes off in the castle.");
            System.out.println("");
            game.pressReturn();
        }

        System.out.println("");
        System.out.println("");
        System.out.println("--------------  Scene 5: Chaos in the Castle --------------");
        game.pressReturn();

        //ENDING NO.1 LOVING NATHANIEL
        if(totalPoints >=12){
            System.out.println("");
            System.out.println("\uD83E\uDD34" + ": " + "Listen traveler, this alarm means that someone has stolen one of the treasures left behind in this castle. They are not meant to fall into the wrong hands.");
            game.pressReturn();

            System.out.println("");
            System.out.println("Who do you think could have stolen this treasure?");

            game.pressReturn();
            System.out.println("\uD83E\uDD34" + ": " + "It could have only been one person.");
            System.out.println("");

            game.pressReturn();
            System.out.println("Nathaniel runs towards the exit, with the traveler following closely behind. Then, they both come to a halt when they see it: a girl standing not too far in the distance in a long beautiful lilac dress flowing in the wind, holding a treasure, a gold comb, in her hands.");
            System.out.println("");

            game.pressReturn();
            System.out.println("I can’t believe this, it can’t be!");
            System.out.println("");

            game.pressReturn();
            System.out.println("Nathaniel attempts to run quickly towards the girl, and the traveler has no choice but to continue following. Yet, the girl suddenly disappears. Nathaniel and the traveler, out of breath, finally stop again.");
            System.out.println("");

            game.pressReturn();
            System.out.println("What is going on, Nathaniel?");
            System.out.println("");

            game.pressReturn();
            System.out.println("\uD83E\uDD34" + ": " + "I have been waiting for so long for this moment, traveler. For someone to visit this castle and set me free, for true love. I have not been completely truthful with you traveler, but you have earned my trust now.");
            System.out.println("");

            game.pressReturn();
            System.out.println("Nathaniel takes a deep breath, and the traveler stares in a confused, but not interrogating way at him. ");
            System.out.println("");

            game.pressReturn();
            System.out.println("\uD83E\uDD34" + ": " + "That girl, once the princess who inhabited this castle, was my sister. I was a member of the royal family, the youngest prince, just as she was the youngest princess. I stayed when the curse caught up to my family, even when it ruined me. However, with you here, I feel rejoiced and anew.");
            System.out.println("");

            game.pressReturn();
            System.out.println("Nathaniel and the traveler stand in the now calm weather under the shade of the castle, with just the right amount of wind blowing towards them, knowing that together, they can conquer anything.");
            System.out.println("");

            game.pressReturn();
            System.out.println("You've unlocked Ending No.1 LOVING NATHANIEL");
            System.out.println("");
            
        }if(totalPoints>=9 && totalPoints < 12){

            System.out.println("\uD83E\uDD34" + ": " + "This alarm goes off when someone has taken one of our precious treasures. Come on, traveler!");
            System.out.println("");

            game.pressReturn();
            System.out.println("Nathaniel leads the way to the outside of the castle, where he and the traveler suddenly find a beautiful bracelet laying on the ground. Nathaniel bends down and picks it up, showing it to the traveler.");
            System.out.println("");

            game.pressReturn();
            System.out.println("\uD83E\uDD34" + ": " + "Our thief must’ve dropped the treasure they intended to steal, and now that this treasure has been released from the castle, so am I. Thank you traveler, for you have brought good fortune upon this castle and I. I once belonged to the royal family I told you about, and now I have been released from my duties of protecting it from the curse that chased my family.");
            System.out.println("");

            game.pressReturn();
            System.out.println("The traveler remains stunned, a bit disoriented about what has just occurred, but feels content knowing that they have helped Nathaniel be free.");
            System.out.println("");

            game.pressReturn();
            System.out.println("I didn’t know you were bound to the castle, Nathaniel. I am not sure that it was me who brought this good fortune upon you and the castle, but whatever it was, I’m glad it happened during my stay.");
            System.out.println("");

            game.pressReturn();
            System.out.println("\uD83E\uDD34" + ": " + "To you, I will be eternally grateful, traveler. You are the lifelong friend I have searched for.");
            System.out.println("");

            game.pressReturn();
            System.out.println("You've unlocked Ending No.2 FRIENDLY NATHANIEL");
            System.out.println("");

        }if(totalPoints<9){

            System.out.println("\uD83E\uDD34" + ": " + "This alarm is going off because of you, traveler! You have brought great misfortune upon my castle and my family. I was a prince in the royal family that lived here once, and I was put in charge of protecting this castle from our curse. You have distracted me from my purpose, and now you will face the consequences.");
            System.out.println("");

            game.pressReturn();
            System.out.println("You panicked, begins to back up, but there is nowhere to escape, with the castle right behind them and their lack of knowledge of the location that the castle lies in in the aftermath of this storm. You feel trapped. You realize that Nathaniel, all along, was the bearer of the curse.");
            System.out.println("");


            game.pressReturn();
            System.out.println("You… you are the curse! You were part of the royal family, and for some reason, you were left behind. You are bitter, and you blame this on me, but this is all your fault!");
            System.out.println("");


            game.pressReturn();
            System.out.println("The traveler attempts to run, in any direction that they can that’s away from Nathaniel, and gets quite far into the woods, not believing that the Castle of Hearts has gotten them everything besides love.");
            System.out.println("");

            game.pressReturn();
            System.out.println("You've unlocked Ending No.3 EVIL NATHANIEL");
            System.out.println("");

        }

        System.out.println("");
        System.out.println("");

        System.out.println("Thank you for playing our game!");
        System.out.println("Best, Jiaqi and Glenvelis");
        

    }
}


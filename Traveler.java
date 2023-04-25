import java.util.ArrayList;

public class Traveler {

  private String name;
  private String pronouns;
  public ArrayList<String> inventory; 
  public int points; // total points

  public Traveler(String name, String pronouns) {
    this.name = name;
    this.pronouns = pronouns; 
    this.inventory = new ArrayList<String>();
  }
  /**
  */
  public void receivePoints() {
    // call on givePoints() in LoveInterest class
    // only applies if Traveler chooses a response with greater than 0 points, receive index from ArrayList and then number of points (value associated with this key) and add these points to the total points
    
  }
  
  public void getTravelerInfo() {
    //returns traveler current information including name, pronouns, size of inventory.
    System.out.println("Your name is" + this.name);
    System.out.println("Your pronouns are" + this.pronouns);
    System.out.println("You currently have" + this.inventory.size() + " items in your inventory.");
  }

  public int getPoints() {
    // returns total number of points that user has currently
    return points;
  }

  public void getInventory() {
      // for (String item : this.inventory.(i)) {
      //   System.out.println() 
      // }
      for (int i = 0; i < this.inventory.size(); i++) {
        System.out.println("You currently have " + this.inventory.size() + " items in your inventory.");
        System.out.println("These items are " + this.inventory.get(i));
     }
    
  } 

  public static void main(String[] args) {
    Traveler test = new Traveler("Test", "He/Him");
    test.getTravelerInfo();
  }

  
}
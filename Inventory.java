import java.util.HashMap;

public class Inventory {
    public String itemName;
    private HashMap<String, Integer> items;

    public void remove(String itemName) {
        if (items.containsKey(itemName)) {
            items.remove(itemName);
            System.out.println(itemName + " has been removed from your inventory.");
        } else {
            System.out.println(itemName + " was not found in your inventory.");
        }
    }

    public boolean hasItem(String itemName) {
        return items.containsKey(itemName);
    }


}
    


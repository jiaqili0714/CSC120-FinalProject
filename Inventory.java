import java.util.HashMap;

public class Inventory {
    public String itemName;
    private HashMap<String, Integer> items;

    public Inventory() {
        this.items = new HashMap<>();
    }

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

    public void addItem(String itemName, int quantity) {
        if (items.containsKey(itemName)) {
            int currentQuantity = items.get(itemName);
            items.put(itemName, currentQuantity + quantity);
        } else {
            items.put(itemName, quantity);
        }
    }


}
    



import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author darhlilove
 */
public class Suitcase {

    private int maxWeight;
    private ArrayList<Item> items;

    public Suitcase(int maxweight) {
        this.maxWeight = maxweight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (totalWeight() + item.getWeight() <= maxWeight) {
            items.add(item);
        }
    }
    
    @Override
    public String toString(){
        if (items.isEmpty()) {
            return "no items (0 kg)";
        }
        
        String description = String.format("%d item%s (%d kg)", 
                this.items.size(),
                this.items.size() == 1 ? "" : "s",
                totalWeight());
        
        return description;
    }
    
    public void printItems(){
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        int totalweight = 0;
        for (Item item : items) {
            totalweight += item.getWeight();
        }

        return totalweight;
    }
    
    public Item heaviestItem(){
        if (items.isEmpty()) {
            return null;
        }
        
        Item heaviest = items.get(0);
        for (Item item : items) {
            if (heaviest.getWeight() < item.getWeight()) {
                heaviest = item;
            }
        }
        
        return heaviest;
    }
}

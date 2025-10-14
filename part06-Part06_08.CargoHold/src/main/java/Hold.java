
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
public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase){
        if (totalWeight() + suitcase.totalWeight() <= maxWeight) {
            this.suitcases.add(suitcase);
        }
    }
    
    private int totalWeight(){
        int totalWeight = 0;
        for (Suitcase suitcase : suitcases) {
            totalWeight += suitcase.totalWeight();
        }
        
        return totalWeight;
    }
    
    @Override
    public String toString(){
        if (suitcases.isEmpty()) {
            return "no suitcases (0 kg)";
        }
        
        String description = String.format("%d suitcases%s (%d kg)", 
                this.suitcases.size(),
                this.suitcases.size() == 1 ? "" : "s",
                totalWeight());
        
        return description;
    }
    
    public void printItems(){
        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }
}

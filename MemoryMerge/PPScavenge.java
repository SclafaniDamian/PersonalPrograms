// Made by Damian Sclafani
package MemoryMerge;
import java.util.ArrayList;

public class PPScavenge {
    private ArrayList<String> goods = new ArrayList<>();
    private ArrayList<String> spellsheets = new ArrayList<>();

    public PPScavenge() {
        setItems();
    }

    public String scavengeGoods() {
        int rand = (int)(Math.random()*goods.size());
        String result = "";
        result += goods.get(rand);
        return result;
    }
    
    public String scavengeSpellsheets() {
        int rand = (int)(Math.random()*spellsheets.size());
        String result = "";
        result += spellsheets.get(rand);
        return result;
    }

    private void setItems() {
        // Goods
        goods.add("1. Wooden Plank");

        // Spellsheets
        spellsheets.add("1. Splash");
    }
}

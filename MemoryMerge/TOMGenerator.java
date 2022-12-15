// Made By Damian Sclafani
package MemoryMerge;
import java.util.ArrayList;

public class TOMGenerator {
    private ArrayList<String> characters = new ArrayList<>();

    public TOMGenerator() {
        createArray();
    }
    
    public String generator() {
        int rand = (int)(Math.random()*characters.size());
        return characters.get(rand);
    }

    private void createArray() {
        characters.add("1. Forgotten Scout");
        characters.add("2. Forgotten Pole Vaulter");
        characters.add("3. Forgotten Warper");
        characters.add("4. Forgotten Statue");
        characters.add("5. Forgotten Bomber");
        characters.add("6. Forgotten Flower");
        characters.add("7. Forgotten Ninja");
        characters.add("8. Forgotten Runner");
        characters.add("9. Cienna, The Forgotten");
        characters.add("10. Forgotten Mole");
        // Continue adding the rest of the unlockable characters
    }
}

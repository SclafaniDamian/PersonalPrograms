// Made By Damian Sclafani
package MemoryMerge;
import java.util.ArrayList;

public class DomainsSpellGenerator {
    private ArrayList<String> characters = new ArrayList<String>();

    public DomainsSpellGenerator() {
        createCharacterOptions();
    }

    public String randomlySelectAI() {
        String result = "";
        int rand = (int)(Math.random()*100) + 1;
        if (rand == 1) {
            rand = (int)(Math.random()*characters.size());
        }
        else if (rand > 1 && rand <= 3) {
            rand = (int)(Math.random()*characters.size()-2) + 2;
        }
        else {
            rand = (int)(Math.random()*characters.size()-7) + 7;
        }
        result += characters.get(rand);
        return result + " has entered the battle!";
    }

    private void createCharacterOptions() {
        characters.add("Lune");
        characters.add("Sol");
        characters.add("Sin'json");
        characters.add("Za'jara");
        characters.add("Mischief");
        characters.add("Grudge");
        characters.add("Aza");
        characters.add("");
    }
}

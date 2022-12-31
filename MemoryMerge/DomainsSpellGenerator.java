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

    public String listCharacters() {
        String result = "";
        for (int i = 0; i < characters.size(); i++) {
            result += (i+1) + ". " + characters.get(i) + "\n";
        }
        return result;
    }

    public String generateSpell(int character) {
        String result = "";
        int rand = 0;
        switch (character) {
            case 1:     // Lune
                result += "Critcal Hit!\n";
                result += "Extra Essence!\n";
                result += "Knowledge!\n";
                result += "Skill!\n";
                rand = (int)(Math.random()*2);
                if (rand == 0) {
                    rand = (int)(Math.random()*2) + 1;
                    result += rand + " Essence Stored in Pocket Dimension!\n";
                }
                rand = (int)(Math.random()*100) + 1;
                result += "Spell #" + rand;
                break;
            case 2:     // Sol
                result += "Critcal Hit!\n";
                result += "Extra Essence!\n";
                result += "Knowledge!\n";
                result += "Skill!\n";
                rand = (int)(Math.random()*51) + 1;
                result += "Spell #" + rand;
                break;
            case 3:     // Sin'json
                result += "Critical Hit!\n";
                rand = (int)(Math.random()*100) + 1;
                if (rand <= 89) {
                    result += "Extra Essence!\n";
                }
                rand = (int)(Math.random()*100) + 1;
                if (rand <= 93) {
                    result += "Knowledge!";
                }
                rand = (int)(Math.random()*100) + 1;
                if (rand <= 97) {
                    result += "Skill!\n";
                }
                rand = (int)(Math.random()*55) + 1;
                result += "Spell #" + rand;
                break;
            case 4:     // Za'jara
                rand = (int)(Math.random()*100) + 1;
                if (rand <= 90) {
                    result += "Critical Hit!\n";
                }
                rand = (int)(Math.random()*100) + 1;
                if (rand <= 99) {
                    result += "Extra Essence!\n";
                }
                rand = (int)(Math.random()*100) + 1;
                if (rand <= 94) {
                    result += "Knowledge!";
                }
                rand = (int)(Math.random()*100) + 1;
                if (rand <= 96) {
                    result += "Skill!\n";
                }
                rand = (int)(Math.random()*60) + 1;
                result += "Spell #" + rand;
                break;
            case 5:     // Mischief
                rand = (int)(Math.random()*100) + 1;
                if (rand <= 93) {
                    result += "Critical Hit!\n";
                }
                rand = (int)(Math.random()*100) + 1;
                if (rand <= 99) {
                    result += "Extra Essence!\n";
                }
                result += "Knowledge!";
                rand = (int)(Math.random()*100) + 1;
                if (rand <= 92) {
                    result += "Skill!\n";
                }
                // TODO - Pocket Dimension
                rand = (int)(Math.random()*46) + 1;
                result += "Spell #" + rand;
                break;
            case 6:     // Grudge
                rand = (int)(Math.random()*100) + 1;
                if (rand <= 99) {
                    result += "Critical Hit!\n";
                }
                rand = (int)(Math.random()*100) + 1;
                if (rand <= 95) {
                    result += "Extra Essence!\n";
                }
                rand = (int)(Math.random()*100) + 1;
                if (rand <= 91) {
                    result += "Knowledge!";
                }
                rand = (int)(Math.random()*100) + 1;
                if (rand <= 93) {
                    result += "Skill!\n";
                }
                rand = (int)(Math.random()*71) + 1;
                result += "Spell #" + rand;
                break;
            case 7:     // Aza
                rand = (int)(Math.random()*100) + 1;
                if (rand <= 94) {
                    result += "Critical Hit!\n";
                }
                rand = (int)(Math.random()*100) + 1;
                if (rand <= 93) {
                    result += "Extra Essence!\n";
                }
                rand = (int)(Math.random()*100) + 1;
                if (rand <= 94) {
                    result += "Knowledge!";
                }
                rand = (int)(Math.random()*100) + 1;
                if (rand <= 98) {
                    result += "Skill!\n";
                }
                rand = (int)(Math.random()*74) + 1;
                result += "Spell #" + rand;
                break;
            case 8:     // Ajax Conic
                rand = (int)(Math.random()*100) + 1;
                if (rand <= 17) {
                    result += "Agility!\n";
                }
                rand = (int)(Math.random()*100) + 1;
                if (rand <= 16) {
                    result += "Critical Hit!\n";
                }
                rand = (int)(Math.random()*100) + 1;
                if (rand <= 12) {
                    result += "Knowledge!";
                }
                rand = (int)(Math.random()*100) + 1;
                if (rand <= 17) {
                    result += "Skill!\n";
                }
                rand = (int)(Math.random()*18) + 1;
                result += "Spell #" + rand;
                break;
            case 9:     // Ancientar
                rand = (int)(Math.random()*100) + 1;
                if (rand <= 8) {
                    result += "Agility!\n";
                }
                rand = (int)(Math.random()*100) + 1;
                if (rand <= 7) {
                    result += "Critical Hit!\n";
                }
                rand = (int)(Math.random()*100) + 1;
                if (rand <= 5) {
                    result += "Knowledge!";
                }
                rand = (int)(Math.random()*100) + 1;
                if (rand <= 7) {
                    result += "Skill!\n";
                }
                result += "Spell #1";
                break;
            case 10:     // Chronin Timelock
                rand = (int)(Math.random()*100) + 1;
                if (rand <= 23) {
                    result += "Critical Hit!\n";
                }
                rand = (int)(Math.random()*100) + 1;
                if (rand <= 21) {
                    result += "Extra Essence!\n";
                }
                rand = (int)(Math.random()*100) + 1;
                if (rand <= 21) {
                    result += "Knowledge!";
                }
                rand = (int)(Math.random()*100) + 1;
                if (rand <= 22) {
                    result += "Skill!\n";
                }
                // TODO - Pocket Dimension
                rand = (int)(Math.random()*20) + 1;
                result += "Spell #" + rand;
                break;
            case 11:     // Crystal Orikki
                rand = (int)(Math.random()*100) + 1;
                if (rand <= 4) {
                    result += "Agility!\n";
                }
                rand = (int)(Math.random()*100) + 1;
                if (rand <= 5) {
                    result += "Critical Hit!\n";
                }
                rand = (int)(Math.random()*100) + 1;
                if (rand <= 10) {
                    result += "Knowledge!";
                }
                rand = (int)(Math.random()*100) + 1;
                if (rand <= 4) {
                    result += "Skill!\n";
                }
                rand = (int)(Math.random()*12) + 1;
                result += "Spell #" + rand;
                break;
            case 12:     // Darien Spence
                rand = (int)(Math.random()*100) + 1;
                if (rand <= 8) {
                    result += "Agility!\n";
                }
                rand = (int)(Math.random()*100) + 1;
                if (rand <= 10) {
                    result += "Critical Hit!\n";
                }
                rand = (int)(Math.random()*100) + 1;
                if (rand <= 9) {
                    result += "Knowledge!";
                }
                rand = (int)(Math.random()*100) + 1;
                if (rand <= 15) {
                    result += "Skill!\n";
                }
                rand = (int)(Math.random()*12) + 1;
                result += "Spell #" + rand;
                break;
            case 13:     // Darien, Masked
                rand = (int)(Math.random()*100) + 1;
                if (rand <= 19) {
                    result += "Agility!\n";
                }
                rand = (int)(Math.random()*100) + 1;
                if (rand <= 21) {
                    result += "Critical Hit!\n";
                }
                rand = (int)(Math.random()*100) + 1;
                if (rand <= 17) {
                    result += "Knowledge!";
                }
                rand = (int)(Math.random()*100) + 1;
                if (rand <= 25) {
                    result += "Skill!\n";
                }
                rand = (int)(Math.random()*15) + 1;
                result += "Spell #" + rand;
                break;
            case 14:     // Darien Meta-Demon
                rand = (int)(Math.random()*100) + 1;
                if (rand <= 20) {
                    result += "Agility!\n";
                }
                rand = (int)(Math.random()*100) + 1;
                if (rand <= 22) {
                    result += "Critical Hit!\n";
                }
                rand = (int)(Math.random()*100) + 1;
                if (rand <= 18) {
                    result += "Knowledge!";
                }
                rand = (int)(Math.random()*100) + 1;
                if (rand <= 19) {
                    result += "Skill!\n";
                }
                rand = (int)(Math.random()*16) + 1;
                result += "Spell #" + rand;
                break;
        }
        return result;
    }

    private void createCharacterOptions() {
        characters.add("Lune");
        characters.add("Sol");
        characters.add("Sin'json");
        characters.add("Za'jara");
        characters.add("Mischief");
        characters.add("Grudge");
        characters.add("Aza");
        characters.add("Ajax Conic");
        characters.add("Ancientar");
        characters.add("Chronin Timelock");
        characters.add("Crystal Orikki");
        characters.add("Darien Spence");
        characters.add("Darien, Masked");
        characters.add("Darien, Meta-Demon");
        characters.add("Ederik Lightborne");
        characters.add("Gonzagat Zavac");
        characters.add("Gurgle");
        characters.add("Held of Grotta");
        characters.add("Jack Maine");
        characters.add("Jasmine Willow");
        characters.add("Katrina Klutz");
        characters.add("Mischief");
        characters.add("Nagarakt");
        characters.add("Prince Anson");
        characters.add("Shiv");
        characters.add("Spawn of Aza");
        characters.add("Spawn of Grudge");
        characters.add("Spawn of Mischief");
        characters.add("Spawn of Sin'json");
        characters.add("Spawn of Za'jara");
        characters.add("The Archprince");
        characters.add("The Butler");
        characters.add("The Conjurer");
        characters.add("The Convict");
        characters.add("Unga Skah");
        characters.add("Zane Wylich");
        characters.add("Andrew");
        characters.add("Anson");
        characters.add("Damian");
        characters.add("Jason");
    }
}

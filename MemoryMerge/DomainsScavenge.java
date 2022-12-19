// Made By Damian Sclafani
package MemoryMerge;
import java.util.ArrayList;

public class DomainsScavenge {
    private ArrayList<String> itemsAny = new ArrayList<>();
    private ArrayList<String> itemsKA = new ArrayList<>();
    private ArrayList<String> itemsJ = new ArrayList<>();
    private ArrayList<String> itemsRoA = new ArrayList<>();

    public DomainsScavenge() {
        setItems();
    }

    public String printList() {
        return "0. No Specific Location \n1. Kingdoms Arise! \n2. Journey \n3. River of Andigroth";
    }

    public String scavengeAny() {
        int rand = (int)(Math.random()*itemsAny.size());
        String result = "";
        result += itemsAny.get(rand) + addAmmo(itemsAny.get(rand));
        return result;
    }

    public String scavengeKA() {
        int rand = (int)(Math.random()*itemsKA.size());
        String result = "";
        result += itemsKA.get(rand) + addAmmo(itemsKA.get(rand));
        return result;
    }

    public String scavengeJ() {
        int rand = (int)(Math.random()*itemsJ.size());
        String result = "";
        result += itemsJ.get(rand) + addAmmo(itemsJ.get(rand));
        return result;
    }

    public String scavengeRoA() {
        int rand = (int)(Math.random()*itemsRoA.size());
        String result = "";
        result += itemsRoA.get(rand) + addAmmo(itemsRoA.get(rand));
        return result;
    }

    private void setItems() {
        // All Items
        itemsAny.add("S1. Pistol");
        itemsAny.add("S2. Small Ammo Box");
        itemsAny.add("S3. Wood Plank");
        itemsAny.add("S4. Knife");
        itemsAny.add("S5. Duct Tape");
        itemsAny.add("S6. Snowball Throw");
        itemsAny.add("S7. High Caliber Ammo Box");
        itemsAny.add("S8. Rifle");
        itemsAny.add("S9. Bandage");
        itemsAny.add("S10. Bow");
        itemsAny.add("S11. Arrow Stab");
        itemsAny.add("S12. Medkit");
        // TODO
        // Kingdoms Arise Items
        itemsKA.add("S3. Wood Plank");
        // TODO
        // Journey Items
        itemsJ.add("S11. Arrow Stab");
        // TODO
        // River of Andigroth Items
        itemsRoA.add("S4. Knife");
        // TODO
    }

    private String addAmmo(String item) {
        int rand = 0;
        if (item.equals("Pistol")) {
            rand += (int)(Math.random()*4) + 8;
            return " with " + rand + " / 16 Bullets";
        }
        else if (item.equals("Small Ammo Box")) {
            rand += (int)(Math.random()*3) + 3;
            return " with " + rand + " Count";
        }
        else if (item.equals("Duct Tape")) {
            rand += (int)(Math.random()*5) + 3;
            return " with " + rand + " Count";
        }
        else if (item.equals("Snowball Throw")) {
            rand += (int)(Math.random()*2) + 2;
            return " with " + rand + " Snow";
        }
        // TODO
        else {
            return "";
        }
    }
}

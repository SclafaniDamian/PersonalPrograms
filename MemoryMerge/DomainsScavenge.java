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
        // TODO
        return result;
    }

    public String scavengeKA() {
        int rand = (int)(Math.random()*itemsAny.size());
        String result = "";
        // TODO
        return result;
    }

    public String scavengeJ() {
        int rand = (int)(Math.random()*itemsAny.size());
        String result = "";
        // TODO
        return result;
    }

    public String scavengeRoA() {
        int rand = (int)(Math.random()*itemsAny.size());
        String result = "";
        // TODO
        return result;
    }

    private void setItems() {
        // TODO
    }

    private String addAmmo(String item) {
        String result = "";
        // TODO
        return result;
    }
}

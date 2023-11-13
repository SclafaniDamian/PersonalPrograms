// Made By Damian Sclafani
package MemoryMerge;
import java.util.ArrayList;

public class TheGarbageGameDemo {
    ArrayList<String> trashmammalsdeck = new ArrayList<>();
    ArrayList<String> garbagedeck = new ArrayList<>();
    ArrayList<String> player1hand = new ArrayList<>();
    ArrayList<String> player2hand = new ArrayList<>();
    ArrayList<String> player3hand = new ArrayList<>();
    ArrayList<String> player4hand = new ArrayList<>();
    ArrayList<String> player1garbage = new ArrayList<>();
    ArrayList<String> player2garbage = new ArrayList<>();
    ArrayList<String> player3garbage = new ArrayList<>();
    ArrayList<String> player4garbage = new ArrayList<>();

    public TheGarbageGameDemo() {
        populateDecks();
    }

    public void useCheese(int playerNum) {
        if (playerNum == 1) {
            for (int i = 0; i < player1garbage.size(); i++) {
                if (player1garbage.get(i).equals("Cheese")) {
                    System.out.println("FOUND CHEESE!!!");
                    garbagedeck.add(player1garbage.get(i));
                    player1garbage.remove(i);
                    i = player1garbage.size() + 1;
                }
            }
        }
    }

    public void loseTrash(int playerNum) {
        int rand = 0;
        if (playerNum == 1) {
            rand = (int)(Math.random()*player1garbage.size());
            player1garbage.remove(rand);
        }
    }

    public void useAllTrash(int playerNum, int trashtype) {
        // Recycle = 0
        // Edible = 1
        if (playerNum == 1) {
            if (trashtype == 0) {
                for (int i = 0; i < player1garbage.size(); i++) {
                    if (player1garbage.get(i).equals("(recyclable garbage)")) {
                        System.out.println("Removed " + player1garbage.get(i));
                        player1garbage.remove(i);
                        i--;
                    }
                }
            }
            else if (trashtype == 1) {
                for (int i = 0; i < player1garbage.size(); i++) {
                    if (player1garbage.get(i).equals("(edible garbage)")) {
                        System.out.println("Removed " + player1garbage.get(i));
                        player1garbage.remove(i);
                        i--;
                    }
                    else if (player1garbage.get(i).equals("Cheese")) {
                        System.out.println("Removed " + player1garbage.get(i));
                        player1garbage.remove(i);
                        i--;
                    }
                }
            }
            else {
                System.out.println("ERROR: Invalid trash type entered!");
            }
        }
        else if (playerNum == 2) {
            if (trashtype == 0) {
                for (int i = 0; i < player2garbage.size(); i++) {
                    if (player2garbage.get(i).equals("(recyclable garbage)")) {
                        System.out.println("Removed " + player2garbage.get(i));
                        player2garbage.remove(i);
                        i--;
                    }
                }
            }
            else if (trashtype == 1) {
                for (int i = 0; i < player2garbage.size(); i++) {
                    if (player2garbage.get(i).equals("(edible garbage)")) {
                        System.out.println("Removed " + player2garbage.get(i));
                        player2garbage.remove(i);
                        i--;
                    }
                    else if (player2garbage.get(i).equals("Cheese")) {
                        System.out.println("Removed " + player2garbage.get(i));
                        player2garbage.remove(i);
                        i--;
                    }
                }
            }
            else {
                System.out.println("ERROR: Invalid trash type entered!");
            }
        }
        else if (playerNum == 3) {
            if (trashtype == 0) {
                for (int i = 0; i < player3garbage.size(); i++) {
                    if (player3garbage.get(i).equals("(recyclable garbage)")) {
                        System.out.println("Removed " + player3garbage.get(i));
                        player3garbage.remove(i);
                        i--;
                    }
                }
            }
            else if (trashtype == 1) {
                for (int i = 0; i < player3garbage.size(); i++) {
                    if (player3garbage.get(i).equals("(edible garbage)")) {
                        System.out.println("Removed " + player3garbage.get(i));
                        player3garbage.remove(i);
                        i--;
                    }
                    else if (player3garbage.get(i).equals("Cheese")) {
                        System.out.println("Removed " + player3garbage.get(i));
                        player3garbage.remove(i);
                        i--;
                    }
                }
            }
            else {
                System.out.println("ERROR: Invalid trash type entered!");
            }
        }
        else if (playerNum == 4) {
            if (trashtype == 0) {
                for (int i = 0; i < player4garbage.size(); i++) {
                    if (player4garbage.get(i).equals("(recyclable garbage)")) {
                        System.out.println("Removed " + player4garbage.get(i));
                        player4garbage.remove(i);
                        i--;
                    }
                }
            }
            else if (trashtype == 1) {
                for (int i = 0; i < player4garbage.size(); i++) {
                    if (player4garbage.get(i).equals("(edible garbage)")) {
                        System.out.println("Removed " + player4garbage.get(i));
                        player4garbage.remove(i);
                        i--;
                    }
                    else if (player4garbage.get(i).equals("Cheese")) {
                        System.out.println("Removed " + player4garbage.get(i));
                        player4garbage.remove(i);
                        i--;
                    }
                }
            }
            else {
                System.out.println("ERROR: Invalid trash type entered!");
            }
        }
        else {
            System.out.println("ERROR: Invalid player number!");
        }
    }

    public void gainTrash(int playerNum) {
        int rand = 0;
        if (playerNum == 1) {
            rand = (int)(Math.random()*garbagedeck.size());
            player1garbage.add(garbagedeck.get(rand));
            System.out.println("You gained a " + garbagedeck.get(rand) + "!");
            garbagedeck.remove(rand);
        }
        else if (playerNum == 2) {
            rand = (int)(Math.random()*garbagedeck.size());
            player2garbage.add(trashmammalsdeck.get(rand));
            System.out.println("You gained a " + garbagedeck.get(rand) + "!");
            garbagedeck.remove(rand);
        }
        else if (playerNum == 3) {
            rand = (int)(Math.random()*garbagedeck.size());
            player3garbage.add(garbagedeck.get(rand));
            System.out.println("You gained a " + garbagedeck.get(rand) + "!");
            garbagedeck.remove(rand);
        }
        else if (playerNum == 4) {
            rand = (int)(Math.random()*garbagedeck.size());
            player4garbage.add(garbagedeck.get(rand));
            System.out.println("You gained a " + garbagedeck.get(rand) + "!");
            garbagedeck.remove(rand);
        }
        else {
            System.out.println("ERROR: Invalid player number entered!");
        }
    }

    public void stealTrash(int playerNum, int stealNum) {
        int rand = 0;
        if (playerNum == 1) {
            if (stealNum == 2) {
                rand = (int)(Math.random()*player2garbage.size());
                System.out.println("You stole a " + player2garbage.get(rand));
                player1garbage.add(player2garbage.get(rand));
                player2garbage.remove(rand);
            }
            if (stealNum == 3) {
                rand = (int)(Math.random()*player3garbage.size());
                System.out.println("You stole a " + player3garbage.get(rand));
                player1garbage.add(player3garbage.get(rand));
                player3garbage.remove(rand);
            }
            if (stealNum == 4) {
                rand = (int)(Math.random()*player4garbage.size());
                System.out.println("You stole a " + player4garbage.get(rand));
                player1garbage.add(player4garbage.get(rand));
                player4garbage.remove(rand);
            }
        }
        if (playerNum == 2) {
            if (stealNum == 1) {
                rand = (int)(Math.random()*player1garbage.size());
                System.out.println("You stole a " + player1garbage.get(rand));
                player2garbage.add(player1garbage.get(rand));
                player1garbage.remove(rand);
            }
            if (stealNum == 3) {
                rand = (int)(Math.random()*player3garbage.size());
                System.out.println("You stole a " + player3garbage.get(rand));
                player2garbage.add(player3garbage.get(rand));
                player3garbage.remove(rand);
            }
            if (stealNum == 4) {
                rand = (int)(Math.random()*player4garbage.size());
                System.out.println("You stole a " + player4garbage.get(rand));
                player2garbage.add(player4garbage.get(rand));
                player4garbage.remove(rand);
            }
        }
        if (playerNum == 3) {
            if (stealNum == 1) {
                rand = (int)(Math.random()*player1garbage.size());
                System.out.println("You stole a " + player1garbage.get(rand));
                player2garbage.add(player1garbage.get(rand));
                player1garbage.remove(rand);
            }
            if (stealNum == 2) {
                rand = (int)(Math.random()*player2garbage.size());
                System.out.println("You stole a " + player2garbage.get(rand));
                player3garbage.add(player2garbage.get(rand));
                player2garbage.remove(rand);
            }
            if (stealNum == 4) {
                rand = (int)(Math.random()*player4garbage.size());
                System.out.println("You stole a " + player4garbage.get(rand));
                player3garbage.add(player4garbage.get(rand));
                player4garbage.remove(rand);
            }
        }
        if (playerNum == 4) {
            if (stealNum == 1) {
                rand = (int)(Math.random()*player1garbage.size());
                System.out.println("You stole a " + player1garbage.get(rand));
                player4garbage.add(player1garbage.get(rand));
                player1garbage.remove(rand);
            }
            if (stealNum == 2) {
                rand = (int)(Math.random()*player2garbage.size());
                System.out.println("You stole a " + player2garbage.get(rand));
                player4garbage.add(player2garbage.get(rand));
                player2garbage.remove(rand);
            }
            if (stealNum == 3) {
                rand = (int)(Math.random()*player3garbage.size());
                System.out.println("You stole a " + player3garbage.get(rand));
                player4garbage.add(player3garbage.get(rand));
                player3garbage.remove(rand);
            }
        }
    }

    public int getSize(int playerNum) {
        int result = 0;
        if (playerNum == 1) {
            result = player1hand.size();
        }
        else if (playerNum == 2) {
            result = player2hand.size();
        }
        else if (playerNum == 3) {
            result = player3hand.size();
        }
        else if (playerNum == 4) {
            result = player4hand.size();
        }
        else {
            System.out.println("ERROR: Invalid player number entered!");
        }
        return result;
    }

    public int getGarbage(int playerNum) {
        int result = 0;
        if (playerNum == 1) {
            result = player1garbage.size();
        }
        else if (playerNum == 2) {
            result = player2garbage.size();
        }
        else if (playerNum == 3) {
            result = player3garbage.size();
        }
        else if (playerNum == 4) {
            result = player4garbage.size();
        }
        else {
            System.out.println("ERROR: Invalid player number entered!");
        }
        return result;
    }

    public String showGarbage(int playerNum) {
        String result = "";
        if (playerNum == 1) {
            for (int i = 0; i < player1garbage.size(); i++) {
                result += i + ". ";
                result += player1garbage.get(i);
                result += "\n";
            }
        }
        else if (playerNum == 2) {
            for (int i = 0; i < player2garbage.size(); i++) {
                result += i + ". ";
                result += player2garbage.get(i);
                result += "\n";
            }
        }
        else if (playerNum == 3) {
            for (int i = 0; i < player3garbage.size(); i++) {
                result += i + ". ";
                result += player3garbage.get(i);
                result += "\n";
            }
        }
        else if (playerNum == 4) {
            for (int i = 0; i < player4garbage.size(); i++) {
                result += i + ". ";
                result += player4garbage.get(i);
                result += "\n";
            }
        }
        else {
            System.out.println("ERROR: Invalid player number entered!");
        }
        return result;
    }

    private boolean checkCard(int playerNum, String card) {
        boolean result = false;
        if (card.equals("Chinchilla")) {
            useAllTrash(playerNum, 0);
            result = true;
        }
        else if (card.equals("Mouse")) {
            result = true;
        }
        else if (card.equals("Guinea Pig")) {
            result = true;
        }
        return result;
    }

    public void drawCard(int playerNum) {
        int rand = 0;
        if (playerNum == 1) {
            rand = (int)(Math.random()*trashmammalsdeck.size());
            System.out.println("You gained a " + trashmammalsdeck.get(rand) + "!");
            if (!(checkCard(playerNum, trashmammalsdeck.get(rand)))) {
                player1hand.add(trashmammalsdeck.get(rand));
                trashmammalsdeck.remove(rand);
            }
        }
        else if (playerNum == 2) {
            rand = (int)(Math.random()*trashmammalsdeck.size());
            System.out.println("You gained a " + trashmammalsdeck.get(rand) + "!");
            if (!(checkCard(playerNum, trashmammalsdeck.get(rand)))) {
                player2hand.add(trashmammalsdeck.get(rand));
                trashmammalsdeck.remove(rand);
            }
        }
        else if (playerNum == 3) {
            rand = (int)(Math.random()*trashmammalsdeck.size());
            System.out.println("You gained a " + trashmammalsdeck.get(rand) + "!");
            if (!(checkCard(playerNum, trashmammalsdeck.get(rand)))) {
                player3hand.add(trashmammalsdeck.get(rand));
                trashmammalsdeck.remove(rand);
            }
        }
        else if (playerNum == 4) {
            rand = (int)(Math.random()*trashmammalsdeck.size());
            System.out.println("You gained a " + trashmammalsdeck.get(rand) + "!");
            if (!(checkCard(playerNum, trashmammalsdeck.get(rand)))) {
                player4hand.add(trashmammalsdeck.get(rand));
                trashmammalsdeck.remove(rand);
            }
        }
        else {
            System.out.println("ERROR: Invalid player number entered!");
        }
    }

    public String showHand(int playerNum) {
        String result = "";
        if (playerNum == 1) {
            for (int i = 0; i < player1hand.size(); i++) {
                result += i + ". ";
                result += player1hand.get(i);
                result += "\n";
            }
        }
        else if (playerNum == 2) {
            for (int i = 0; i < player2hand.size(); i++) {
                result += i + ". ";
                result += player2hand.get(i);
                result += "\n";
            }
        }
        else if (playerNum == 3) {
            for (int i = 0; i < player3hand.size(); i++) {
                result += i + ". ";
                result += player3hand.get(i);
                result += "\n";
            }
        }
        else if (playerNum == 4) {
            for (int i = 0; i < player4hand.size(); i++) {
                result += i + ". ";
                result += player4hand.get(i);
                result += "\n";
            }
        }
        else {
            System.out.println("ERROR: Invalid player number entered!");
        }
        return result;
    }

    public void useCard(int playerNum, int cardSlot) {
        if (playerNum == 1) {
            System.out.println("Using card: " + player1hand.get(cardSlot));
            trashmammalsdeck.add(player1hand.get(cardSlot));
            player1hand.remove(cardSlot);
        }
        else if (playerNum == 2) {
            System.out.println("Using card: " + player2hand.get(cardSlot));
            trashmammalsdeck.add(player2hand.get(cardSlot));
            player2hand.remove(cardSlot);
        }
        else if (playerNum == 3) {
            System.out.println("Using card: " + player3hand.get(cardSlot));
            trashmammalsdeck.add(player3hand.get(cardSlot));
            player3hand.remove(cardSlot);
        }
        else if (playerNum == 4) {
            System.out.println("Using card: " + player4hand.get(cardSlot));
            trashmammalsdeck.add(player4hand.get(cardSlot));
            player4hand.remove(cardSlot);
        }
        else {
            System.out.println("ERROR: Invalid player number entered!");
        }
    }

    private void populateDecks() {
        // Trash Mammals
        for (int i = 0; i < 3; i++) {
            trashmammalsdeck.add("Chinchilla");
            trashmammalsdeck.add("Beaver");
            trashmammalsdeck.add("Raccoon");
            trashmammalsdeck.add("Squirrel");
            trashmammalsdeck.add("Opossum");
            trashmammalsdeck.add("Rat");
            trashmammalsdeck.add("Mouse");
            trashmammalsdeck.add("Ferret");
            trashmammalsdeck.add("Porcupine");
            trashmammalsdeck.add("Chipmunk");
            trashmammalsdeck.add("Otter");
            trashmammalsdeck.add("Hamster");
            trashmammalsdeck.add("Guinea Pig");
            trashmammalsdeck.add("Gerbil");
            trashmammalsdeck.add("Gopher");
            trashmammalsdeck.add("Groundhog");
            trashmammalsdeck.add("Skunk");
            trashmammalsdeck.add("Mole");
            trashmammalsdeck.add("Bat");
            trashmammalsdeck.add("Armadillo");
            trashmammalsdeck.add("Honey Badger");
            trashmammalsdeck.add("Platypus");
        }
        // Garbage
        for (int i = 0; i < 10; i++) {
            garbagedeck.add("Cheese");
        }
        for (int i = 0; i < 45; i++) {
            garbagedeck.add("(recyclable garbage)");
            garbagedeck.add("(edible garbage)");
        }
    }
}

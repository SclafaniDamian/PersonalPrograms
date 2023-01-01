// Made By Damian Sclafani
package MemoryMerge;
import java.util.Scanner;

public class MemoryMergeDriver {
    private Scanner scanner;
    private String[] options = new String[12];

    public MemoryMergeDriver() {
        scanner = new Scanner(System.in);
        options[0] = "Quit";
        options[1] = "Select Random Character + Gamemode for Memory Merge";
        options[2] = "Select Random Explore";
        options[3] = "Use XP Generator";
        options[4] = "Gain a TBW Character (UNFINISHED)";
        options[5] = "Gain a TBW Equipment";
        options[6] = "Gain a TOM Character (UNFINISHED)";
        options[7] = "Pick a Card";
        options[8] = "Scavenge for a Domains Item";
        options[9] = "Give A Journey Character XP";
        options[10] = "Randomly pick a Domains Spell";
        options[11] = "Randomly select a Domains AI";
    }

    public void runDriver() {
        System.out.print("Welcome to Memory Merge!");
        boolean quit = false;
        while(!quit) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 0:
                    System.out.println("Goodbye!");
                    quit = true;
                    break;
                case 1:
                    MemoryMergePicks playing = new MemoryMergePicks();
                    System.out.println();
                    System.out.println(playing.gameSelect());
                    System.out.println();
                    break;
                case 2:
                    MemoryMergePicks exploring = new MemoryMergePicks();
                    System.out.println();
                    System.out.println(exploring.exploreSelect());
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Enter the level of the player:");
                    int level = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter how much XP the player currently has:");
                    int xpHas = scanner.nextInt();
                    scanner.nextLine();
                    XPGenerator generator = new XPGenerator(level, xpHas);
                    System.out.println("Enter the amount of XP being gained: \n(Enter 0 to stop)");
                    int xp = 0;
                    boolean stop = false;
                    while (!stop) {
                        int gain = scanner.nextInt();
                        if (gain == 0) {
                            stop = true;
                        }
                        xp += gain;
                    }
                    scanner.nextLine();
                    System.out.println();
                    System.out.println(generator.generate(xp));
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Enter the amount of TBW characters you unlocked:");
                    int countC = scanner.nextInt();
                    scanner.nextLine();
                    TBWGenerator generatorTBW = new TBWGenerator();
                    System.out.println();
                    for (int i = 0; i < countC; i++) {
                        System.out.println(generatorTBW.generateAny());
                    }
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Enter the amount of TBW equipments you unlocked:");
                    int countE = scanner.nextInt();
                    scanner.nextLine();
                    TBWGenerator generatorEquipment = new TBWGenerator();
                    System.out.println();
                    for (int i = 0; i < countE; i++) {
                        System.out.println(generatorEquipment.generateEquipment());
                    }
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Enter the amount of TOM characters you unlocked:");
                    int countT = scanner.nextInt();
                    scanner.nextLine();
                    TOMGenerator generatorTOM = new TOMGenerator();
                    System.out.println();
                    for (int i = 0; i < countT; i++) {
                        System.out.println(generatorTOM.generator());
                    }
                    System.out.println();
                    break;
                case 7:
                    PickACard deck = new PickACard();
                    System.out.println("How many cards are being drawn?");
                    int draw = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println();
                    for (int i = 0; i < draw; i++) {
                        System.out.println(deck.drawCard());
                    }
                    System.out.println();
                    break;
                case 8:
                    DomainsScavenge scavenging = new DomainsScavenge();
                    System.out.println("Where are you scavenging from?");
                    System.out.println("0. No Specific Location \n1. Kingdoms Arise! \n2. Journey \n3. River of Andigroth");
                    int input = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("How many items are you scavenging from here?");
                    int count = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println();
                    if (input == 0) {
                        for (int i = 0; i < count; i++) {
                            System.out.println(scavenging.scavengeAny());
                        }
                    }
                    else if (input == 1) {
                        for (int i = 0; i < count; i++) {
                            System.out.println(scavenging.scavengeKA());
                        }
                    }
                    else if (input == 2) {
                        for (int i = 0; i < count; i++) {
                            System.out.println(scavenging.scavengeJ());
                        }
                    }
                    else if (input == 3) {
                        for (int i = 0; i < count; i++) {
                            System.out.println(scavenging.scavengeRoA());
                        }
                    }
                    else {
                        System.out.println("ERROR: Invalid Location!");
                    }
                    System.out.println();
                    break;
                case 9:
                    System.out.println("Enter the level of the character:");
                    int levelJ = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter how much XP the character currently has:");
                    int xpHasJ = scanner.nextInt();
                    scanner.nextLine();
                    XPGenerator generatorJ = new XPGenerator(levelJ, xpHasJ);
                    System.out.println("Enter the amount of XP being gained: \n(Enter 0 to stop)");
                    int xpJ = 0;
                    boolean stopJ = false;
                    while (!stopJ) {
                        int gain = scanner.nextInt();
                        if (gain == 0) {
                            stopJ = true;
                        }
                        xpJ += gain;
                    }
                    scanner.nextLine();
                    System.out.println();
                    System.out.println(generatorJ.generateJ(xpJ));
                    System.out.println();
                    break;
                case 10:
                    System.out.println("Which character is generating a spell?");
                    DomainsSpellGenerator DomainsGen = new DomainsSpellGenerator();
                    System.out.println(DomainsGen.listCharacters());
                    int dInput = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(DomainsGen.generateSpell(dInput));
                    System.out.println();
                    break;
                case 11:
                    System.out.println("How many AI are playing?");
                    int amount = scanner.nextInt();
                    scanner.nextLine();
                    DomainsSpellGenerator AiGen = new DomainsSpellGenerator();
                    System.out.println();
                    for (int i = 0; i < amount; i++) {
                        System.out.println(AiGen.randomlySelectAI());
                    }
                    System.out.println();
                    break;
            }
        }
    }

    public void displayMenu() {
        System.out.println("What Would You Like To Do?");
        for (int i = 0; i < options.length; i++) {
            System.out.println("(" + i + ") " + options[i]);
        }
    }
    
    public static void main(String[] args) {
        MemoryMergeDriver driver = new MemoryMergeDriver();
        driver.runDriver();
    }
}
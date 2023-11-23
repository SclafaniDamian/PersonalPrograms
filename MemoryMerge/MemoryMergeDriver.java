// Made By Damian Sclafani
package MemoryMerge;
import java.util.Scanner;

public class MemoryMergeDriver {
    private Scanner scanner;
    private String[] options = new String[16];

    public MemoryMergeDriver() {
        scanner = new Scanner(System.in);
        options[0] = "Quit";
        options[1] = "Select Random Character + Gamemode for Memory Merge";
        options[2] = "Select Random Explore";
        options[3] = "Use XP Generator";
        options[4] = "Gain a TBW Character";
        options[5] = "Gain a TBW Equipment";
        options[6] = "Gain a TOM Character";
        options[7] = "Pick a Card";
        options[8] = "Scavenge for a Domains Item";
        options[9] = "Give A Journey Character XP";
        options[10] = "Randomly pick a Domains Spell";
        options[11] = "Randomly select a Domains AI";
        options[12] = "Rock, Paper, Scissors";
        options[13] = "Force Character Select";
        options[14] = "Personal Personas Scavenge";
        options[15] = "The Trash Game Demo";
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
                    System.out.println(playing.gameSelect(0));
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
                    System.out.println();
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
                case 12:
                    System.out.println("Is player 1 an Player(1) or an AI(2)?");
                    int playerInput = scanner.nextInt();
                    scanner.nextLine();
                    RockPaperScissors rps = new RockPaperScissors();
                    switch (playerInput) {
                        case 1:
                            System.out.println("Rock, Paper, or Scissors?");
                            String playRPS = scanner.nextLine();
                            System.out.println(rps.challenge(playRPS));
                            break;
                        case 2:
                            playRPS = rps.getAIAnswer();
                            System.out.println("AI 1 Response: " + playRPS);
                            System.out.println(rps.challenge(playRPS));
                            break;
                        default:
                            System.out.println("Invalid Response!");
                    }
                    System.out.println();
                    break;
                case 13:
                    MemoryMergePicks forceplaying = new MemoryMergePicks();    
                    System.out.println("Enter the character set number.");
                    int pInput = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println();
                    System.out.println(forceplaying.gameSelect(pInput));
                    System.out.println();
                    break;
                case 14:
                    PPScavenge ppscavenge = new PPScavenge();
                    System.out.println("What are you scavenging for?");
                    System.out.println("0. Goods\n1. Spellsheets\n2. Daggers\n3. League\n4. Ores");
                    int nextinput = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("How many of these items are you scavenging?");
                    int numberinput = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println();
                    if (nextinput == 0) {
                        for (int i = 0; i < numberinput; i++)
                            System.out.println(ppscavenge.scavengeGoods());
                    }
                    else if (nextinput == 1) {
                        for (int i = 0; i < numberinput; i++)
                            System.out.println(ppscavenge.scavengeSpellsheets());
                    }
                    else if (nextinput == 2) {
                        for (int i = 0; i < numberinput; i++)
                            System.out.println(ppscavenge.scavengeDaggers());
                    }
                    else if (nextinput == 3) {
                        for (int i = 0; i < numberinput; i++)
                            System.out.println(ppscavenge.scavengeLeague());
                    }
                    else if (nextinput == 4) {
                        for (int i = 0; i < numberinput; i++)
                            System.out.println(ppscavenge.scavengeOres());
                    }
                    else {
                        System.out.println("ERROR: Invalid value entered!");
                    }
                    break;
                case 15:
                    TheGarbageGameDemo garbagedemo = new TheGarbageGameDemo();
                    boolean continueplaying = true;
                    int whatplayerisit = 0;
                    int cardslot = 0;
                    int playerresponse = 0;
                    boolean continueturn = true;
                    while (continueplaying) {
                        System.out.println("NEW TURN!");
                        whatplayerisit = 0;
                        cardslot = 0;
                        playerresponse = 0;
                        continueturn = true;
                        System.out.println("Who's turn is it? (insert player number 1-4)");
                        whatplayerisit = scanner.nextInt();
                        scanner.nextLine();
                        //while (whatplayerisit < 1 && whatplayerisit > 4) {
                        //    System.out.println("Who's turn is it? (insert player number 1-4)");
                        //    whatplayerisit = scanner.nextInt();
                        //    scanner.nextLine();
                        //}
                        while (continueturn) {
                            System.out.println("What does player " + whatplayerisit + " want to do? (type the number)");
                            System.out.println("0. Pass\n1. Draw\n2. Show your Hand\n3. Use card\n4. Show garbage\n5. Draw garbage\n6. Steal Trash\n7. Remove all trash\n8. Remove set trash");
                            playerresponse = scanner.nextInt();
                            scanner.nextLine();
                            if (playerresponse == 1) {
                                System.out.println("How many cards is Player " + whatplayerisit + " drawing?");
                                playerresponse = scanner.nextInt();
                                scanner.nextLine();
                                if (playerresponse > garbagedemo.getTotalDeck()) {
                                    playerresponse = garbagedemo.getTotalDeck();
                                    System.out.println("The deck has only " + garbagedemo.getTotalDeck() + ". You will instead draw " + playerresponse + " cards.");
                                }
                                for (int i = 0; i < playerresponse; i++)
                                    garbagedemo.drawCard(whatplayerisit);
                            }
                            else if (playerresponse == 2) {
                                System.out.println(garbagedemo.showHand(whatplayerisit));
                            }
                            else if (playerresponse == 3) {
                                System.out.println("Here's what Player " + whatplayerisit + "'s hand looks like:");
                                System.out.println(garbagedemo.showHand(whatplayerisit));
                                System.out.println();
                                System.out.println("What card are you using? (type the slot number)");
                                playerresponse = scanner.nextInt();
                                scanner.nextLine();
                                if (playerresponse >= 0 && playerresponse < garbagedemo.getSize(whatplayerisit)) {
                                    garbagedemo.useCard(whatplayerisit, playerresponse);
                                }
                                else {
                                    System.out.println("ERROR: Invalid card slot entered!");
                                }
                            }
                            else if (playerresponse == 4) {
                                System.out.println(garbagedemo.showGarbage(whatplayerisit));
                            }
                            else if (playerresponse == 5) {
                                System.out.println("How much garbage is Player " + whatplayerisit + " drawing?");
                                playerresponse = scanner.nextInt();
                                scanner.nextLine();
                                if (playerresponse > garbagedemo.getTotalGarbage()) {
                                    playerresponse = garbagedemo.getTotalGarbage();
                                    System.out.println("The deck has only " + garbagedemo.getTotalGarbage() + ". You will instead draw " + playerresponse + " cards.");
                                }
                                for (int i = 0; i < playerresponse; i++)
                                    garbagedemo.gainTrash(whatplayerisit);
                            }
                            else if (playerresponse == 6) {
                                System.out.println("Which other player are you stealing trash from?");
                                playerresponse = scanner.nextInt();
                                scanner.nextLine();
                                System.out.println("How many cards are you stealing from them?");
                                cardslot = scanner.nextInt();
                                scanner.nextLine();
                                for (int i = 0; i < cardslot; i++)
                                    garbagedemo.stealTrash(whatplayerisit, playerresponse);
                            }
                            else if (playerresponse == 7) {
                                System.out.println("What type of trash are you removing from yourself?\n0. Recyclable\n1. Edible");
                                playerresponse = scanner.nextInt();
                                scanner.nextLine();
                                garbagedemo.useAllTrash(whatplayerisit, playerresponse);
                            }
                            else if (playerresponse == 8) {
                                System.out.println("What kind of trash are you removing?\n0. CHEESE!\n1. anything else");
                                playerresponse = scanner.nextInt();
                                scanner.nextLine();
                                if (playerresponse == 0) {
                                    garbagedemo.useCheese(whatplayerisit);
                                }
                                else if (playerresponse == 1) {
                                    System.out.println("How much trash are you losing?");
                                    playerresponse = scanner.nextInt();
                                    scanner.nextLine();
                                    for (int i = 0; i < playerresponse; i++)
                                        garbagedemo.loseTrash(whatplayerisit);
                                }
                            }
                            else {
                                System.out.println("you passed your turn...");
                            }
                            System.out.println();
                            System.out.println("Do you want to continue with your turn? (T/F)");
                            continueturn = scanner.nextBoolean();
                            scanner.nextLine();
                            System.out.println();
                        }
                        System.out.println("Continue playing? (T/F)");
                        continueplaying = scanner.nextBoolean();
                        scanner.nextLine();
                        System.out.println();
                    }
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
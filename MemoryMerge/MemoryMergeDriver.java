// Made By Damian Sclafani
package MemoryMerge;
import java.util.Scanner;

public class MemoryMergeDriver {
    private Scanner scanner;
    private String[] options = new String[7];

    public MemoryMergeDriver() {
        scanner = new Scanner(System.in);
        options[0] = "Quit";
        options[1] = "Select Random Gamemode + Character for Memory Merge";
        options[2] = "Select Random Explore";
        options[3] = "Use XP Generator";
        options[4] = "Gain a TBW Character";
        options[5] = "Gain a TBW Equipment";
        options[6] = "Gain a TOM Character";
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
                    // TODO
                    break;
                case 2:
                    // TODO
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
                    System.out.println(generator.generate(xp));
                    break;
                case 4:
                    // TODO
                    break;
                case 5:
                    // TODO
                    break;
                case 6:
                    // TODO
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
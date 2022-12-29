// Made By Damian Sclafani
package MemoryMerge;
import java.util.ArrayList;

public class MemoryMergePicks {
    private ArrayList<String> characters = new ArrayList<>();
    private ArrayList<String> gamemodes = new ArrayList<>();
    private ArrayList<String> explore = new ArrayList<>();
    private ArrayList<String> chosenGamemode = new ArrayList<>();

    public MemoryMergePicks() {
        createArrays();
    }

    public String gameSelect() {
        String result = "Characters : Gamemode \n";
        int rand = (int)(Math.random()*10) + 1;     // should be 65
        result += characters.get(rand);
        result += " : ";
        switch (rand) {
            case 1:
                chosenGamemode.add(gamemodes.get(1));
                chosenGamemode.add(gamemodes.get(2));
                chosenGamemode.add(gamemodes.get(3));
                chosenGamemode.add(gamemodes.get(4));
                chosenGamemode.add(gamemodes.get(5));
                chosenGamemode.add(gamemodes.get(6));
                chosenGamemode.add(gamemodes.get(10));
                chosenGamemode.add(gamemodes.get(17));
                chosenGamemode.add(gamemodes.get(19));
                chosenGamemode.add(gamemodes.get(20));
                chosenGamemode.add(gamemodes.get(21));
                chosenGamemode.add(gamemodes.get(22));
                chosenGamemode.add(gamemodes.get(23));
                chosenGamemode.add(gamemodes.get(25));
                chosenGamemode.add(gamemodes.get(26));
                chosenGamemode.add(gamemodes.get(27));
                chosenGamemode.add(gamemodes.get(31));
                chosenGamemode.add(gamemodes.get(32));
                chosenGamemode.add(gamemodes.get(33));
                chosenGamemode.add(gamemodes.get(34));
                chosenGamemode.add(gamemodes.get(36));
                chosenGamemode.add(gamemodes.get(37));
                chosenGamemode.add(gamemodes.get(38));
                chosenGamemode.add(gamemodes.get(39));
                chosenGamemode.add(gamemodes.get(40));
                chosenGamemode.add(gamemodes.get(41));
                chosenGamemode.add(gamemodes.get(43));
                chosenGamemode.add(gamemodes.get(44));
                chosenGamemode.add(gamemodes.get(45));
                chosenGamemode.add(gamemodes.get(46));
                chosenGamemode.add(gamemodes.get(54));
                chosenGamemode.add(gamemodes.get(55));
                chosenGamemode.add(gamemodes.get(56));
                chosenGamemode.add(gamemodes.get(57));
                chosenGamemode.add(gamemodes.get(61));
                chosenGamemode.add(gamemodes.get(62));
                chosenGamemode.add(gamemodes.get(67));
                chosenGamemode.add(gamemodes.get(68));
                break;
            case 2:
                chosenGamemode.add(gamemodes.get(1));
                chosenGamemode.add(gamemodes.get(17));
                break;
            case 3:
                chosenGamemode.add(gamemodes.get(1));
                chosenGamemode.add(gamemodes.get(2));
                chosenGamemode.add(gamemodes.get(3));
                chosenGamemode.add(gamemodes.get(4));
                chosenGamemode.add(gamemodes.get(5));
                chosenGamemode.add(gamemodes.get(6));
                chosenGamemode.add(gamemodes.get(10));
                chosenGamemode.add(gamemodes.get(15));
                chosenGamemode.add(gamemodes.get(17));
                chosenGamemode.add(gamemodes.get(19));
                chosenGamemode.add(gamemodes.get(20));
                chosenGamemode.add(gamemodes.get(21));
                chosenGamemode.add(gamemodes.get(22));
                chosenGamemode.add(gamemodes.get(23));
                chosenGamemode.add(gamemodes.get(25));
                chosenGamemode.add(gamemodes.get(31));
                chosenGamemode.add(gamemodes.get(32));
                chosenGamemode.add(gamemodes.get(33));
                chosenGamemode.add(gamemodes.get(38));
                chosenGamemode.add(gamemodes.get(39));
                chosenGamemode.add(gamemodes.get(40));
                chosenGamemode.add(gamemodes.get(41));
                chosenGamemode.add(gamemodes.get(43));
                chosenGamemode.add(gamemodes.get(46));
                chosenGamemode.add(gamemodes.get(55));
                chosenGamemode.add(gamemodes.get(56));
                chosenGamemode.add(gamemodes.get(62));
                break;
            case 4:
                chosenGamemode.add(gamemodes.get(1));
                chosenGamemode.add(gamemodes.get(2));
                chosenGamemode.add(gamemodes.get(3));
                chosenGamemode.add(gamemodes.get(4));
                chosenGamemode.add(gamemodes.get(5));
                chosenGamemode.add(gamemodes.get(6));
                chosenGamemode.add(gamemodes.get(10));
                chosenGamemode.add(gamemodes.get(15));
                chosenGamemode.add(gamemodes.get(17));
                chosenGamemode.add(gamemodes.get(19));
                chosenGamemode.add(gamemodes.get(20));
                chosenGamemode.add(gamemodes.get(21));
                chosenGamemode.add(gamemodes.get(22));
                chosenGamemode.add(gamemodes.get(23));
                chosenGamemode.add(gamemodes.get(25));
                chosenGamemode.add(gamemodes.get(26));
                chosenGamemode.add(gamemodes.get(27));
                chosenGamemode.add(gamemodes.get(31));
                chosenGamemode.add(gamemodes.get(32));
                chosenGamemode.add(gamemodes.get(33));
                chosenGamemode.add(gamemodes.get(34));
                chosenGamemode.add(gamemodes.get(37));
                chosenGamemode.add(gamemodes.get(38));
                chosenGamemode.add(gamemodes.get(39));
                chosenGamemode.add(gamemodes.get(40));
                chosenGamemode.add(gamemodes.get(41));
                chosenGamemode.add(gamemodes.get(43));
                chosenGamemode.add(gamemodes.get(44));
                chosenGamemode.add(gamemodes.get(45));
                chosenGamemode.add(gamemodes.get(46));
                chosenGamemode.add(gamemodes.get(54));
                chosenGamemode.add(gamemodes.get(55));
                chosenGamemode.add(gamemodes.get(56));
                chosenGamemode.add(gamemodes.get(57));
                chosenGamemode.add(gamemodes.get(62));
                chosenGamemode.add(gamemodes.get(67));
                chosenGamemode.add(gamemodes.get(68));
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                chosenGamemode.add(gamemodes.get(7));
                chosenGamemode.add(gamemodes.get(8));
                chosenGamemode.add(gamemodes.get(9));
                chosenGamemode.add(gamemodes.get(11));
                chosenGamemode.add(gamemodes.get(12));
                chosenGamemode.add(gamemodes.get(13));
                chosenGamemode.add(gamemodes.get(16));
                chosenGamemode.add(gamemodes.get(24));
                chosenGamemode.add(gamemodes.get(35));
                chosenGamemode.add(gamemodes.get(50));
                chosenGamemode.add(gamemodes.get(53) + ": Coin Finder (Temple of Memories Version) (35)");
                chosenGamemode.add(gamemodes.get(53) + ": Hand of Kings (9)");
                chosenGamemode.add(gamemodes.get(66));
                break;
            case 11:
                chosenGamemode.add(gamemodes.get(3));
                chosenGamemode.add(gamemodes.get(4));
                chosenGamemode.add(gamemodes.get(5));
                chosenGamemode.add(gamemodes.get(10));
                chosenGamemode.add(gamemodes.get(15));
                chosenGamemode.add(gamemodes.get(19));
                chosenGamemode.add(gamemodes.get(20));
                chosenGamemode.add(gamemodes.get(21));
                chosenGamemode.add(gamemodes.get(25));
                chosenGamemode.add(gamemodes.get(27));
                chosenGamemode.add(gamemodes.get(31));
                chosenGamemode.add(gamemodes.get(32));
                chosenGamemode.add(gamemodes.get(37));
                chosenGamemode.add(gamemodes.get(57));
                chosenGamemode.add(gamemodes.get(61));
                chosenGamemode.add(gamemodes.get(62));
                break;
            case 12:
                // TODO
            // TODO - chosenGamemode.add(gamemodes.get());
        }
        rand = (int)(Math.random()*chosenGamemode.size());
        result += chosenGamemode.get(rand);
        return result;
    }

    public String exploreSelect() {
        String result = "";
        int rand = (int)(Math.random()*13) + 1;
        result += explore.get(rand);
        return result;
    }

    private void createArrays() {
        // Gamemodes
        gamemodes.add("BUFFER");
        gamemodes.add("Dim Moonlight (1)");
        gamemodes.add("Capture The Relic (2)");
        gamemodes.add("Deathmatch (3)");
        gamemodes.add("TB Deathmatch (4)");
        gamemodes.add("Tribal Warfare (5)");
        gamemodes.add("Kingdom Brawl (6)");
        gamemodes.add("Coin Finder (Backyard Battles Version) (7)");
        gamemodes.add("Town of Lies (8)");
        gamemodes.add("Hand of Kings (9)");
        gamemodes.add("Upgraded Utility (10)");
        gamemodes.add("Kingdom Fight (11)");
        gamemodes.add("High Stakes (12)");
        gamemodes.add("Card Warz (13)");
        gamemodes.add("Fight For Glory (14)");
        gamemodes.add("Gemstone Cave (15)");
        gamemodes.add("Forgotten Lands (16)");
        gamemodes.add("Full Moon (17)");
        gamemodes.add("Paradox Warfare (18)");
        gamemodes.add("Free For All (19)");
        gamemodes.add("Tournament (20)");
        gamemodes.add("Capture The Flag (21)");
        gamemodes.add("King of the Hill (22)");
        gamemodes.add("Kingdom King of the Hill (23)");
        gamemodes.add("Protection of the King (24)");
        gamemodes.add("Spirit Warfare (25)");
        gamemodes.add("Last Stand (26)");
        gamemodes.add("Turn Based Battle (27)");
        gamemodes.add("Domains (Beta)");
        gamemodes.add("Domains (Alpha)");
        gamemodes.add("Domains (30)");
        gamemodes.add("Juggernaut (31)");
        gamemodes.add("Team Deathmatch (32)");
        gamemodes.add("Hide & Find (33)");
        gamemodes.add("Quicksand (34)");
        gamemodes.add("Coin Finder (Temple of Memories Version) (35)");
        gamemodes.add("Turn Based Warfare Challenges (36)");
        gamemodes.add("Team Turn Based Battles (37)");
        gamemodes.add("Elimination (38)");
        gamemodes.add("Push the Boulder (39)");
        gamemodes.add("First to Twenty (40)");
        gamemodes.add("The Long Run (41)");
        gamemodes.add("Only One (42)");
        gamemodes.add("Do Damage (43)");
        gamemodes.add("Virus (44)");
        gamemodes.add("Protect the King (45)");
        gamemodes.add("Hunter (46)");
        gamemodes.add("Temple of Memories Tribal Fight Challenge (47)");
        gamemodes.add("Turn Based Battles; Portal Warfare (48)");
        gamemodes.add("Temple of Memories Deathmatch Challenge (49)");
        gamemodes.add("Temple of Memories Village Trials Challenge (50)");
        gamemodes.add("Temple of Memories TBWAFF Challenge (51)");
        gamemodes.add("Temple of Memories Tavern Brawl Challenge (52)");
        gamemodes.add("Temple of Memories Underground Casino Challenge (53)");
        gamemodes.add("360 Ball Tag (54)");
        gamemodes.add("Terrorist (55)");
        gamemodes.add("Collector (56)");
        gamemodes.add("Hybrid (57)");
        gamemodes.add("Mayor (58)");
        gamemodes.add("Two Majors (59)");
        gamemodes.add("Virus (Infection Version) (60)");
        gamemodes.add("Limited Supplies (61)");
        gamemodes.add("Nuke (62)");
        gamemodes.add("Round The Table (63)");
        gamemodes.add("Wicked Town (64)");
        gamemodes.add("Parasite Predicament (65)");
        gamemodes.add("TMC Combat System Beta(66)");
        gamemodes.add("Dark Forest (67)");
        gamemodes.add("Elemental Warfare (68)");
        gamemodes.add("Quest For Glory (69)");
        gamemodes.add("War of Time (70)");
        gamemodes.add("Temple of Memories Underground Arena Challenge (71)");
        // Characters
        characters.add("BUFFER");
        characters.add("Turn Based Warfare (1)");
        characters.add("Dim Moonlight (2)");
        characters.add("Journey (3)");
        characters.add("Tribal Warfare (4)");
        characters.add("Backyard Battles (5-10)");
        characters.add("Backyard Battles (5-10)");
        characters.add("Backyard Battles (5-10)");
        characters.add("Backyard Battles (5-10)");
        characters.add("Backyard Battles (5-10)");
        characters.add("Backyard Battles (5-10)");
        characters.add("The Battle of Rome (11)");
        characters.add("Kingdoms Arise! (12)");
        characters.add("River of Andigroth (13)");
        characters.add("War of Legends (14)");
        characters.add("The Abandon Shed (15)");
        characters.add("Forgotten Lands (16)");
        characters.add("The Masked Chronicles (17)");
        characters.add("Paradox Duel (18)");
        characters.add("Overwatch Personal Creation (19)");
        characters.add("Class Warfare (20)");
        characters.add("Nerf War (21)");
        characters.add("Turn Based Battle; Medieval Mode (22)");
        characters.add("Turn Based Battle; Modern Mode (23)");
        characters.add("Turn Based Battle; Futuristic Mode (24)");
        characters.add("Turn Based Battle; Prehistoric Mode (25)");
        characters.add("Turn Based Battle; Paradox Mode (26)");
        characters.add("Turn Based Battle; Random Mode (27)");
        characters.add("Domains (Beta) (28)");
        characters.add("Domains (Alpha) (29)");
        characters.add("Domains (30)");
        characters.add("Juggernaut (31)");
        characters.add("Class Based Battles (32)");
        characters.add("Team Turn Based Battles (33)");
        characters.add("Team Turn Based Battles: Good Vs Evil (34)");
        characters.add("Class Based Battles: Short (35)");
        characters.add("Turn Based Survival (36)");
        characters.add("Temple of Memories (37)");
        characters.add("Paradox Fighting; Basic Mode (38)");
        characters.add("Paradox Fighting; Medieval Mode (39)");
        characters.add("Paradox Fighting; Modern Mode (40)");
        characters.add("Paradox Fighting; Future Mode (41)");
        characters.add("Paradox Fighting; Criminal Mode (42)");
        characters.add("Paradox Fighting; Prehistoric Mode (43)");
        characters.add("Paradox Fighting; Undead Mode (44)");
        characters.add("Turn Based Battles; Kingdom Fight: Survivor Characters (45)");
        characters.add("Turn Based Battles; Kingdom Fight: Medieval Kingdom (46)");
        characters.add("Class Based Capture The Flag (47)");
        characters.add("Round The Table (48)");
        characters.add("Apocalypse (49)");
        characters.add("The Hunt (50)");
        characters.add("Turn Based Battles; Portal Warfare (51)");
        characters.add("Final Fight (52)");
        characters.add("Gemstone Cave (53)");
        characters.add("Personal Personas (54)");
        characters.add("Damian's Custom Characters (55)");
        characters.add("Jason's Custom Characters (56)");
        characters.add("Anson's Custom Characters (57)");
        characters.add("Darien's Merged Memories (58-59)");
        characters.add("Darien's Merged Memories (58-59)");
        characters.add("Infection (60)");
        characters.add("Wicked Town (61)");
        characters.add("Parasite Predicament (62)");
        characters.add("Kingdoms Arise: Corrupt Oasis! (63)");
        characters.add("Kingdoms Arise: PvE!");
        characters.add("Vampire Hunters (65)");
        // Explore
        explore.add("BUFFER");
        explore.add("Kingdoms Arise! (1)");
        explore.add("Journey (2)");
        explore.add("River of Andigroth (3)");
        explore.add("The Masked Chronicles (4)");
        explore.add("King Survival (5)");
        explore.add("Serial Killer (6)");
        explore.add("Turn Based Battle Cards (7)");
        explore.add("True Survival (8)");
        explore.add("Turn Based Survival (9)");
        explore.add("The Hunt (10)");
        explore.add("Vampire Hunters (11)");
        explore.add("Temple of Memories (12)");
        explore.add("Personal Personas (13)");
        // Adding Forgotten Lands Gamemode as an option for ALL gamemode selections
        chosenGamemode.add(gamemodes.get(16));
    }
}

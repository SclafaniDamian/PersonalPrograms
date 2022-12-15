// Made By Damian Sclafani
package MemoryMerge;

public class MemoryMergePicks {

    public String gameSelect() {
        int randC = (int)(Math.random()*10);     // should be *65
        int randG = 0;
        String result = "";
        if (randC == 0) {
            result += "Turn Based Warfare Characters (1) : ";
            randG = (int)(Math.random()*40);
            switch (randG) {
                case 0:
                    result += "Dim Moonlight Gamemode (1)";
                    break;
                case 1:
                    result += "Capture The Relic Gamemode (2)";
                    break;
                case 2:
                    result += "Deathmatch Gamemode (3)";
                    break;
                case 3:
                    result += "TB Deathmatch Gamemode (4)";
                    break;
                case 4:
                    result += "Tribal Warfare Gamemode (5)";
                    break;
                case 5:
                    result += "Kingdom Brawl Gamemode (6)";
                    break;
                case 6:
                    result += "Upgraded Utility Gamemode (10)";
                    break;
                case 7:
                    result += "Gemstone Cave Gamemode (15)";
                    break;
                case 8:
                    result += "Forgotten Lands Gamemode (16)";
                    break;
                case 9:
                    result += "Full Moon Gamemode (17)";
                    break;
                case 10:
                    result += "Free For All Gamemode (19)";
                    break;
                case 11:
                    result += "Tournament Gamemode (20)";
                    break;
                case 12:
                    result += "Capture The Flag Gamemode (21)";
                    break;
                case 13:
                    result += "King of the Hill Gamemode (22)";
                    break;
                case 14:
                    result += "Kingdom King of the Hill Gamemode (23)";
                    break;
                case 15:
                    result += "Spirit Warfare Gamemode (25)";
                    break;
                case 16:
                    result += "Last Stand Gamemode (26)";
                    break;
                case 17:
                    result += "Turn Based Battle Gamemode (27)";
                    break;
                case 18:
                    result += "Juggernaut Gamemode (31)";
                    break;
                case 19:
                    result += "Team Deathmatch Gamemode (32)";
                    break;
                case 20:
                    result += "Hide & Find Gamemode (33)";
                    break;
                case 21:
                    result += "Quicksand Gamemode (34)";
                    break;
                case 22:
                    result += "Turn Based Warfare Challenges Gamemode (36)";
                    break;
                case 23:
                    result += "Team Turn Based Battles Gamemode (37)";
                    break;
                case 24:
                    result += "Elimination Gamemode (38)";
                    break;
                case 25:
                    result += "Push the Boulder Gamemode (39)";
                    break;
                case 26:
                    result += "First to Twenty Gamemode (40)";
                    break;
                case 27:
                    result += "The Long Run Gamemode (41)";
                    break;
                case 28:
                    result += "Do Damage Gamemode (43)";
                    break;
                case 29:
                    result += "Virus Gamemode (44)";
                    break;
                case 30:
                    result += "Protect The King Gamemode (45)";
                    break;
                case 31:
                    result += "Hunter Gamemode (46)";
                    break;
                case 32:
                    result += "360 Ball Tag Gamemode (54)";
                    break;
                case 33:
                    result += "Terrorist Gamemode (55)";
                    break;
                case 34:
                    result += "Collector Gamemode (56)";
                    break;
                case 35:
                    result += "Hybrid Gamemode (57)";
                    break;
                case 36:
                    result += "Limited Supplies Gamemode (61)";
                    break;
                case 37:
                    result += "Nuke Gamemode (62)";
                    break;
                case 38:
                    result += "Dark Forest Gamemode (67)";
                    break;
                case 39:
                    result += "Elemental Warfare Gamemode (68)";
                    break;
            }
        }
        else if (randC == 1) {
            result += "Dim Moonlight Characters : ";
            randG = (int)(Math.random()*3);
            switch (randG) {
                case 0:
                    result += "Dim Moonlight Gamemode (1)";
                    break;
                case 1:
                    result += "Forgotten Lands Gamemode (16)";
                    break;
                case 2:
                    result += "Full Moon Gamemode (17)";
                    break;
            }
        }
        else if (randC == 2) {
            result += "Journey Characters : ";
            randG = (int)(Math.random()*29);
            switch (randG) {
                case 0:
                    result += "Dim Moonlight Gamemode (1)";
                    break;
                case 1:
                    result += "Capture The Relic Gamemode (2)";
                    break;
                case 2:
                    result += "Deathmatch Gamemode (3)";
                    break;
                case 3:
                    result += "TB Deathmatch (4)";
                    break;
                case 4:
                    result += "Tribal Warfare (5)";
                    break;
                case 5:
                    result += "Kingdom Brawl (6)";
                    break;
                case 6:
                    result += "Upgraded Utility (10)";
                    break;
                case 7:
                    result += "Gemstone Cave (15)";
                    break;
                case 8:
                    result += "Forgotten Lands Gamemode (16)";
                    break;
                case 9:
                    result += "Full Moon Gamemode (17)";
                    break;
                case 10:
                    result += "Free For All Gamemode (19)";
                    break;
                case 11:
                    result += "Tournament Gamemode (20)";
                    break;
                case 12:
                    result += "Capture The Flag Gamemode (21)";
                    break;
                case 13:
                    result += "King of the Hill Gamemode (22)";
                    break;
                case 14:
                    result += "Kingdom King of the Hill Gamemode (23)";
                    break;
                case 15:
                    result += "Spirit Warfare Gamemode (25)";
                    break;
                case 16:
                    result += "Juggernaut Gamemode (31)";
                    break;
                case 17:
                    result += "Team Deathmatch Gamemode (32)";
                    break;
                case 18:
                    result += "Hide & Find Gamemode (33)";
                    break;
                case 19:
                    result += "Elimination Gamemode (38)";
                    break;
                case 20:
                    result += "Push the Boulder Gamemode (39)";
                    break;
                case 21:
                    result += "First To Twenty Gamemode (40)";
                    break;
                case 22:
                    result += "The Long Run Gamemode (41)";
                    break;
                case 23:
                    result += "Do Damage Gamemode (43)";
                    break;
                case 24:
                    result += "Protect The King Gamemode (45)";
                    break;
                case 25:
                    result += "Hunter Gamemode (46)";
                    break;
                case 26:
                    result += "Terrorist Gamemode (55)";
                    break;
                case 27:
                    result += "Collector Gamemode (56)";
                    break;
                case 28:
                    result += "Nuke Gamemode (62)";
                    break;
            }
        }
        else if (randC == 3) {
            result += "Tribal Warfare Characters : ";
            randG = (int)(Math.random()*38);
            switch (randG) {
                case 0:
                    result += "Dim Moonlight Gamemode (1)";
                    break;
                case 1:
                    result += "Capture The Relic Gamemode (2)";
                    break;
                case 2:
                    result += "Deathmatch Gamemode (3)";
                    break;
                case 3:
                    result += "TB Deathmatch Gamemode (4)";
                    break;
                case 4:
                    result += "Tribal Warfare Gamemode (5)";
                    break;
                case 5:
                    result += "Kingdom Brawl Gamemode (6)";
                    break;
                case 6:
                    result += "Upgraded Utility Gamemode (10)";
                    break;
                case 7:
                    result += "Gemstone Cave Gamemode (15)";
                    break;
                case 8:
                    result += "Forgotten Lands Gamemode (16)";
                    break;
                case 9:
                    result += "Full Moon Gamemode (17)";
                    break;
                case 10:
                    result += "Free For All Gamemode (19)";
                    break;
                case 11:
                    result += "Tournament Gamemode (20)";
                    break;
                case 12:
                    result += "Capture The Flag Gamemode (21)";
                    break;
                case 13:
                    result += "King of the Hill Gamemode (22)";
                    break;
                case 14:
                    result += "Kingdom King of the Hill Gamemode (23)";
                    break;
                case 15:
                    result += "Spirit Warfare Gamemode (25)";
                    break;
                case 16:
                    result += "Last Stand Gamemode (26)";
                    break;
                case 17:
                    result += "Turn Based Battle Gamemode (27)";
                    break;
                case 18:
                    result += "Juggernaut Gamemode (31)";
                    break;
                case 19:
                    result += "Team Deathmatch Gamemode (32)";
                    break;
                case 20:
                    result += "Hide & Find Gamemode (33)";
                    break;
                case 21:
                    result += "Quicksand Gamemode (34)";
                    break;
                case 22:
                    result += "Team Turn Based Battles Gamemode (37)";
                    break;
                case 23:
                    result += "Elimination Gamemode (38)";
                    break;
                case 24:
                    result += "Push the Boulder Gamemode (39)";
                    break;
                case 25:
                    result += "First to Twenty Gamemode (40)";
                    break;
                case 26:
                    result += "The Long Run Gamemode (41)";
                    break;
                case 27:
                    result += "Do Damage Gamemode (43)";
                    break;
                case 28:
                    result += "Virus Gamemode (44)";
                    break;
                case 29:
                    result += "Protect the King Gamemode (45)";
                    break;
                case 30:
                    result += "Hunter Gamemode (46)";
                    break;
                case 31:
                    result += "360 Ball Tag Gamemode (54)";
                    break;
                case 32:
                    result += "Terrorist Gamemode (55)";
                    break;
                case 33:
                    result += "Collector Gamemode (56)";
                    break;
                case 34:
                    result += "Hybrid Gamemode (57)";
                    break;
                case 35:
                    result += "Nuke Gamemode (62)";
                    break;
                case 36:
                    result += "Dark Forest Gamemode (67)";
                    break;
                case 37:
                    result += "Elemental Warfare Gamemode (68)";
                    break;
            }
        }
        else if (randC > 3 && randC < 10) {
            result += "Backyard Battles Characters : ";
            randG = (int)(Math.random()*13);
            switch (randG) {
                case 0:
                    result += "Coin Finder (Backyard Battles Version) Gamemode (7)";
                    break;
                case 1:
                    result += "Town of Lies Gamemode (8)";
                    break;
                case 2:
                    result += "Hand of Kings Gamemode (9)";
                    break;
                case 3:
                    result += "Card Warz Gamemode (13)";
                    break;
                case 4:
                    result += "Kingdom Fight Gamemode (11)";
                    break;
                case 5:
                    result += "High Stakes Gamemode (12)";
                    break;
                case 6:
                    result += "Forgotten Lands Gamemode (16)";
                    break;
                case 7:
                    result += "Forgotten Lands Gamemode (16)";
                    break;
                case 8:
                    result += "Protection of the King Gamemode (24)";
                    break;
                case 9:
                    result += "Coin Finder (Temple of Memories Version) Gamemode (35)";
                    break;
                case 10:
                    result += "Temple of Memories Village Trials Challenge Gamemode (50)";
                    break;
                case 11:
                    result += "Temple of Memories Underground Casino Challenge (53); ";
                    int randCasino = (int)(Math.random()*2);
                    switch (randCasino) {
                        case 0:
                            result += "Coin Finder (Temple of Memories Version) Gamemode (35)";
                            break;
                        case 1:
                            result += "Hand of Kings Gamemode (9)";
                            break;
                    }
                    break;
                case 12:
                    result += "TMC Combat System Beta Gamemode (66)";
                    break;
            }
        }
        // TODO - add the rest of the gamemodes
        return result;
    }

    public String exploreSelect() {
        int randE = (int)(Math.random()*13);
        String result = "";
        switch (randE) {
            case 0:
                result += "Kingdoms Arise! (1)";
                break;
            case 1:
                result += "Journey (2)";
                break;
            case 2:
                result += "River of Andigroth (3)";
                break;
            case 3:
                result += "The Masked Chronicles (4)";
                break;
            case 4:
                result += "King Survival (5)";
                break;
            case 5:
                result += "Serial Killer (6)";
                break;
            case 6:
                result += "Turn Based Battle Cards (7)";
                break;
            case 7:
                result += "True Survival (8)";
                break;
            case 8:
                result += "Turn Based Survival (9)";
                break;
            case 9:
                result += "The Hunt (10)";
                break;
            case 10:
                result += "Vampire Hunters (11)";
                break;
            case 11:
                result += "Temple of Memories (12)";
                break;
            case 12:
                result += "Personal Personas (13)";
                break;
        }
        return result;
    }
}

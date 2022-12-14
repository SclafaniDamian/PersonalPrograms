// Made By Damian Sclafani
package MemoryMerge;
import java.util.Random;

public class MemoryMergePicks {

    public String gameSelect() {
        int randC = (int)(Math.random()*2);     // should be *65
        int randG = 0;
        String result = "";
        if (randC == 0) {
            result += "Turn Based Warfare Characters (1) : ";
            randG = (int)(Math.random()*40);
            if (randG == 0) {
                result += "Dim Moonlight Gamemode (1)";
            }
            else if (randG == 1) {
                result += "Capture The Relic Gamemode (2)";
            }
            else if (randG == 2) {
                result += "Deathmatch Gamemode (3)";
            }
            else if (randG == 3) {
                result += "TB Deathmatch Gamemode (4)";
            }
            else if (randG == 4) {
                result += "Tribal Warfare Gamemode (5)";
            }
            else if (randG == 5) {
                result += "Kingdom Brawl Gamemode (6)";
            }
            else if (randG == 6) {
                result += "Upgraded Utility Gamemode (10)";
            }
            else if (randG == 7) {
                result += "Gemstone Cave Gamemode (15)";
            }
            else if (randG == 8) {
                result += "Forgotten Lands Gamemode (16)";
            }
            else if (randG == 9) {
                result += "Full Moon Gamemode (17)";
            }
            else if (randG == 10) {
                result += "Free For All Gamemode (19)";
            }
            else if (randG == 11) {
                result += "Tournament Gamemode (20)";
            }
            else if (randG == 12) {
                result += "Capture The Flag Gamemode (21)";
            }
            else if (randG == 13) {
                result += "King of the Hill Gamemode (22)";
            }
            else if (randG == 14) {
                result += "Kingdom King of the Hill Gamemode (23)";
            }
            else if (randG == 15) {
                result += "Spirit Warfare Gamemode (25)";
            }
            else if (randG == 16) {
                result += "Last Stand Gamemode (26)";
            }
            else if (randG == 17) {
                result += "Turn Based Battle Gamemode (27)";
            }
            else if (randG == 18) {
                result += "Juggernaut Gamemode (31)";
            }
            else if (randG == 19) {
                result += "Team Deathmatch Gamemode (32)";
            }
            else if (randG == 20) {
                result += "Hide & Find Gamemode (33)";
            }
            else if (randG == 21) {
                result += "Quicksand Gamemode (34)";
            }
            else if (randG == 22) {
                result += "Turn Based Warfare Challenges Gamemode (36)";
            }
            else if (randG == 23) {
                result += "Team Turn Based Battles Gamemode (37)";
            }
            else if (randG == 24) {
                result += "Elimination Gamemode (38)";
            }
            else if (randG == 25) {
                result += "Push the Boulder Gamemode (39)";
            }
            else if (randG == 26) {
                result += "First to Twenty Gamemode (40)";
            }
            else if (randG == 27) {
                result += "The Long Run Gamemode (41)";
            }
            else if (randG == 28) {
                result += "Do Damage Gamemode (43)";
            }
            else if (randG == 29) {
                result += "Virus Gamemode (44)";
            }
            else if (randG == 30) {
                result += "Protect The King Gamemode (45)";
            }
            else if (randG == 31) {
                result += "Hunter Gamemode (46)";
            }
            else if (randG == 32) {
                result += "360 Ball Tag Gamemode (54)";
            }
            else if (randG == 33) {
                result += "Terrorist Gamemode (55)";
            }
            else if (randG == 34) {
                result += "Collector Gamemode (56)";
            }
            else if (randG == 35) {
                result += "Hybrid Gamemode (57)";
            }
            else if (randG == 36) {
                result += "Limited Supplies Gamemode (61)";
            }
            else if (randG == 37) {
                result += "Nuke Gamemode (62)";
            }
            else if (randG == 38) {
                result += "Dark Forest Gamemode (67)";
            }
            else if (randG == 39) {
                result += "Elemental Warfare Gamemode (68)";
            }
        }
        else if (randC == 1) {
            result += "Dim Moonlight Characters : ";
            randG = (int)(Math.random()*3);
            if (randG == 0) {
                result += "Dim Moonlight Gamemode (1)";
            }
            else if (randG == 1) {
                result += "Forgotten Lands Gamemode (16)";
            }
            else if (randG == 2) {
                result += "Full Moon Gamemode (17)";
            }
        }
        // TODO - add the rest of the gamemodes
        return result;
    }

    public String exploreSelect() {
        int randE = (int)(Math.random()*13);
        String result = "";
        if (randE == 0) {
            result += "Kingdoms Arise! (1)";
        }
        else if (randE == 1) {
            result += "Journey (2)";
        }
        else if (randE == 2) {
            result += "River of Andigroth (3)";
        }
        else if (randE == 3) {
            result += "The Masked Chronicles (4)";
        }
        else if (randE == 4) {
            result += "King Survival (5)";
        }
        else if (randE == 5) {
            result += "Serial Killer (6)";
        }
        else if (randE == 6) {
            result += "Turn Based Battle Cards (7)";
        }
        else if (randE == 7) {
            result += "True Survival (8)";
        }
        else if (randE == 8) {
            result += "Turn Based Survival (9)";
        }
        else if (randE == 9) {
            result += "The Hunt (10)";
        }
        else if (randE == 10) {
            result += "Vampire Hunters (11)";
        }
        else if (randE == 11) {
            result += "Temple of Memories (12)";
        }
        else if (randE == 12) {
            result += "Personal Personas (13)";
        }
        return result;
    }
}

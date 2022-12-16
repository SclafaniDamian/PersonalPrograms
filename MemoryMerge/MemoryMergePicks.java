// Made By Damian Sclafani
package MemoryMerge;

public class MemoryMergePicks {

    public String gameSelect() {
        int randC = (int)(Math.random()*16);     // should be *64
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
            result += "Dim Moonlight Characters (2) : ";
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
            result += "Journey Characters (3) : ";
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
            result += "Tribal Warfare Characters (4) : ";
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
            result += "Backyard Battles Characters (5-10) : ";
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
        else if (randC == 10) {
            result += "The Battle of Rome Characters (11) : ";
            randG = (int)(Math.random()*17);
            switch (randG) {
                case 0:
                    result += "Deathmatch Gamemode (3)";
                    break;
                case 1:
                    result += "TB Deathmatch Gamemode (4)";
                    break;
                case 2:
                    result += "Tribal Warfare Gamemode (5)";
                    break;
                case 3:
                    result += "Upgraded Utility Gamemode (10)";
                    break;
                case 4:
                    result += "Gemstone Cave Gamemode (15)";
                    break;
                case 5:
                    result += "Forgotten Lands Gamemode (16)";
                    break;
                case 6:
                    result += "Free For All Gamemode (19)";
                    break;
                case 7:
                    result += "Tournament Gamemode (20)";
                    break;
                case 8:
                    result += "Capture The Flag Gamemode (21)";
                    break;
                case 9:
                    result += "Spirit Warfare Gamemode (25)";
                    break;
                case 10:
                    result += "Turn Based Battles Gamemode (27)";
                    break;
                case 11:
                    result += "Juggernaut Gamemode (31)";
                    break;
                case 12:
                    result += "Team Deathmatch Gamemode (32)";
                    break;
                case 13:
                    result += "Team Turn Based Battles Gamemode (37)";
                    break;
                case 14:
                    result += "Hybrid Gamemode (57)";
                    break;
                case 15:
                    result += "Limited Supplies Gamemode (61)";
                    break;
                case 16:
                    result += "Nuke Gamemode (62)";
                    break;
            }
        }
        else if (randC == 11) {
            result += "Kingdoms Arise! Characters (12) : ";
            randG = (int)(Math.random()*33);
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
                    result += "Upgraded Utility Gamemode (10)";
                    break;
                case 6:
                    result += "Gemstone Cave Gamemode (15)";
                    break;
                case 7:
                    result += "Forgotten Lands Gamemode (16)";
                    break;
                case 8:
                    result += "Full Moon Gamemode (17)";
                    break;
                case 9:
                    result += "Free For All Gamemode (19)";
                    break;
                case 10:
                    result += "Tournament Gamemode (20)";
                    break;
                case 11:
                    result += "Capture The Flag Gamemode (21)";
                    break;
                case 12:
                    result += "King of the Hill Gamemode (22)";
                    break;
                case 13:
                    result += "Kingdom King of the Hill Gamemode (23)";
                    break;
                case 14:
                    result += "Spirit Warfare Gamemode (25)";
                    break;
                case 15:
                    result += "Turn Based Battle Gamemode (27)";
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
                    result += "Quicksand Gamemode (34)";
                    break;
                case 20:
                    result += "Team Turn Based Battles Gamemode (37)";
                    break;
                case 21:
                    result += "Elimination Gamemode (38)";
                    break;
                case 22:
                    result += "Push The Boulder Gamemode (39)";
                    break;
                case 23:
                    result += "First To Twenty Gamemode (40)";
                    break;
                case 24:
                    result += "The Long Run Gamemode (41)";
                    break;
                case 25:
                    result += "Do Damage Gamemode (43)";
                    break;
                case 26:
                    result += "Protect the King Gamemode (45)";
                    break;
                case 27:
                    result += "Hunter Gamemode (46)";
                    break;
                case 28:
                    result += "360 Ball Tag Gamemode (54)";
                    break;
                case 29:
                    result += "Terrorist Gamemode (55)";
                    break;
                case 30:
                    result += "Collector Gamemode (56)";
                    break;
                case 31:
                    result += "Limited Supplies Gamemode (61)";
                    break;
                case 32:
                    result += "Nuke Gamemode (62)";
                    break;
            }
        }
        else if (randC == 12) {
            result += "River of Andigroth Characters (13) : ";
            randG = (int)(Math.random()*14);
            switch (randG) {
                case 0:
                    result += "Dim Moonlight Gamemode (1)";
                    break;
                case 1:
                    result += "Tribal Warfare Gamemode (5)";
                    break;
                case 2:
                    result += "Upgraded Utility (10)";
                    break;
                case 3:
                    result += "Gemstone Cave (15)";
                    break;
                case 4:
                    result += "Forgotten Lands Gamemode (16)";
                    break;
                case 5:
                    result += "Full Moon Gamemode (17)";
                    break;
                case 6:
                    result += "Free For All Gamemode (19)";
                    break;
                case 7:
                    result += "Tournament Gamemode (20)";
                    break;
                case 8:
                    result += "Capture The Flag Gamemode (21)";
                    break;
                case 9:
                    result += "King of the Hill Gamemode (22)";
                    break;
                case 10:
                    result += "Kingdom King of the Hill Gamemode (23)";
                    break;
                case 11:
                    result += "Spirit Warfare Gamemode (25)";
                    break;
                case 12:
                    result += "Quicksand Gamemode ()";
                    break;
                case 13:
                    result += "Nuke Gamemode ()";
                    break;
            }
        }
        else if (randC == 13) {
            result += "War of Legends Characters (14) : ";
            randG = (int)(Math.random()*42);
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
                    result += "Fight For Glory Gamemode (14)";
                    break;
                case 8:
                    result += "Gemstone Cave Gamemode (15)";
                    break;
                case 9:
                    result += "Forgotten Lands Gamemode (16)";
                    break;
                case 10:
                    result += "Full Moon Gamemode (17)";
                    break;
                case 11:
                    result += "Free For All Gamemode (19)";
                    break;
                case 12:
                    result += "Tournament Gamemode (20)";
                    break;
                case 13:
                    result += "Capture The Flag Gamemode (21)";
                    break;
                case 14:
                    result += "King of the Hill Gamemode (22)";
                    break;
                case 15:
                    result += "Kingdom King of the Hill Gamemode (23)";
                    break;
                case 16:
                    result += "Spirit Warfare Gamemode (25)";
                    break;
                case 17:
                    result += "Last Stand Gamemode (26)";
                    break;
                case 18:
                    result += "Turn Based Battle Gamemode (27)";
                    break;
                case 19:
                    result += "Juggernaut Gamemode (31)";
                    break;
                case 20:
                    result += "Team Deathmatch Gamemode (32)";
                    break;
                case 21:
                    result += "Hide & Find Gamemode (33)";
                    break;
                case 22:
                    result += "Quicksand Gamemode (34)";
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
                    result += "Protect the King Gamemode (45)";
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
                case 40:
                    result += "Quest For Glory Gamemode (69)";
                    break;
                case 41:
                    result += "War of Time Gamemode (70)";
                    break;
            }
        }
        else if (randC == 14) {
            result += "The Abandon Shed Characters (15) : ";
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
            }
        }
        else if (randC == 15) {
            result += "Forgotten Lands Characters (16) : Forgotten Lands Gamemode (16)";
        }
        else if (randC == 16) {
            result += "The Masked Chronicles; From The Past Characters (17) : ";
            randG = (int)(Math.random()*41);
            switch (randG) {
                // TODO
            }
        }
        else if (randC == 17) {
            result += "Paradox Duel Characters (18) : ";
            randG = (int)(Math.random()*35);
            switch (randG) {
                // TODO
            }
        }
        else if (randC == 18) {
            result += "Overwatch Personal Creation Characters (19) : ";
            randG = (int)(Math.random()*12);
            switch (randG) {
                // TODO
            }
        }
        else if (randC == 19) {
            result += "Class Warfare Characters (20) : ";
            randG = (int)(Math.random()*44);
            switch (randG) {
                // TODO
            }
        }
        else if (randC == 20) {
            result += "Nerf War Characters (21) : ";
            randG = (int)(Math.random()*29);
            switch (randG) {
                // TODO
            }
        }
        else if (randC == 21) {
            result += "Turn Based Warfare; Medieval Mode Characters (22) : ";
            randG = (int)(Math.random()*44);
            switch (randG) {
                // TODO
            }
        }
        else if (randC == 22) {
            result += "Turn Based Warfare; Modern Mode Characters (23) : ";
            randG = (int)(Math.random()*44);
            switch (randG) {
                // TODO
            }
        }
        else if (randC == 23) {
            result += "Turn Based Warfare; Futuristic Mode Characters (24) : ";
            randG = (int)(Math.random()*44);
            switch (randG) {
                // TODO
            }
        }
        else if (randC == 24) {
            result += "Turn Based Warfare; Prehistoric Mode Characters (25) : ";
            randG = (int)(Math.random()*44);
            switch (randG) {
                // TODO
            }
        }
        else if (randC == 25) {
            result += "Turn Based Warfare; Paradox Mode Characters (26) : ";
            randG = (int)(Math.random()*44);
            switch (randG) {
                // TODO
            }
        }
        else if (randC == 26) {
            result += "Turn Based Warfare; Random Mode Characters (27) : ";
            randG = (int)(Math.random()*42);
            switch (randG) {
                // TODO
            }
        }
        else if (randC == 27) {
            result += "Domains (Beta) Characters (28) : ";
            randG = (int)(Math.random()*4);
            switch (randG) {
                // TODO
            }
        }
        else if (randC == 28) {
            result += "Domains (Alpha) Charcters (29) : ";
            randG = (int)(Math.random()*2);
            switch (randG) {
                // TODO
            }
        }
        else if (randC == 29) {
            result += "Domains Charcters (30) : ";
            randG = (int)(Math.random()*2);
            switch (randG) {
                // TODO
            }
        }
        else if (randC == 30) {
            result += "Juggernaut Charcters (31) : ";
            randG = (int)(Math.random()*40);
            switch (randG) {
                // TODO
            }
        }
        else if (randC == 31) {
            result += "Class Based Battles Charcters (32) : ";
            randG = (int)(Math.random()*45);
            switch (randG) {
                // TODO
            }
        }
        else if (randC == 32) {
            result += "Team Turn Based Battles Charcters (33) : ";
            randG = (int)(Math.random()*45);
            switch (randG) {
                // TODO
            }
        }
        else if (randC == 33) {
            result += "Team Turn Based Battles: Good Vs Evil Charcters (34) : ";
            randG = (int)(Math.random()*24);
            switch (randG) {
                // TODO
            }
        }
        else if (randC == 34) {
            result += "Class Based Battles: Short Charcters (35) : ";
            randG = (int)(Math.random()*45);
            switch (randG) {
                // TODO
            }
        }
        else if (randC == 35) {
            result += "Turn Based Survival Charcters (36) : ";
            randG = (int)(Math.random()*40);
            switch (randG) {
                // TODO
            }
        }
        else if (randC == 36) {
            result += "Temple of Memories Charcters (37) : ";
            randG = (int)(Math.random()*50);
            switch (randG) {
                // TODO
            }
        }
        else if (randC == 37) {
            result += "Paradox Fighting; Basic Mode Charcters (38) : ";
            randG = (int)(Math.random()*44);
            switch (randG) {
                // TODO
            }
        }
        else if (randC == 38) {
            result += "Paradox Fighting; Medieval Mode Charcters (39) : ";
            randG = (int)(Math.random()*44);
            switch (randG) {
                // TODO
            }
        }
        else if (randC == 39) {
            result += "Paradox Fighting; Modern Mode Charcters (40) : ";
            randG = (int)(Math.random()*44);
            switch (randG) {
                // TODO
            }
        }
        else if (randC == 40) {
            result += "Paradox Fighting; Future Mode Charcters (41) : ";
            randG = (int)(Math.random()*44);
            switch (randG) {
                // TODO
            }
        }
        else if (randC == 41) {
            result += "Paradox Fighting; Criminal Mode Charcters (42) : ";
            randG = (int)(Math.random()*44);
            switch (randG) {
                // TODO
            }
        }
        else if (randC == 42) {
            result += "Paradox Fighting; Prehistoric Mode Charcters (43) : ";
            randG = (int)(Math.random()*44);
            switch (randG) {
                // TODO
            }
        }
        else if (randC == 43) {
            result += "Paradox Fighting; Undead Mode Charcters (44) : ";
            randG = (int)(Math.random()*42);
            switch (randG) {
                // TODO
            }
        }
        else if (randC == 44) {
            result += "Turn Based Battles; Kingdom Fight: Survivor Charcters (45) : ";
            randG = (int)(Math.random()*16);
            switch (randG) {
                // TODO
            }
        }
        else if (randC == 45) {
            result += "Turn Based Battles; Kingdom Fight: Medieval Kingdom Charcters (46) : ";
            randG = (int)(Math.random()*44);
            switch (randG) {
                // TODO
            }
        }
        else if (randC == 46) {
            result += "Class Based Capture The Flag Charcters (47) : ";
            randG = (int)(Math.random()*45);
            switch (randG) {
                // TODO
            }
        }
        else if (randC == 47) {
            result += "Round The Table Charcters (48) : ";
            randG = (int)(Math.random()*4);
            switch (randG) {
                // TODO
            }
        }
        else if (randC == 48) {
            result += "Apocalypse Charcters (49) : ";
            randG = (int)(Math.random()*10);
            switch (randG) {
                // TODO
            }
        }
        else if (randC == 49) {
            result += "The Hunt Charcters (50) : ";
            randG = (int)(Math.random()*5);
            switch (randG) {
                // TODO
            }
        }
        else if (randC == 50) {
            result += "Turn Based Battles; Portal Warfare Charcters (51) : ";
            randG = (int)(Math.random()*44);
            switch (randG) {
                // TODO
            }
        }
        else if (randC == 51) {
            result += "Final Fight Charcters (52) : ";
            randG = (int)(Math.random()*44);
            switch (randG) {
                // TODO
            }
        }
        else if (randC == 52) {
            result += "Gemstone Cave Charcters (53) : ";
            randG = (int)(Math.random()*2);
            switch (randG) {
                // TODO
            }
        }
        else if (randC == 53) {
            result += "Personal Personas Charcters (54) : ";
            randG = (int)(Math.random()*27);
            switch (randG) {
                // TODO
            }
        }
        else if (randC == 54) {
            result += "Damian's Custom Charcters (55) : ";
            randG = (int)(Math.random()*42);
            switch (randG) {
                // TODO
            }
        }
        else if (randC == 55) {     // CHARACTER SET UNFINISHED
            result += "Jason's Custom Charcters (56) : ";
            randG = (int)(Math.random()*1);
            switch (randG) {
                case 0:
                    result += "UNFINISHED";
                    break;
            }
        }
        else if (randC == 56) {     // CHARACTER SET UNFINISHED
            result += "Anson's Custom Charcters (57) : ";
            randG = (int)(Math.random()*1);
            switch (randG) {
                case 0:
                    result += "UNFINISHED";
                    break;
            }
        }
        else if (randC == 57) {
            result += "Darien's Merged Memories Charcters (58) : ";
            randG = (int)(Math.random()*35);
            switch (randG) {
                // TODO
            }
        }
        else if (randC == 58) {
            result += "Vampire Hunters Charcters (59) : ";
            randG = (int)(Math.random()*9);
            switch (randG) {
                // TODO
            }
        }
        else if (randC == 59) {
            result += "Infection Charcters (60) : ";
            randG = (int)(Math.random()*12);
            switch (randG) {
                // TODO
            }
        }
        else if (randC == 60) {
            result += "Wicked Town Charcters (61) : ";
            randG = (int)(Math.random()*4);
            switch (randG) {
                // TODO
            }
        }
        else if (randC == 61) {
            result += "Parasite Predicament Charcters (62) : ";
            randG = (int)(Math.random()*4);
            switch (randG) {
                // TODO
            }
        }
        else if (randC == 62) {
            result += "Kingdoms Arise: Corrupted Oasis! Charcters (63) : ";
            randG = (int)(Math.random()*2);
            switch (randG) {
                // TODO
            }
        }
        else if (randC == 63) {
            result += "Kingdoms Arise: PvE! Charcters (64) : ";
            randG = (int)(Math.random()*36);
            switch (randG) {
                // TODO
            }
        }
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

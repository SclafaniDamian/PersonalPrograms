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

    public String scavengeAny() {
        int rand = (int)(Math.random()*itemsAny.size());
        String result = "";
        result += itemsAny.get(rand);
        result += addAmmo(itemsAny.get(rand));
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
        itemsAny.add("S13. Sword");
        itemsAny.add("S14. Sword Slashes");
        itemsAny.add("S15. Assult Rifle");
        itemsAny.add("S16. Food");
        itemsAny.add("S17. Sniper Rifle");
        itemsAny.add("S18. Slingshot");
        itemsAny.add("S19. Minigun");
        itemsAny.add("S20. Six-Shooter");
        itemsAny.add("S21. Spare Bullets");
        itemsAny.add("S22. Combat Knife");
        itemsAny.add("S23. Crossbow");
        itemsAny.add("S24. Compound Bow");
        itemsAny.add("S25. AK-47");
        itemsAny.add("S26. Hitman's Rifle");
        itemsAny.add("S27. Arrow Minigun");
        itemsAny.add("S28. Gas Can");
        itemsAny.add("S29. Gas Canister");
        itemsAny.add("S30. Flamethrower");
        itemsAny.add("S31. Arrow Throw");
        itemsAny.add("S32. Leaf Blower");
        itemsAny.add("S33. Harpoon Gun");
        itemsAny.add("S34. Snowball Launcher");
        itemsAny.add("S35. Snowball Cannon");
        itemsAny.add("S36. Rock Launcher");
        itemsAny.add("S37. Metal Pipe");
        itemsAny.add("S38. Rock Mace");
        itemsAny.add("S39. Baseball Bat");
        itemsAny.add("S40. Earthquake Creator");
        itemsAny.add("S41. Match");
        itemsAny.add("S42. Flaming Arrow Stab");
        itemsAny.add("S43. Flaming Arrow Throw");
        itemsAny.add("S44. Flaming Arrow Shot");
        itemsAny.add("S45. Metal Bat");
        itemsAny.add("S46. Mace");
        itemsAny.add("S47. Flaming Bat");
        itemsAny.add("S48. Flaming Arrow Minigun");
        itemsAny.add("S49. Flaming Crossbow");
        itemsAny.add("S50. Flaming Compound Bow");
        itemsAny.add("S51. Bandage Wrap");
        itemsAny.add("S52. Fire Axe");
        itemsAny.add("S53. Sabre");
        itemsAny.add("S54. Scythe");
        itemsAny.add("S55. Darkness-Infused Scythe");
        itemsAny.add("S56. Dreamcatcher");
        itemsAny.add("S57. Ice Cube Throw");
        itemsAny.add("S58. Spare Rocket");
        itemsAny.add("S59. Deploy: Missile");
        itemsAny.add("S60. Remote-Controlled Missile");
        itemsAny.add("S61. Machete");
        itemsAny.add("S62. Nailed Plank");
        itemsAny.add("S63. Machete Slashes");
        itemsAny.add("S64. Candle Throw");
        itemsAny.add("S65. Starter Pack");
        itemsAny.add("S66. Battery Pack");
        itemsAny.add("S67. Taser");
        itemsAny.add("S68. Spare Battery");
        itemsAny.add("S69. Batch of Snowballs");
        itemsAny.add("S70. Stun Gun");
        itemsAny.add("S71. Hammer");
        itemsAny.add("S72. Snowcone Machine");
        itemsAny.add("S73. Bone");
        itemsAny.add("S74. Rations");
        itemsAny.add("S75. Stick");
        itemsAny.add("S76. Iron Chunk");
        itemsAny.add("S77. Coal Chunk");
        itemsAny.add("S78. Rope");
        itemsAny.add("S79. Map");
        itemsAny.add("S80. Lock Pick");
        itemsAny.add("S81. Big Stick");
        itemsAny.add("S82. Forge Item");
        itemsAny.add("S83. Gold");
        itemsAny.add("S84. Double-Tipped Spear");
        itemsAny.add("S85. Hook Sword");
        itemsAny.add("S86. Bedroll");
        itemsAny.add("S87. Poison-Tipped Dagger");
        itemsAny.add("S88. Crystal");
        itemsAny.add("S89. Broadsword");
        itemsAny.add("S90. Pickaxe");
        itemsAny.add("S91. Pickaxe Head");
        itemsAny.add("S92. Shield");
        itemsAny.add("S93. Tweezers");
        itemsAny.add("S94. Butterfly Knife");
        itemsAny.add("S95. Training Butterfly Knife");
        itemsAny.add("S+1. Quiver");
        itemsAny.add("S+2. Medicine Malpractice");
        itemsAny.add("S+3. Caltrops");
        itemsAny.add("S+4. Body Armor");
        itemsAny.add("S+5. Bulletproof Vest");
        itemsAny.add("S+6. Headphones");
        itemsAny.add("S+7. Electricity Harnesser");
        itemsAny.add("S+8. Firefighter Suit");
        itemsAny.add("S+9. Cooking Apron");
        itemsAny.add("S+10. Combat Enhancements");
        itemsAny.add("S+11. Dissonance Charm");
        itemsAny.add("S+12. Use: Pepper Spray");
        itemsAny.add("S+13. Use: Throwing Knife");
        // Kingdoms Arise Items
        itemsKA.add("S3. Wood Plank");
        itemsKA.add("S4. Knife");
        itemsKA.add("S6. Snowball Throw");
        itemsKA.add("S10. Bow");
        itemsKA.add("S11. Arrow Stab");
        itemsKA.add("S13. Sword");
        itemsKA.add("S16. Food");
        itemsKA.add("S18. Slingshot");
        itemsKA.add("S20. Six-Shooter");
        itemsKA.add("S21. Spare Bullets");
        itemsKA.add("S23. Crossbow");
        itemsKA.add("S31. Arrow Throw");
        itemsKA.add("S42. Flaming Arrow Stab");
        itemsKA.add("S43. Flaming Arrow Throw");
        itemsKA.add("S44. Flaming Arrow Shot");
        itemsKA.add("S46. Mace");
        itemsKA.add("S54. Scythe");
        itemsKA.add("S62. Nailed Plank");
        itemsKA.add("S67. Taser");
        itemsKA.add("S69. Batch of Snowballs");
        itemsKA.add("S70. Stun Gun");
        itemsKA.add("S71. Hammer");
        itemsKA.add("S73. Bone");
        itemsKA.add("S75. Stick");
        itemsKA.add("S76. Iron Chunk");
        itemsKA.add("S77. Coal Chunk");
        itemsKA.add("S79. Map");
        itemsKA.add("S81. Big Stick");
        itemsKA.add("S82. Forge Item");
        itemsKA.add("S83. Gold");
        itemsKA.add("S89. Broadsword");
        itemsKA.add("S90. Pickaxe");
        itemsKA.add("S92. Shield");
        itemsKA.add("S+1. Quiver");
        itemsKA.add("S+13. Use: Throwing Knife");
        itemsKA.add("S14. Sword Slashes");
        // Journey Items
        itemsJ.add("S11. Arrow Stab");
        itemsJ.add("S75. Stick");
        itemsJ.add("S24. Compound Bow");
        itemsJ.add("S10. Bow");
        itemsJ.add("S+1. Quiver");
        itemsJ.add("S31. Arrow Throw");
        itemsJ.add("S42. Flaming Arrow Stab");
        itemsJ.add("S43. Flaming Arrow Throw");
        itemsJ.add("S44. Flaming Arrow Shot");
        itemsJ.add("S9. Bandage");
        itemsJ.add("S4. Knife");
        itemsJ.add("S81. Big Stick");
        itemsJ.add("S12. Medkit");
        itemsJ.add("S46. Mace");
        itemsJ.add("S23. Crossbow");
        itemsJ.add("S+13. Use: Throwing Knife");
        itemsJ.add("S13. Sword");
        itemsJ.add("S14. Sword Slashes");
        // River of Andigroth Items
        itemsRoA.add("S4. Knife");
        itemsRoA.add("S3. Wood Plank");
        itemsRoA.add("S10. Bow");
        itemsRoA.add("S11. Arrow Stab");
        itemsRoA.add("S13. Sword");
        itemsRoA.add("S14. Sword Slashes");
        itemsRoA.add("S23. Crossbow");
        itemsRoA.add("S31. Arrow Throw");
        itemsRoA.add("S37. Metal Pipe");
        itemsRoA.add("S62. Nailed Plank");
        itemsRoA.add("S71. Hammer");
        itemsRoA.add("S73. Bone");
        itemsRoA.add("S74. Rations");
        itemsRoA.add("S75. Stick");
        itemsRoA.add("S76. Iron Chunk");
        itemsRoA.add("S77. Coal Chunk");
        itemsRoA.add("S78. Rope");
        itemsRoA.add("S79. Map");
        itemsRoA.add("S80. Lock Pick");
        itemsRoA.add("S83. Gold");
        itemsRoA.add("S84. Double-Tipped Spear");
        itemsRoA.add("S85. Hook Sword");
        itemsRoA.add("S86. Bedroll");
        itemsRoA.add("S87. Poison-Tipped Dagger");
        itemsRoA.add("S88. Crystal");
        itemsRoA.add("S89. Broadsword");
        itemsRoA.add("S90. Pickaxe");
        itemsRoA.add("S91. Pickaxe Head");
        itemsRoA.add("S92. Shield");
        itemsRoA.add("S+1. Quiver");
        itemsRoA.add("S+11. Dissonance Charm");
    }

    private String addAmmo(String item) {
        int rand = 0;
        if (item.equals("S1. Pistol")) {
            rand += (int)(Math.random()*4) + 8;
            return " with " + rand + " / 16 Bullets";
        }
        else if (item.equals("S2. Small Ammo Box")) {
            rand += (int)(Math.random()*3) + 3;
            return " with " + rand + " Count";
        }
        else if (item.equals("S5. Duct Tape")) {
            rand += (int)(Math.random()*5) + 3;
            return " with " + rand + " Count";
        }
        else if (item.equals("S6. Snowball Throw")) {
            rand += (int)(Math.random()*2) + 2;
            return " with " + rand + " Snow";
        }
        else if (item.equals("S7. High Caliber Ammo Box")) {
            rand += (int)(Math.random()*3) + 2;
            return " with " + rand + " Count";
        }
        else if (item.equals("S8. Rifle")) {
            rand += (int)(Math.random()*6) + 7;
            return " with " + rand + " / 25 HC Bullets";
        }
        else if (item.equals("S9. Bandage")) {
            rand += (int)(Math.random()*5) + 12;
            return " with " + rand + " Count";
        }
        else if (item.equals("S11. Arrow Stab")) {
            return " and 1 Arrow if you have a Quiver";
        }
        else if (item.equals("S12. Medkit")) {
            rand += (int)(Math.random()*2) + 1;
            return " with " + rand + " Count";
        }
        else if (item.equals("S15. Assult Rifle")) {
            rand += (int)(Math.random()*3);
            if (rand == 0) {
                rand = 8;
            }
            else if (rand == 1) {
                rand = 16;
            }
            else if (rand == 2) {
                rand = 24;
            }
            return " with " + rand + " / 32 Bullets";
        }
        else if (item.equals("S16. Food")) {
            rand += (int)(Math.random()*6) + 1;
            return " with " + rand + " Count";
        }
        else if (item.equals("S17. Sniper Rifle")) {
            rand += (int)(Math.random()*6) + 7;
            return " with " + rand + " / 25 HC Bullets";
        }
        else if (item.equals("S19. Minigun")) {
            rand += (int)(Math.random()*5) + 97;
            return " with " + rand + " / 200 Bullets";
        }
        else if (item.equals("S20. Six-Shooter")) {
            return " with 6 / 6 Bullets";
        }
        else if (item.equals("S21. Spare Bullets")) {
            rand += (int)(Math.random()*13) + 32;
            return " with " + rand + " Count";
        }
        else if (item.equals("S25. AK-47")) {
            rand += (int)(Math.random()*9) + 5;
            return " with " + rand + " / Bullets";
        }
        else if (item.equals("S26. Hitman's Rifle")) {
            rand += (int)(Math.random()*12);
            return " with " + rand + " / 25 HC Bullets";
        }
        else if (item.equals("S28. Gas Can")) {
            rand += (int)(Math.random()*4) + 1;
            return " with " + rand + " Count";
        }
        else if (item.equals("S29. Gas Canister")) {
            return " with 1 Count";
        }
        else if (item.equals("S31. Arrow Throw")) {
            return " and 1 Arrow if you have a Quiver";
        }
        else if (item.equals("S33. Harpoon Gun")) {
            return " with 1 / 1 Harpoon";
        }
        else if (item.equals("S34. Snowball Launcher")) {
            rand += (int)(Math.random()*4) + 6;
            return " with " + rand + " / 16 Snow";
        }
        else if (item.equals("S35. Snowball Cannon")) {
            return " with 6 / 6 Snow";
        }
        else if (item.equals("S41. Match")) {
            rand += (int)(Math.random()*13) + 12;
            return " with " + rand + " Count";
        }
        else if (item.equals("S51. Bandage Wrap")) {
            rand += (int)(Math.random()*4) + 7;
            return " with " + rand + " Count";
        }
        else if (item.equals("S57. Ice Cube Throw")) {
            return " with 12 Count";
        }
        else if (item.equals("S58. Spare Rocket")) {
            rand += (int)(Math.random()*2) + 2;
            return " with " + rand + " Count";
        }
        else if (item.equals("S59. Deploy: Missile")) {
            return " with 1 / 1 Rockets";
        }
        else if (item.equals("S60. Remote-Controlled Missile")) {
            return " with 1 / 1 Rockets";
        }
        else if (item.equals("S64. Candle Throw")) {
            rand += (int)(Math.random()*6) + 1;
            return " with " + rand + " Count";
        }
        else if (item.equals("S65. Starter Pack")) {
            return " with 1 Count";
        }
        else if (item.equals("S66. Battery Pack")) {
            rand += (int)(Math.random()*2) + 1;
            return " with " + rand + " Count";
        }
        else if (item.equals("S68. Spare Battery")) {
            rand += (int)(Math.random()*12) + 1;
            return " with " + rand + " Count";
        }
        else if (item.equals("S69. Batch of Snowballs")) {
            return " with 1 Count";
        }
        else if (item.equals("S73. Bone")) {
            rand += (int)(Math.random()*25) + 47;
            return " with " + rand + " Count";
        }
        else if (item.equals("S74. Rations")) {
            rand += (int)(Math.random()*5) + 6;
            return " with " + rand + " Count";
        }
        else if (item.equals("S76. Iron Chunk")) {
            rand += (int)(Math.random()*3) + 2;
            return " with " + rand + " Count";
        }
        else if (item.equals("S77. Coal Chunk")) {
            rand += (int)(Math.random()*4) + 5;
            return " with " + rand + " Count";
        }
        else if (item.equals("S78. Rope")) {
            return " with 3 Count";
        }
        else if (item.equals("S79. Map")) {
            return " with 1 Count";
        }
        else if (item.equals("S80. Lock Pick")) {
            rand += (int)(Math.random()*3) + 5;
            return " with " + rand + " Count";
        }
        else if (item.equals("S83. Gold")) {
            rand += (int)(Math.random()*4) + 3;
            return " with " + rand + " Count";
        }
        else if (item.equals("S86. Bedroll")) {
            return " with 1 Count";
        }
        else if (item.equals("S88. Crystal")) {
            rand += (int)(Math.random()*3) + 1;
            return " with " + rand + " Count";
        }
        else if (item.equals("S93. Tweezers")) {
            rand += (int)(Math.random()*12) + 21;
            return " with " + rand + " Count";
        }
        else if (item.equals("S+1. Quiver")) {
            return " with 36 Arrows added to the Quiver";
        }
        else if (item.equals("S+2. Medicine Malpractice")) {
            rand += (int)(Math.random()*20) + 2;
            return " with " + rand + " Count";
        }
        else if (item.equals("S+12. Use: Pepper Spray")) {
            rand += (int)(Math.random()*4) + 1;
            return " with " + rand + " Count";
        }
        else if (item.equals("S+13. Use: Throwing Knife")) {
            rand += (int)(Math.random()*3) + 4;
            return " with " + rand + " Count";
        }
        else {
            return "";
        }
    }
}

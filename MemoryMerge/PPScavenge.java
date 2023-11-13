// Made by Damian Sclafani
package MemoryMerge;
import java.util.ArrayList;

public class PPScavenge {
    private ArrayList<String> goods = new ArrayList<>();
    private ArrayList<String> spellsheets = new ArrayList<>();
    private ArrayList<String> daggers = new ArrayList<>();

    public PPScavenge() {
        setItems();
    }

    public String scavengeGoods() {
        int rand = (int)(Math.random()*goods.size());
        String result = "";
        result += goods.get(rand);
        return result;
    }
    
    public String scavengeSpellsheets() {
        int rand = (int)(Math.random()*spellsheets.size());
        String result = "";
        result += spellsheets.get(rand);
        return result;
    }

    public String scavengeDaggers() {
        int rand = (int)(Math.random()*daggers.size());
        String result = "";
        result += daggers.get(rand);
        return result;
    }

    private void setItems() {
        // Goods
        goods.add("1. Wooden Plank");
        goods.add("2. Wooden Knife");
        goods.add("3. Handcrafted Sword");
        goods.add("4. Sword");
        goods.add("5. Handcrafted Knife");
        goods.add("6. Kitchen Knife");
        goods.add("7. Double-Edged Blade");
        goods.add("8. Handcrafted Mace");
        goods.add("9. Mace");
        goods.add("10. Rock Mace");
        goods.add("11. Handcrafted Longsword");
        goods.add("12. Longsword");
        goods.add("13. Handcrafted Spear");
        goods.add("14. Spear");
        goods.add("15. Handcrafted Shortbow");
        goods.add("16. Shortbow");
        goods.add("17. Handcrafted Longbow");
        goods.add("18. Longbow");
        goods.add("19. Crossbow");
        goods.add("20. Iron Bow");
        goods.add("21. Venom Bow");
        goods.add("22. Healerium Blade");
        goods.add("23. Fire Spewer");
        goods.add("24. Frostsword");
        goods.add("25. Handcrafted Shiv");
        goods.add("26. Wittling Knife");
        goods.add("27. Forging Hammer");
        goods.add("28. Iron");
        goods.add("29. Gold");
        goods.add("30. Steel");
        goods.add("31. Obsidian");
        goods.add("32. Pistol");
        goods.add("33. Incendiary Pistol");
        goods.add("34. Rocket Launcher");
        goods.add("35. Spare Ammunition");
        goods.add("36. Makeshift Rocket Launcher");
        goods.add("37. Bandage");
        goods.add("38. Performance Enhancer");
        goods.add("39. Doctor's Note");
        goods.add("40. Bone");
        goods.add("41. Aatrox, The Darkin Blade");
        goods.add("42. Kayn, The Shadow Reaper");
        goods.add("43. Varus, The Arrow of Retribution");
        goods.add("44. Naafiri, The Hound of a Hundred Bites");
        goods.add("45. Chemical-Covered Bone");
        goods.add("46. Ashe's Bow");
        // Spellsheets
        spellsheets.add("1. Splash");
        spellsheets.add("2. Meteor");
        spellsheets.add("3. Condensate");
        spellsheets.add("4. Zap");
        spellsheets.add("5. Snowball");
        spellsheets.add("6. Giant Snowball");
        spellsheets.add("7. Tidal Wave");
        spellsheets.add("8. Wave");
        spellsheets.add("9. Disperse");
        spellsheets.add("10. Thunderdome");
        spellsheets.add("11. Thunderbolt");
        spellsheets.add("12. Thunderbolt");
        spellsheets.add("13. Lightning Bolt");
        spellsheets.add("14. Frost Wave");
        spellsheets.add("15. Cryostasis");
        spellsheets.add("16. Blizzard");
        spellsheets.add("17. Passing Winds");
        spellsheets.add("18. Harness Wind");
        spellsheets.add("19. Ping");
        spellsheets.add("20. Channeled Flames");
        spellsheets.add("21. Wildfire");
        spellsheets.add("22. Inferno");
        spellsheets.add("23. Fire Spurt");
        spellsheets.add("24. Flame Blast");
        spellsheets.add("25. Flame Burst");
        spellsheets.add("26. Fireball");
        spellsheets.add("27. Fire Strike");
        spellsheets.add("28. Cinderspell");
        spellsheets.add("29. Flamewave");
        spellsheets.add("30. Armageddon");
        spellsheets.add("31. Catastrophe");
        spellsheets.add("32. Steal Life");
        spellsheets.add("33. Dread");
        spellsheets.add("34. Raised Dread");
        spellsheets.add("35. Call Upon Grudge!");
        spellsheets.add("36. Dark Blossom");
        spellsheets.add("37. Soul Drain");
        spellsheets.add("38. Pure Darkness");
        spellsheets.add("39. Curse of Decay");
        spellsheets.add("40. Hex");
        spellsheets.add("41. Life Tap");
        spellsheets.add("42. Blood Magic");
        spellsheets.add("43. Essence Steal");
        spellsheets.add("44. Power Gain!");
        spellsheets.add("45. Rapture");
        spellsheets.add("46. Curse of Reckoning");
        spellsheets.add("47. Curse of Binding");
        spellsheets.add("48. Curse of Fragility");
        spellsheets.add("49. Curse of the Leech");
        spellsheets.add("50. Corrode");
        spellsheets.add("51. Darkspear");
        spellsheets.add("52. Curse of Temptation");
        spellsheets.add("53. Tempt");
        spellsheets.add("54. Lure");
        spellsheets.add("55. Curse of Luring");
        spellsheets.add("56. Blood Ray");
        spellsheets.add("57. Blood Boil");
        spellsheets.add("58. Darkdome");
        spellsheets.add("59. Soul Steal");
        spellsheets.add("60. Leech Life");
        spellsheets.add("61. Corrode the Mind");
        spellsheets.add("62. Corrode the Soul");
        spellsheets.add("63. Corrosion");
        spellsheets.add("64. Drain Life");
        spellsheets.add("65. Fel Strike");
        spellsheets.add("66. Wheel of Wrath");
        spellsheets.add("67. Arising Darkness");
        spellsheets.add("68. Approaching Darkness");
        spellsheets.add("69. Stolen Knowledge");
        spellsheets.add("70. Counterspell");
        spellsheets.add("71. Dark Counterspell");
        spellsheets.add("72. Reflect");
        spellsheets.add("73. Reverse Time");
        spellsheets.add("74. Echo");
        spellsheets.add("75. Restart");
        spellsheets.add("76. Dilate Time");
        spellsheets.add("77. Extra Time");
        spellsheets.add("78. Stuck in Time");
        spellsheets.add("79. Time Blink");
        spellsheets.add("80. Time Breach");
        spellsheets.add("81. Time Crunch");
        spellsheets.add("82. Launch Through Time");
        spellsheets.add("83. Light Explosion");
        spellsheets.add("84. Glint of Light");
        spellsheets.add("85. Regenerate");
        spellsheets.add("86. Branch Fling");
        spellsheets.add("87. Boulder");
        spellsheets.add("88. Moss Rock");
        spellsheets.add("89. Blossom");
        spellsheets.add("90. Nourish");
        spellsheets.add("91. Holy Light");
        spellsheets.add("92. Purity");
        spellsheets.add("93. Tree of Life");
        spellsheets.add("94. Nature's Blessing");
        spellsheets.add("95. Harden");
        spellsheets.add("96. Faith");
        spellsheets.add("97. Spontaneous Light");
        spellsheets.add("98. Godly Light");
        spellsheets.add("99. For Glory!");
        spellsheets.add("100. Earthen Shield");
        spellsheets.add("101. Shower with Light");
        spellsheets.add("102. Spread the Blessing");
        spellsheets.add("103. Earthen Power");
        spellsheets.add("104. Light's Prowess");
        spellsheets.add("105. Earthen Armor");
        spellsheets.add("106. Wave of Light");
        spellsheets.add("107. Flash of Light");
        spellsheets.add("108. Avalanche");
        spellsheets.add("109. Light Storm");
        spellsheets.add("110. Naturalize");
        spellsheets.add("111. Earthen Shield");
        spellsheets.add("112. Landslide");
        spellsheets.add("113. Gust");
        spellsheets.add("114. Elemental Blast");
        spellsheets.add("115. Binding Heal");
        spellsheets.add("116. Light's Judgement");
        spellsheets.add("117. Light's Strength");
        spellsheets.add("118. Overload");
        spellsheets.add("119. Ward");
        // Daggers
        daggers.add("2. Wooden Knife");
        daggers.add("5. Handcrafted Knife");
        daggers.add("6. Kitchen Knife");
        daggers.add("25. Handcrafted Shiv");
        daggers.add("26. Whittling Knife");
        daggers.add("44. Naafiri, The Hound of a Hundred Bites");
    }
}

// Made by Damian Sclafani
package MemoryMerge;
import java.util.ArrayList;

public class PPScavenge {
    private ArrayList<String> goods = new ArrayList<>();
    private ArrayList<String> spellsheets = new ArrayList<>();
    private ArrayList<String> daggers = new ArrayList<>();
    private ArrayList<String> league = new ArrayList<>();
    private ArrayList<String> ores = new ArrayList<>();
    private ArrayList<String> nondurability = new ArrayList<>();

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

    public String scavengeLeague() {
        int rand = (int)(Math.random()*league.size());
        String result = "";
        result += league.get(rand);
        return result;
    }

    public String scavengeOres() {
        int rand = (int)(Math.random()*ores.size());
        String result = "";
        result += ores.get(rand);
        return result;
    }

    public String scavengeNondurability() {
        int rand = (int)(Math.random()*nondurability.size());
        String result = "";
        result += nondurability.get(rand);
        return result;
    }

    private void setItems() {
        // Goods
        goods.add("G1. Wooden Plank");
        goods.add("G2. Wooden Knife");
        goods.add("G3. Handcrafted Sword");
        goods.add("G4. Sword");
        goods.add("G5. Handcrafted Knife");
        goods.add("G6. Kitchen Knife");
        goods.add("G7. Double-Edged Blade");
        goods.add("G8. Handcrafted Mace");
        goods.add("G9. Mace");
        goods.add("G10. Rock Mace");
        goods.add("G11. Handcrafted Longsword");
        goods.add("G12. Longsword");
        goods.add("G13. Handcrafted Spear");
        goods.add("G14. Spear");
        goods.add("G15. Handcrafted Shortbow");
        goods.add("G16. Shortbow");
        goods.add("G17. Handcrafted Longbow");
        goods.add("G18. Longbow");
        goods.add("G19. Crossbow");
        goods.add("G20. Iron Bow");
        goods.add("G21. Venom Bow");
        goods.add("G22. Healerium Blade");
        goods.add("G23. Fire Spewer");
        goods.add("G24. Frostsword");
        goods.add("G25. Handcrafted Shiv");
        goods.add("G26. Wittling Knife");
        goods.add("G27. Forging Hammer");
        goods.add("G28. Iron");
        goods.add("G29. Gold");
        goods.add("G30. Steel");
        goods.add("G31. Obsidian");
        goods.add("G32. Pistol");
        goods.add("G33. Incendiary Pistol");
        goods.add("G34. Rocket Launcher");
        goods.add("G35. Spare Ammunition");
        goods.add("G36. Makeshift Rocket Launcher");
        goods.add("G37. Bandage");
        goods.add("G38. Performance Enhancer");
        goods.add("G39. Doctor's Note");
        goods.add("G40. Bone");
        goods.add("G41. Aatrox, The Darkin Blade");
        goods.add("G42. Kayn, The Shadow Reaper");
        goods.add("G43. Varus, The Arrow of Retribution");
        goods.add("G44. Naafiri, The Hound of a Hundred Bites");
        goods.add("G45. Chemical-Covered Bone");
        goods.add("G46. Trueice Bow");
        goods.add("G47. Divine Sunderer");
        goods.add("G48. Crown of the Shattered Queen");
        goods.add("G49. Duskblade of Draktharr");
        goods.add("G50. Echoes of Helia");
        goods.add("G51. Eclipse");
        goods.add("G52. Eveshroud");
        goods.add("G53. Galeforce");
        goods.add("G54. Goredrinker");
        goods.add("G55. Guinsoo's Rageblade");
        goods.add("G56. Hextech Rocketbelt");
        goods.add("G57. Iceborn Gauntlet");
        goods.add("G58. Infinity Edge");
        goods.add("G59. Locket of the Solari");
        goods.add("G60. Luden's Tempest");
        goods.add("G61. Moonstone Renewer");
        goods.add("G62. Radiant Virtue");
        goods.add("G63. Cull");
        goods.add("G64. Doran's Blade");
        goods.add("G65. Guardian's Blade");
        goods.add("G66. Guardian's Hammer");
        goods.add("G67. Tear of the Goddess");
        goods.add("G68. Health Potion");
        goods.add("G69. Refillable Potion");
        goods.add("G70. Corrupting Potion");
        goods.add("G71. Elixir of Wrath");
        goods.add("G72. Elixir of Sorcery");
        goods.add("G73. Elixir of Iron");
        goods.add("G74. B.F. Sword");
        goods.add("G75. Ironspike Whip");
        goods.add("G76. Eye of the Herald");
        goods.add("G77. Minion Dematerializer");
        goods.add("G78. Poro-Snax");
        goods.add("G79. Sheen");
        goods.add("G80. Pickaxe");
        goods.add("G81. Executioner's Calling");
        goods.add("G82. Tiamat");
        goods.add("G83. Ruby Crystal");
        goods.add("G84. Sapphire Crystal");
        goods.add("G85. Rejuvenation Bead");
        goods.add("G86. Recurve Bow");
        goods.add("G87. Last Whisper");
        goods.add("G88. Serrated Dirk");
        goods.add("G89. Riftmaker");
        goods.add("G90. Shurelya's Battlesong");
        goods.add("G91. Stridebreaker");
        goods.add("G92. Youmuu's Ghostblade");
        goods.add("G93. Bloodthrister");
        goods.add("G94. Chempunk Chainsword");
        goods.add("G95. Quicksilver Sash");
        goods.add("G96. Black Cleaver");
        goods.add("G97. Essence Reaver");
        goods.add("G98. Mercurial Scimitar");
        goods.add("G99. Silvermere Dawn");
        goods.add("G100. Hellfire Hatchet");
        goods.add("G101. Statikk Shiv");
        goods.add("G102. Kraken Slayer");
        goods.add("G103. Mortal Reminder");
        goods.add("G104. Serylda's Grudge");
        goods.add("G105. Morellonomicon");
        goods.add("G106. Titanic Hydra");
        goods.add("G107. Ravenous Hydra");
        goods.add("G108. Rabadon's Deathcap");
        goods.add("G109. The Collector");
        goods.add("G110. Rapid Firecannon");
        goods.add("G111. Zhonya's Hourglass");
        goods.add("G112. Dagger");
        goods.add("G113. Guardian's Horn");
        // Spellsheets
        spellsheets.add("S1. Splash");
        spellsheets.add("S2. Meteor");
        spellsheets.add("S3. Condensate");
        spellsheets.add("S4. Zap");
        spellsheets.add("S5. Snowball");
        spellsheets.add("S6. Giant Snowball");
        spellsheets.add("S7. Tidal Wave");
        spellsheets.add("S8. Wave");
        spellsheets.add("S9. Disperse");
        spellsheets.add("S10. Thunderdome");
        spellsheets.add("S11. Thunderbolt");
        spellsheets.add("S12. Thunderbolt");
        spellsheets.add("S13. Lightning Bolt");
        spellsheets.add("S14. Frost Wave");
        spellsheets.add("S15. Cryostasis");
        spellsheets.add("S16. Blizzard");
        spellsheets.add("S17. Passing Winds");
        spellsheets.add("S18. Harness Wind");
        spellsheets.add("S19. Ping");
        spellsheets.add("S20. Channeled Flames");
        spellsheets.add("S21. Wildfire");
        spellsheets.add("S22. Inferno");
        spellsheets.add("S23. Fire Spurt");
        spellsheets.add("S24. Flame Blast");
        spellsheets.add("S25. Flame Burst");
        spellsheets.add("S26. Fireball");
        spellsheets.add("S27. Fire Strike");
        spellsheets.add("S28. Cinderspell");
        spellsheets.add("S29. Flamewave");
        spellsheets.add("S30. Armageddon");
        spellsheets.add("S31. Catastrophe");
        spellsheets.add("S32. Steal Life");
        spellsheets.add("S33. Dread");
        spellsheets.add("S34. Raised Dread");
        spellsheets.add("S35. Call Upon Grudge!");
        spellsheets.add("S36. Dark Blossom");
        spellsheets.add("S37. Soul Drain");
        spellsheets.add("S38. Pure Darkness");
        spellsheets.add("S39. Curse of Decay");
        spellsheets.add("S40. Hex");
        spellsheets.add("S41. Life Tap");
        spellsheets.add("S42. Blood Magic");
        spellsheets.add("S43. Essence Steal");
        spellsheets.add("S44. Power Gain!");
        spellsheets.add("S45. Rapture");
        spellsheets.add("S46. Curse of Reckoning");
        spellsheets.add("S47. Curse of Binding");
        spellsheets.add("S48. Curse of Fragility");
        spellsheets.add("S49. Curse of the Leech");
        spellsheets.add("S50. Corrode");
        spellsheets.add("S51. Darkspear");
        spellsheets.add("S52. Curse of Temptation");
        spellsheets.add("S53. Tempt");
        spellsheets.add("S54. Lure");
        spellsheets.add("S55. Curse of Luring");
        spellsheets.add("S56. Blood Ray");
        spellsheets.add("S57. Blood Boil");
        spellsheets.add("S58. Darkdome");
        spellsheets.add("S59. Soul Steal");
        spellsheets.add("S60. Leech Life");
        spellsheets.add("S61. Corrode the Mind");
        spellsheets.add("S62. Corrode the Soul");
        spellsheets.add("S63. Corrosion");
        spellsheets.add("S64. Drain Life");
        spellsheets.add("S65. Fel Strike");
        spellsheets.add("S66. Wheel of Wrath");
        spellsheets.add("S67. Arising Darkness");
        spellsheets.add("S68. Approaching Darkness");
        spellsheets.add("S69. Stolen Knowledge");
        spellsheets.add("S70. Counterspell");
        spellsheets.add("S71. Dark Counterspell");
        spellsheets.add("S72. Reflect");
        spellsheets.add("S73. Reverse Time");
        spellsheets.add("S74. Echo");
        spellsheets.add("S75. Restart");
        spellsheets.add("S76. Dilate Time");
        spellsheets.add("S77. Extra Time");
        spellsheets.add("S78. Stuck in Time");
        spellsheets.add("S79. Time Blink");
        spellsheets.add("S80. Time Breach");
        spellsheets.add("S81. Time Crunch");
        spellsheets.add("S82. Launch Through Time");
        spellsheets.add("S83. Light Explosion");
        spellsheets.add("S84. Glint of Light");
        spellsheets.add("S85. Regenerate");
        spellsheets.add("S86. Branch Fling");
        spellsheets.add("S87. Boulder");
        spellsheets.add("S88. Moss Rock");
        spellsheets.add("S89. Blossom");
        spellsheets.add("S90. Nourish");
        spellsheets.add("S91. Holy Light");
        spellsheets.add("S92. Purity");
        spellsheets.add("S93. Tree of Life");
        spellsheets.add("S94. Nature's Blessing");
        spellsheets.add("S95. Harden");
        spellsheets.add("S96. Faith");
        spellsheets.add("S97. Spontaneous Light");
        spellsheets.add("S98. Godly Light");
        spellsheets.add("S99. For Glory!");
        spellsheets.add("S100. Earthen Shield");
        spellsheets.add("S101. Shower with Light");
        spellsheets.add("S102. Spread the Blessing");
        spellsheets.add("S103. Earthen Power");
        spellsheets.add("S104. Light's Prowess");
        spellsheets.add("S105. Earthen Armor");
        spellsheets.add("S106. Wave of Light");
        spellsheets.add("S107. Flash of Light");
        spellsheets.add("S108. Avalanche");
        spellsheets.add("S109. Light Storm");
        spellsheets.add("S110. Naturalize");
        spellsheets.add("S111. Earthen Shield");
        spellsheets.add("S112. Landslide");
        spellsheets.add("S113. Gust");
        spellsheets.add("S114. Elemental Blast");
        spellsheets.add("S115. Binding Heal");
        spellsheets.add("S116. Light's Judgement");
        spellsheets.add("S117. Light's Strength");
        spellsheets.add("S118. Overload");
        spellsheets.add("S119. Ward");
        spellsheets.add("S120. Everfrost");
        // Daggers
        daggers.add(goods.get(1));
        daggers.add(goods.get(4));
        daggers.add(goods.get(5));
        daggers.add(goods.get(24));
        daggers.add(goods.get(25));
        daggers.add(goods.get(43));
        daggers.add(goods.get(48));
        daggers.add(goods.get(50));
        daggers.add(goods.get(63));
        daggers.add(goods.get(87));
        daggers.add(goods.get(100));
        // League
        for (int i = 40; i < 44; i++)
            league.add(goods.get(i));
        for (int i = 46; i < 112; i++)
            league.add(goods.get(i));
        league.add(spellsheets.get(119));
        league.add(goods.get(11));
        // Ores
        for (int i = 27; i < 31; i++)
            ores.add(goods.get(i));
        ores.add(goods.get(82));
        ores.add(goods.get(83));
        // Non-Durability
        for (int i = 27; i < 31; i++)
            nondurability.add(goods.get(i));
        nondurability.add(goods.get(34));
        for (int i = 36; i < 40; i++)
            nondurability.add(goods.get(i));
        nondurability.add(goods.get(44));
        nondurability.add(goods.get(47));
        nondurability.add(goods.get(51));
        nondurability.add(goods.get(58));
        nondurability.add(goods.get(61));
        nondurability.add(goods.get(66));
        nondurability.add(goods.get(67));
        for (int i = 70; i < 73; i++)
            nondurability.add(goods.get(i));
        for (int i = 75; i < 78; i++)
            nondurability.add(goods.get(i));
        for (int i = 82; i < 85; i++)
            nondurability.add(goods.get(i));
        nondurability.add(goods.get(89));
        nondurability.add(goods.get(94));
        nondurability.add(goods.get(104));
        nondurability.add(goods.get(107));
        nondurability.add(goods.get(112));
    }
}

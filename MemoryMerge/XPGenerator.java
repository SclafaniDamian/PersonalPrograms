// Made By Damian Sclafani
package MemoryMerge;

public class XPGenerator {
    private int level;
    private int xpHas;
    private int xpNeeded;
    
    public XPGenerator(int level, int xpHas) {
        this.level = level;
        this.xpHas = xpHas;
        this.xpNeeded = level * 25;
    }

    public String generate(int xp) {
        int lvl = level;
        int has = xpHas;
        int needed = xpNeeded;
        while (xp != 0) {
            xp--;
            has++;
            if (has == needed) {
                lvl++;
                has = 0;
                needed += 25;
            }
        }
        return "Level " + lvl + "\n(" + has + " / " + needed + ")";
    }
}

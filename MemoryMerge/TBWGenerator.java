// Made By Damian Sclafani
package MemoryMerge;

public class TBWGenerator {
    
    public String generateAny() {
        int rand = (int)(Math.random()*12);     // not complete amount - +unlockable +equipment +full force
        String result = "";
        switch (rand) {
            case 0:
                result += "S1. Knight";
                break;
            case 1:
                result += "S2. Valkyrie";
                break;
            case 2:
                result += "S3. Heavy";
                break;
            case 3:
                result += "S4. Archer";
                break;
            case 4:
                result += "S5. Mage";
                break;
            case 5:
                result += "S6. Spy";
                break;
            case 6:
                result += "S7. Shieldman";
                break;
            case 7:
                result += "S8. Shifter";
                break;
            case 8:
                result += "S9. Bomber";
                break;
            case 9:
                result += "S10. Basic Giant";
                break;
            case 10:
                result += "S11. Hatchetman";
                break;
            case 11:
                result += "S12. Sparrow";
                break;
        }
        return result;
    }

    public String generateEquipment() {
        int rand = (int)(Math.random()*10);     // not complete amount - 183
        String result = "";
        switch (rand) {
            case 0:
                result += "E1. Trampoline";
                break;
            case 1:
                result += "E2. Sleeping Song";
                break;
            case 2:
                result += "E3. Zap";
                break;
            case 3:
                result += "E4. Bolt";
                break;
            case 4:
                result += "E5. Lightning Bolt";
                break;
            case 5:
                result += "E6. Booster";
                break;
            case 6:
                result += "E7. Mana Pump";
                break;
            case 7:
                result += "E8. Baseball";
                break;
            case 8:
                result += "E9. Darkness";
                break;
            case 9:
                result += "E10. Mimic Magic";
                break;
        }
        return result;
    }
}

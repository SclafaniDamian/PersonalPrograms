// Made By Damian Sclafani
package MemoryMerge;

public class TOMGenerator {
    
    public String generator() {
        int rand = (int)(Math.random()*10);     // not complete amount - 1909
        String result = "";
        switch (rand) {
            case 0:
                result += "1. Forgotten Scout";
                break;
            case 1:
                result += "2. Forgotten Pole Vaulter";
                break;
            case 2:
                result += "3. Forgotten Warper";
                break;
            case 3:
                result += "4. Forgotten Statue";
                break;
            case 4:
                result += "5. Forgotten Bomber";
                break;
            case 5:
                result += "6. Forgotten Flower";
                break;
            case 6:
                result += "7. Forgotten Ninja";
                break;
            case 7:
                result += "8. Forgotten Runner";
                break;
            case 8:
                result += "9. Cienna, The Forgotten";
                break;
            case 9:
                result += "10. Forgotten Mole";
                break;
        }
        return result;
    }
}

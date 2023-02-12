// Made By Damian Sclafani
package MemoryMerge;

public class RockPaperScissors {
    
    public String challenge(String input) {
        if (input.equalsIgnoreCase("Rock")) {
            if (getAIAnswer().equals("Rock")) {
                return "Tie!";
            }
            else if (getAIAnswer().equals("Paper")) {
                return "You Lose!";
            }
            else if (getAIAnswer().equals("Scissors")) {
                return "You Win!";
            }
            else {
                return "ERROR";
            }
        }
        else if (input.equalsIgnoreCase("Paper")) {
            if (getAIAnswer().equals("Rock")) {
                return "You Win!";
            }
            else if (getAIAnswer().equals("Paper")) {
                return "Tie!";
            }
            else if (getAIAnswer().equals("Scissors")) {
                return "You Lose!";
            }
            else {
                return "ERROR";
            }
        }
        else if (input.equalsIgnoreCase("Scissors")) {
            if (getAIAnswer().equals("Rock")) {
                return "You Lose!";
            }
            else if (getAIAnswer().equals("Paper")) {
                return "You Win!";
            }
            else if (getAIAnswer().equals("Scissors")) {
                return "Tie!";
            }
            else {
                return "ERROR";
            }
        }
        else {
            return "ERROR";
        }
    }

    public String getAIAnswer() {
        int rand = (int)(Math.random()*3);
        switch (rand) {
            case 0:
                return "Rock";
            case 1:
                return "Paper";
            case 2:
                return "Scissors";
            default:
                return "ERROR";
        }
    }
}

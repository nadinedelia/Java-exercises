package academy.learnprogramming;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        int highScore = calculateHighScorePosition(1000);
    displayHighScorePosition("Nadine", highScore);
        highScore = calculateHighScorePosition(500);
        displayHighScorePosition("Matt", highScore);
        highScore = calculateHighScorePosition(400);
        displayHighScorePosition("Guido", highScore);
        highScore = calculateHighScorePosition(99);
        displayHighScorePosition("Pat", highScore);

    }

    public static void displayHighScorePosition(String playerName, int highScore) {
        System.out.println(playerName + " managed to get into position " + highScore + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        }

        return 4;
        }

    }

    }


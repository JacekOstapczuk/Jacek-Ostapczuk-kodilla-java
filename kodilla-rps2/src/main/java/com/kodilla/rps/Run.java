package com.kodilla.rps;

import lombok.Data;
import java.util.Random;

import static com.kodilla.rps.Won.*;

@Data
public class Run {
    Game game = new Game();
    FrontShow frontShow = new FrontShow();
    int numberOfRounds = 1;
    int playerWon = 0;
    int computerWon = 0;


    public boolean run() {
       boolean answer =false;
        int quantityOfRounds = frontShow.askNumberOfRounds();
        frontShow.showInfo();

        while (true) {
            int playerMove = frontShow.askMove();
            int computerMove = new Random().nextInt(1, 4);
           Won wonSide = game.wonSide(playerMove, computerMove);
            if (wonSide.equals(GRACZ)) {playerWon++;}
            if (wonSide.equals(KOMPUTER)) {computerWon++;}
            frontShow.showMove(playerMove, computerMove, wonSide, numberOfRounds, playerWon, computerWon);

            if (playerWon == quantityOfRounds) {System.out.println("Wygral gracz !! \n ");
                break;
            }

            if (computerWon == quantityOfRounds) {System.out.println("Wygral komputer \n ");
                break;
            }
            numberOfRounds++;
        }
        answer = frontShow.aksWhatNext();
        return answer;
    }
}
package com.kodilla.rps;

import lombok.Data;
import java.util.Scanner;

@Data
public class FrontShow {
    Game game = new Game();
    static String playerName = "";

    public void askName() {
        System.out.println("Podaj swoje imie");
        playerName = new Scanner(System.in).next();
        System.out.println("Witaj " + playerName);
    }

    public int askNumberOfRounds() {
        System.out.println("Podaj do ilu zwycięst chcesz grać");
        int quantityOfRounds = new Scanner(System.in).nextInt();
        System.out.println("Gra bedzie sie toczyla do " + quantityOfRounds + " zwyciestw.  Powodzenia!!!!");
        return quantityOfRounds;
    }

    public void showInfo() {
        System.out.println("Oto zasady gry: ");
        System.out.println("klawisz 1 – zagranie \"kamien\"");
        System.out.println("klawisz 2 – zagranie \"papier\"");
        System.out.println("klawisz 3 – zagranie \"nożyce\"");
        System.out.println("klawisz x – zakonczenie gry");
        System.out.println("klawisz n – uruchomienie gry od nowa");
    }

    public int askMove() {
        System.out.println("prosze wykonac ruch");
        int move = new Scanner(System.in).nextInt();
        return move;
    }

    public void showMove(int playerMove, int computerMove, Won wonSide, int roundNumber, int playerWon, int computerWon) {
        System.out.println("Gracz dokonal ruchu " + game.translate(playerMove) +
                "\nKomputer dokonal ruchu " + game.translate(computerMove) +
                "\nWygranym ostatniej rundy jest " + wonSide +
                "\nDotychczas rozegrano " + roundNumber + " rund" +
                "\nZ ktorych gracz wygral " + playerWon + " rund" +
                "\nKomputer wygal " + computerWon);
    }

    public boolean aksWhatNext() {
        boolean answer = false;
        System.out.println("Gra zakonczyla sie co chcesz zrobic teraz");
        System.out.println("klawisz x – zakonczenie gry");
        System.out.println("klawisz n – uruchomienie gry od nowa");
        if (new Scanner(System.in).next().equals("n")) {
            answer = true;
        } else {
            System.out.println("Dowidzenia " + playerName);
        }
        return answer;
    }
}
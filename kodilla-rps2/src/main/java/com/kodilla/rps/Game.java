package com.kodilla.rps;

import lombok.Data;
import static com.kodilla.rps.Won.*;
import static com.kodilla.rps.Type.*;
@Data
public class Game {

    public Type translate(int kindOfMove) {
        if (kindOfMove == 1) {
            return KAMIEN;
        } else if (kindOfMove == 2) {
            return NOZYCE;
        } else if (kindOfMove == 3) {
            return PAPIER;
        } else {
            return null;
        }
    }

    public Won wonSide(int player, int computer) {
        if (player == computer) {return REMIS;}
        else if (player == 1 && computer == 2) {return GRACZ;}
        else if (player == 1 && computer == 3) {return KOMPUTER;}
        else if (player == 2 && computer == 1) {return KOMPUTER;}
        else if (player == 2 && computer == 3) {return GRACZ;}
        else if (player == 3 && computer == 1) {return GRACZ;}
        else if (player == 3 && computer == 2) {return KOMPUTER;}
        else {return null;}
    }
}
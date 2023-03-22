package com.kodilla.rps;

public class KodillaRpsApplication {

    public static void main(String[] args) {

        Run run = new Run();
        FrontShow frontShow = new FrontShow();
        boolean answer = true;

        frontShow.askName();
        while (answer) {
            answer = run.run();
        }
    }
}

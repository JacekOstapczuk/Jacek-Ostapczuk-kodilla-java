package com.kodilla.exception.io;

import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondChallengeTestSuit {


    @Test
    public void whenXisBelow1() {

        // given
        SecondChallenge secondChallenge1 = new SecondChallenge();

        // when & then
        assertThrows(Exception.class, () -> secondChallenge1.probablyIWillThrowException(0.5 , 2.0));
    }

    @Test
    public void whenXisAbove2() {

        // given
        SecondChallenge secondChallenge2 = new SecondChallenge();

        // when & then
        assertThrows(Exception.class, () -> secondChallenge2.probablyIWillThrowException( 3 , 2.0));
    }

    @Test
    public void whenYisNotOneAndHalf() {

        // given
        SecondChallenge secondChallenge3 = new SecondChallenge();

        // when & then
        assertThrows(Exception.class, () -> secondChallenge3.probablyIWillThrowException(1.5 , 1.5));

    }

    @Test
    public void whenDataDontReturnException() {

        // given
        SecondChallenge secondChallenge4 = new SecondChallenge();

        // when & then
        assertDoesNotThrow(() -> secondChallenge4.probablyIWillThrowException(1.5    , 2.0));
    }
}

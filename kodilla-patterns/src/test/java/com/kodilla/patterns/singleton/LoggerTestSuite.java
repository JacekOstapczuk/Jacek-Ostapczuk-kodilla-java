package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    @Test
    public void testLogger(){

        //Given
        Logger logger= Logger.INSTANCE;
        logger.log("ToJaJacek");
        //When
        String lastTestLog = logger.getLastLog();
        //Then
        assertEquals(lastTestLog, "ToJaJacek");

    }
}

package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
public void    testDefaultSharingStrategies() {
        //Given
User milenials = new Millenials("Jonathan");
User yGeneration = new YGeneration( "Jacob");
User zGeneration = new ZGeneration("TreeFlower");
        //When
        String whatMilenialsUse = milenials.socialPublisher();
        System.out.println(  milenials.getUserName() +  whatMilenialsUse);
        String whatyGenerationUse =yGeneration.socialPublisher();
        System.out.println(  yGeneration.getUserName() + whatyGenerationUse);
        String whatzGenerationUse = zGeneration.socialPublisher();
        System.out.println(  zGeneration.getUserName() +  whatzGenerationUse );
        //Then
        assertEquals(" is using Facebook " ,whatMilenialsUse);
        assertEquals("is using Twitter " ,whatyGenerationUse);
        assertEquals( " is using Snapchat ",whatzGenerationUse);
    }

@ Test
    public void testIndividualSharingStrategy(){

    //Given
    User confusedMilenials = new Millenials("Samantha");

    //When
    String whatConfusedMilenialsUse = confusedMilenials.socialPublisher();
    System.out.println(  confusedMilenials.getUserName() +  whatConfusedMilenialsUse);
    confusedMilenials.setSocialPublisher(new SnapchatPublisher());
    whatConfusedMilenialsUse = confusedMilenials.socialPublisher();
    System.out.println(  confusedMilenials.getUserName() +  whatConfusedMilenialsUse);

    //Then
    assertEquals(whatConfusedMilenialsUse, " is using Snapchat ");
    }
}

package com.kodilla.patterns.strategy.social;

public non-sealed class YGeneration extends  User{

    public YGeneration (String userName) {
        super (userName);
    this.socialPublisher =new TwitterPublisher();
    }
}
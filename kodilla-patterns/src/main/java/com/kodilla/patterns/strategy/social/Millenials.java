package com.kodilla.patterns.strategy.social;

public non-sealed class Millenials  extends  User{

    public Millenials (String userName) {
        super (userName);
        this.socialPublisher = new FacebookPublisher();
    }
}
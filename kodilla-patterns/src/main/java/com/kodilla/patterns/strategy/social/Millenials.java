package com.kodilla.patterns.strategy.social;

public final class Millenials  extends  User   {

    public Millenials (String userName) {
        super (userName);
        this.socialPublisher = new FacebookPublisher();
    }
}
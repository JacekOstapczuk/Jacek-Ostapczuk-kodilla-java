package com.kodilla.patterns.strategy.social;

public non-sealed class ZGeneration extends  User{

    public ZGeneration (String userName) {
        super (userName);
        this.socialPublisher = new SnapchatPublisher();
    }
}
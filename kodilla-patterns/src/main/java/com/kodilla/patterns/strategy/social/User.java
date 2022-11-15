package com.kodilla.patterns.strategy.social;

public sealed class User
permits Millenials, YGeneration, ZGeneration {

    private final String userName;
protected  SocialPublisher socialPublisher;
    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public String sharePost() {
        return "Opublikowałem wiadoność";
    }

    public String socialPublisher(){
        return socialPublisher.share();
    }

    public void setSocialPublisher (SocialPublisher socialPublisher){
        this.socialPublisher =socialPublisher;
    }
}

package com.kodilla.patterns.strategy.social;

public class FacebookPublisher implements SocialPublisher {

    @Override
    public String share() {
        return "You are using Facebook";
    }
}

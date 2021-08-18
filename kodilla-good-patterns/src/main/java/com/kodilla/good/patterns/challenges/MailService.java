package com.kodilla.good.patterns.challenges;

public class MailService implements InformationService {

    @Override
    public void inform(User user, Product product) {
        System.out.println("Sending mail to user " + user.getName() + " about " + product.getName());
    }
}

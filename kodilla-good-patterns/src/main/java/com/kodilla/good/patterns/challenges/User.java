package com.kodilla.good.patterns.challenges;

public final class User {

    private final String name;
    private final String nick;
    private final String email;

    public User(final String name, final String nick, final String address) {
        this.name = name;
        this.nick = nick;
        this.email = address;
    }

    public String getName() {
        return name;
    }

    public String getNick() {
        return nick;
    }

    public String getEmail() {
        return email;
    }
}

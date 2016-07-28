package com.jcore.model;

public class Message {
    private String message;

    public String getMessage() {
        return message;
    }

    private Message(String message) {
        this.message = message;
    }

    public static Message from(String text) {
        return new Message(text);
    }

    public static Message from(Object number) {
        return from(String.valueOf(number));
    }

    public static Message from(Integer number) {
        return from(String.valueOf(number));
    }
}

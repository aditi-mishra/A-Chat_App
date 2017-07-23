package com.aditi.flashchatnewfirebase;

/**
 * Created by Croma on 24-07-2017.
 */

public class InstantMessage {
    public InstantMessage(String message, String author) {
        this.message = message;
        this.author = author;
    }

    private String message;
    private String author;

    public InstantMessage() {
    }

    public String getMessage() {
        return message;
    }

    public String getAuthor() {
        return author;
    }
}

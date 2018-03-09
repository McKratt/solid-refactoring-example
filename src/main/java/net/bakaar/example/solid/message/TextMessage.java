package net.bakaar.example.solid.message;

public class TextMessage implements Message {
    private final String text;

    public TextMessage(String text) {
        this.text =  text;
    }
}

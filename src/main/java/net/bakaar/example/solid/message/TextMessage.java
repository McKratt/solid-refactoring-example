package net.bakaar.example.solid.message;

class TextMessage implements Message {
    private final String text;

    TextMessage(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}

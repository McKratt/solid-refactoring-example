package net.bakaar.example.solid.message;

public class MessageHandler {
    public String print(MessageNumber numberMessage) {
        return String.format("I receive an Integer Message with number %d", numberMessage.getValue());
    }
}

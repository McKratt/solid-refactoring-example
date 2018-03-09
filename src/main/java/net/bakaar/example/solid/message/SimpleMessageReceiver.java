package net.bakaar.example.solid.message;

import java.io.StringWriter;

public class SimpleMessageReceiver implements MessageReceiver {
    private final StringWriter writer;

    public SimpleMessageReceiver(StringWriter writer) {
        this.writer = writer;
    }

    @Override
    public void receive(Message message) {
        writer.write("I receive an Integer Message with number 4");
    }
}

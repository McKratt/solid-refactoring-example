package net.bakaar.example.solid.message;

import java.io.StringWriter;

public class SimpleMessageReceiver implements MessageReceiver {
    private final StringWriter writer;

    SimpleMessageReceiver(StringWriter writer) {
        this.writer = writer;
    }

    @Override
    public void receive(Message message) {
        if (message instanceof NumberMessage) {
            writer.write(String.format("I receive an Integer Message with number %s", ((NumberMessage) message).getNumber()));
        } else if (message instanceof TextMessage) {
            writer.write(String.format("I receive a Text Message with saying '%s'", ((TextMessage) message).getText()));
        } else {
            writer.write("Unknown Message received");
        }
    }
}

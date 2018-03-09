package net.bakaar.example.solid.message;

import java.io.StringWriter;

// ISP ok, LSP ok
public class SimpleMessageReceiver implements MessageReceiver {

    // FIXME This class depend on all the Message's implementations DIP

    // FIXME This writer is part of the way we handle message not from the way we receive them SRP
    private final StringWriter writer;

    SimpleMessageReceiver(StringWriter writer) {
        this.writer = writer;
    }

    // FIXME If I want to change the way I receive message I also have to change this class SRP
    @Override
    public void receive(Message message) {
        // FIXME If I want to add a new Message Type I have to extends this class SRP
        if (message instanceof NumberMessage) {
            //FIXME if I want to change the way I handle NumberMessage, I have to modify this class OCP
            writer.write(String.format("I receive an Integer Message with number %s", ((NumberMessage) message).getNumber()));
        } else if (message instanceof TextMessage) {
            //FIXME if I want to change the way I handle TextMessage, I have to modify this class OCP
            writer.write(String.format("I receive a Text Message with saying '%s'", ((TextMessage) message).getText()));
        } else {
            //FIXME if I want to change the way I handle UnknownMessage, I have to modify this class OCP
            writer.write("Unknown Message received");
        }
    }
}

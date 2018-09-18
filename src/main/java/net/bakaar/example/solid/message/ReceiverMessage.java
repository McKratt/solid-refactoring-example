package net.bakaar.example.solid.message;

public class ReceiverMessage {

    private MessageHandler messageHandler;

    public ReceiverMessage(MessageHandler messageHandler) {
        this.messageHandler = messageHandler;
    }

    public void receive(MessageNumber numberMessage) {
        messageHandler.print(numberMessage);
    }

}

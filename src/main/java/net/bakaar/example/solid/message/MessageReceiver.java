package net.bakaar.example.solid.message;

public interface MessageReceiver {

    void receive(Message message);

    void print (Message message);
}

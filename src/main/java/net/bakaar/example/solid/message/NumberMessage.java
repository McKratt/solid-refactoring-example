package net.bakaar.example.solid.message;

public class NumberMessage implements Message {
     private int number;

    public NumberMessage(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}

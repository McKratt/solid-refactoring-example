package net.bakaar.example.solid.message;

class NumberMessage implements Message {
    private int number;

    NumberMessage(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}

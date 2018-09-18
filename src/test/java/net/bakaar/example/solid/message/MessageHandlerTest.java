package net.bakaar.example.solid.message;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MessageHandlerTest {

    @Test
    public void print() {
        // Given
        int value = 6;
        MessageNumber numberMessage = new MessageNumber(value);
        MessageHandler messageHandler = new MessageHandler();
        // When
        String print = messageHandler.print(numberMessage);
        // Then
        assertThat(print).isEqualTo("I receive an Integer Message with number " + value);
    }
}
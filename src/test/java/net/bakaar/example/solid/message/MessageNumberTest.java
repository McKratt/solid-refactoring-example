package net.bakaar.example.solid.message;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MessageNumberTest {

    @Test
    public void should_instantiate_message_number() {
        // Given
        int number = 5;

        // When
        MessageNumber messageNumber = new MessageNumber(number);

        // Then
        assertThat(messageNumber).isNotNull();
        assertThat(messageNumber.getValue()).isEqualTo(number);
    }
}
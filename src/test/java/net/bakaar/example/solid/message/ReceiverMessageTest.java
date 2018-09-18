package net.bakaar.example.solid.message;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class ReceiverMessageTest {
    @Test
    public void receiveShouldCallMessageHandler() {
        // Given
        MessageHandler messageHandler = mock(MessageHandler.class);
        ReceiverMessage receiverMessage = new ReceiverMessage(messageHandler);
        MessageNumber numberMessage = new MessageNumber(8);
        // When
        receiverMessage.receive(numberMessage);
        // Then
        verify(messageHandler, times(1)).print(numberMessage);

    }
}
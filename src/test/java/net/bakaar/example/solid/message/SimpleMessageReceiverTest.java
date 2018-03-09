package net.bakaar.example.solid.message;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.StringWriter;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class SimpleMessageReceiverTest {

    @Mock
    private StringWriter writer;

    @InjectMocks
    private SimpleMessageReceiver receiver;

    @Test
    public void receive_should_treat_number_message() {
        //Given
        //When
        receiver.receive(new NumberMessage(5));
        //Then
        verify(writer).write("I receive an Integer Message with number 5");
    }
}
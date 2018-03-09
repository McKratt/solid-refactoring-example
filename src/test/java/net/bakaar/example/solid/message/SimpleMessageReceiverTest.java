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
    public void receive_should_handle_number_message() {
        //Given
        int number = 5;
        //When
        receiver.receive(new NumberMessage(number));
        //Then
        verify(writer).write("I receive an Integer Message with number " + number);
    }

    @Test
    public void receive_should_handle_text_message() {
        //Given
        String text = "My Text";
        //When
        receiver.receive(new TextMessage(text));
        //Then
        verify(writer).write("I receive a Text Message with saying '" + text + "'");


    }

    @Test
    public void receive_should_handle_unknown_message() {
        //Given
        //When
        receiver.receive(new UnknownMessage());
        //Then
        verify(writer).write("Unknown Message received");
    }
}
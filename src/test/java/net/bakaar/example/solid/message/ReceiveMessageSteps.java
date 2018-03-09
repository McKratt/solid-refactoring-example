package net.bakaar.example.solid.message;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.io.StringWriter;

import static org.assertj.core.api.Assertions.assertThat;

public class ReceiveMessageSteps {
    private StringWriter writer = new StringWriter();
    private MessageReceiver receiver = new SimpleMessageReceiver(writer);

    @When("^we receive an Number Message with (\\d+)$")
    public void weReceiveAnNumberMessageWith(int number) throws Throwable {
        receiver.receive(new NumberMessage(number));
    }

    @Then("^the message \"([^\"]*)\" should be printed$")
    public void theMessageShouldBePrinted(String message) throws Throwable {
        assertThat(writer.toString()).isEqualTo(message);
    }

    @When("^we receive an Text Message with \"([^\"]*)\"$")
    public void weReceiveAnTextMessageWith(String text) throws Throwable {
        receiver.receive(new TextMessage(text));
    }

    @When("^we receive an Unknown Message$")
    public void weReceiveAnUnknownMessage() throws Throwable {
        receiver.receive(new UnknownMessage());
    }
}

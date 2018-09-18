package net.bakaar.example.solid.message;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class NumberStepDefinition {

    private ReceiverMessage receiverMessage;
    private MessageHandler messageHandler;
    private MessageNumber numberMessage;

    @When("^we receive an Number Message with (\\d+)$")
    public void weReceiveAnNumberMessageWith(int number) {
        this.messageHandler = new MessageHandler();
        this.receiverMessage = new ReceiverMessage(this.messageHandler);
        numberMessage = new MessageNumber(number);
        this.receiverMessage.receive(numberMessage);
    }

    @Then("^the message \"([^\"]*)\" should be printed$")
    public void theMessageShouldBePrinted(String expectedMessage) {
        Assert.assertEquals(expectedMessage, messageHandler.print(numberMessage));
    }

    @When("^we receive an Text Message with \"([^\"]*)\"$")
    public void weReceiveAnTextMessageWith(String arg0) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}

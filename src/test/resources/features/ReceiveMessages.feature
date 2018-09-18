Feature: Receive Messages from our Broker

  We can receive different types of messages on the same endpoint.
  Each message must be treated independently.
  For each Message received we should have a corresponding message printed.

  Scenario: Receiving Number Message
    When we receive a Number Message with 4
    Then the message "I receive an Integer Message with number 4" should be printed

  Scenario: Receiving Text Message
    When we receive a Text Message with "My String"
    Then the message "I receive a Text Message with saying 'My String'" should be printed

  Scenario: Receiving Unknown Message
    When we receive an Unknown Message
    Then the message "Unknown Message received" should be printed
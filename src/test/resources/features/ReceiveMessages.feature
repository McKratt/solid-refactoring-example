Feature: Receive Messaages from our Broker

  We can receive different type of messages on the same endoint. Each message must be treated independently.

  Scenario: Receiving Number Message
    When we receive an Number Message with 4
    Then the message "I receive an Integer Message with number 4" should be printed

  Scenario: Receiving Text Message
    When we receive an Text Message with "My String"
    Then the message "I receive an String Message with saying 'My String'" should be printed

  Scenario: Receiving Unknown Message
    When we receive an Unknown Message
    Then the message "Unknown Message received" should be printed
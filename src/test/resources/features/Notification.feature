Feature: Notification of Api demo

  Scenario: Incoming Message Notification

    When I click on "App" on "HomeScreen"
    Then "Notification" text should display

    When I click on "Notification" on "AppScreen"
    Then "IncomingMessage" text should display

    When I click on "IncomingMessage" on "NotificationScreen"
    Then "Show App Notification" text should visible on button

    When I click on "Show App Notification" button on "IncomingMessageScreen"
    Then Message notification should be visible
Feature: 'secure dialog' in API Demo Application

  Scenario: Navigation to "Secure Dialog"

    When I click on "App" on "HomeScreen"
    Then "Activity" text should display

    When I click on "Activity" on "AppScreen"
    Then "Secure Surfaces" text should display

    When I click on "Secure Surfaces" on "ActivityScreen"
    Then "Secure Dialog" text should display

    When I click on "Secure Dialog" on "SecureSurfaceScreen"
    Then "SHOW SECURE DIALOG" text should visible on button

    When I click on "Show secure dialog" button on "SecureDialogScreen"
    Then Dialog should be visible

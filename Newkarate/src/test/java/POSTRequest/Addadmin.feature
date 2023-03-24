Feature: Add admin to event by Event owner

  # Here is the base url
  Background: 
    * url baseurl

  Scenario: Add admin to Event
    Given path '/services/event/v1/event/c9k0mkiqe7dispa328vg/admins'
    # we will send attendee id in the request body
    When request
      """
      {
      
       "assignedAttendeeIds": ["c9kj73t1mr2285sljc8g"]
      
      }

      """
    And header Content-Type = "application/json"
    And header Authorization = MikeOwnertokenID
    When method POST
    Then status 200
    * print response

  Scenario: Remove admin from Event by owner
    Given path '/services/event/v1/event/c9k0mkiqe7dispa328vg/admin/c9kj73t1mr2285sljc8g'
    And header Content-Type = "application/json"
    And header Authorization = MikeOwnertokenID
    When method DELETE
    Then status 200
    * print response

  Scenario: Add admin to Event by owner
    Given path '/services/event/v1/event/c9k0mkiqe7dispa328vg/admins'
    # we will send attendee id in the request body
    When request
      """
      {
      
       "assignedAttendeeIds": ["c9kj73t1mr2285sljc8g"]
      
      }

      """
    And header Content-Type = "application/json"
    And header Authorization = MikeOwnertokenID
    When method POST
    Then status 200
    * print response

  Scenario: Remove admin from Event by Admin
    Given path '/services/event/v1/event/c9k0mkiqe7dispa328vg/admin/c9kj73t1mr2285sljc8g'
    And header Content-Type = "application/json"
    And header Authorization = NuraAdmintoken
    When method DELETE
    Then status 200
    * print response

  Scenario: Remove admin from Event by Normaluser
    Given path '/services/event/v1/event/c9k0mkiqe7dispa328vg/admin/c9kj73t1mr2285sljc8g'
    And header Content-Type = "application/json"
    And header Authorization = AndyEventAttendee
    When method DELETE
    Then status 200
    * print response

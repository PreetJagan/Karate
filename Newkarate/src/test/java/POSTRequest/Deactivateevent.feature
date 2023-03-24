Feature: De-activate (Re-activate) Event By Owner,Admin & Normal user (Attendee)

 Background: 
    * url baseurl

  Scenario: Event Deactivation by Event Owner
  
    Given path '/services/event/v1/event/c9ju47f17gsku7n7rmn0/deactivate'
    And header Accept = "application/json"
    And header Content-Type = "multipart/from-data"
    And header Authorization = MikeOwnertokenID
    When method POST
    Then status 200
    * print response
    
    
    
    Scenario: Event Reactivation by Event Owner
    
    Given path '/services/event/v1/event/c9ju47f17gsku7n7rmn0/reactivate'
    And header Accept = "application/json"
    And header Content-Type = "multipart/from-data"
    And header Authorization = MikeOwnertokenID
    When method POST
    Then status 200
    * print response
    
    
    

  Scenario: Event Deactivation by Event Admin
  
    Given path '/services/event/v1/event/c9ju47f17gsku7n7rmn0/deactivate'
    And header Accept = "application/json"
    And header Content-Type = "multipart/from-data"
    And header Authorization = NuraAdmintoken
    When method POST
    Then status 200
    * print response
    
    
    
     Scenario: Event Reactivation by Event Owner
     
    Given path '/services/event/v1/event/c9ju47f17gsku7n7rmn0/reactivate'
    And header Accept = "application/json"
    And header Content-Type = "multipart/from-data"
    And header Authorization = NuraAdmintoken
    When method POST
    Then status 200
    * print response
    
    
    Scenario: Event Deactivation by Event Attendee
  
    Given path '/services/event/v1/event/c9ju47f17gsku7n7rmn0/deactivate'
    And header Accept = "application/json"
    And header Content-Type = "multipart/from-data"
    And header Authorization = AndyEventAttendee
    When method POST
    Then status 200
    * print response 
    * match response data 
  
    
    
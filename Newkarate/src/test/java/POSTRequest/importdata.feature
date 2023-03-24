Feature: Import data from response to a file 

 

  Scenario: Api response to a file 
    Given path 'https://reqres.in/api/users'
    And header Accept = "application/json"
    When method GET
    Then status 200
    * print reponse
    
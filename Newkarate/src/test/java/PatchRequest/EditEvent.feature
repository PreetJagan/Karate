Feature: Update Event

  Background: 
    * url url

  Scenario: User able to create a Event
    Given path '/services/event/v1/event/c9k0mkiqe7dispa328vg'
    When request 
     """
     {

    "title": "National Game of Cricket",

    "subtitle": "National Level Of Game",

    "details": "All State of Player are playing to Cricket",

    "eventStartTime": "2023-11-22T06:20:00Z",

    "eventEndTime": "2024-12-22T11:30:00Z",

    "location": "https://www.google.com/maps/place/Pune,+Maharashtra/",

    "isModerated": false,

    "isPostingOpen": false,

    "isPublic": false,

    "requireAttendeeApproval": false

}
      """
    And header Content-Type = "application/json"
    And header Authorization = tokenID
    And method PATCH 
    And status 200
    * print response
    And def jsonBody = read('./src/test/java:Test/EventData.json')
    
      #read('classpath:directory/file.json')
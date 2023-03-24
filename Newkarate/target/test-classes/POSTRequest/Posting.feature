Feature: Post Image,Video & Short text on Event Newsfeed

  Background: 
    * url baseurl

  Scenario: Post Image by EventOwner
    Given path '/services/event/v1/event/c9ju47f17gsku7n7rmn0/post'
    And header Accept = "application/json"
    And header Content-Type = "multipart/from-data"
    And header Authorization = MikeOwnertokenID
    And request {contentDataType:'text', textContent:'Hi all have a great day'}

     When method POST
    Then status 200
    * print response

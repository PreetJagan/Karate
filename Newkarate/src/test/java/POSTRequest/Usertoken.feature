Feature: To generate a user token id

  Background: 
    * url baseurl
    * def expectedOutput = read('../Data/Userdata.json')

  Scenario: Generate token id
    Given path "/services/auth/v1/login"
    And request {username:'Mike', password:'Test123@'}
    When method POST
    Then status 200
    * print response
    And match response.data.username == 'Mike'
    And match response.data.documentId == 'c8evsrdkh4do72se0'
    And match response.data.token == '#ignore'









 #* def token = response.token
 #
#* def len = 
 #
#
 #""" 
 #function(arg) {
  #
  #return arg.token;
  #
 #} 
 #"""
 #* def token = call len token
 #Then print 'usertoken is-->' ,usertoken

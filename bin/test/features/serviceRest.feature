#Author: juan.gallon@upb.edu.co


Feature: Petition REST
  I want to consult user for petition REST
  

  Scenario: Submit a REST request and validate the data    
    When "JuanPablo" send petition
    Then I valid that the user exists Chad O'Reilly and response code is 200
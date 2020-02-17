#Author: juan.gallon@upb.edu.co


Feature: I as a user of cybermetro
  I want to add a product to the shopping cart
  

  Scenario: Add a product to the shopping cart and validate that it is added correctly
    Given "JuanPablo" open website
    When I add a product to the shopping cart
    Then I should see that the product was added successfully
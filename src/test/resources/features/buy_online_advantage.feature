#Author: Claudia Nieto
#Email: cmarce86@yahoo.es


Feature: Validate that through a created account a purchase is made on the advantage platform
  As a user of the platform
  I want to register on the advantage platform
  To be able to make purchases online


  Background:Access the advantage platform
    Given that I access the advantage online shopping platform

  @CaseOne
  Scenario Outline: Validate the creation of an account
    When who made the registration for the creation of the account
      | <userName> | <email> | <password> | <firstsName> | <lastName> | <phoneNumber> | <country> | <city> | <address> | <state> | <postalCode> |
    Then I verify that the account was created "<userName>"
    Examples:
      | userName | email                        | password     | firstsName | lastName | phoneNumber | country | city  | address       | state  | postalCode |
      | clau70   | toffofruppufe-27@yopmail.com | Claudia12345 | Milena     | Pineda   | 12345678910 | Armenia | Bello | Cra 5 N 68-49 | Estado | 009        |


  @CaseTwo
  Scenario Outline: Validate successful product purchase
    When I add the item to the cart I proceed to the payment
      | <userName> | <password> |<category>| <nameProduct> |

   Then I verify the payment order with the product "<nameProduct>"
    Examples:
      | userName | password     | category | nameProduct                |
      | clau70   | Claudia12345 | laptops  | HP ENVY - 17T TOUCH LAPTOP |


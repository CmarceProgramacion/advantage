#Autos: Claudia Nieto
#Email: cmarce86@yahoo.es


Feature: Validar que atraves de una cuenta creada se realice una compra en la plataforma advantage
  como usuario de la plataforma
  Quiero registrarme en la plataforma advantage
  Para poder realizar compras en online
  #como- quiero -para

  Background:Acceder a la plataforma advantage
    Given que accedo a la plataforma de compras en linea advantage

  @CaseOne
  Scenario Outline: Validar la creacion de una cuenta
    When que realizo el registro para la creacion de la cuenta
      | <userName> | <email> | <password> | <firstsName> | <lastName> | <phoneNumber> | <country> | <city> | <address> | <state> | <postalCode> |
    Then verifico que se creo la cuenta "<userName>"
    Examples:
      | userName | email                        | password     | firstsName | lastName | phoneNumber | country | city  | address       | state  | postalCode |
      | clau70   | toffofruppufe-27@yopmail.com | Claudia12345 | Milena     | Pineda   | 12345678910 | Armenia | Bello | Cra 5 N 68-49 | Estado | 009        |


  @CaseTwo
  Scenario Outline: Validar compra de la productos exitoso
    When agrego el articulo al carro procedo al pago
      | <userName> | <password> |<category>| <nameProduct> |

   Then Verifico la orden de pago con el producto "<nameProduct>"

    Examples:
      | userName | password     | category | nameProduct                |
      | clau70   | Claudia12345 | laptops  | HP ENVY - 17T TOUCH LAPTOP |


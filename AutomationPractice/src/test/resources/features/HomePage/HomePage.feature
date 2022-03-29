Feature: Add the items to cart and assert the checkout price

  @home_page
  Scenario Outline: Add the items to cart and assert the checkout price
    Given Add the items to the cart "<AddItem1>" "<Size1>" "<Color1>" "<itemName1>"
    And Add the items to the cart "<AddItem2>" "<Size2>" "<Color2>" "<itemName2>"
    And Add the items to the cart "<AddItem3>" "<Size3>" "<Color3>" "<itemName3>"
    And Navigate to checkout page
    Then Remove evening dress from cart
    And Add tshirt from cart
    Then Assert the price of each item in the cart
    
    Examples: 
      | AddItem1 | Size1  | Color1 | itemName1                   | AddItem2 | Size2 | Color2 | itemName2     | AddItem3 | Size3  | Color3 | itemName3            |
      | T-shirts | medium | blue   | Faded Short Sleeve T-shirts | Dresses  | small | beige  | Printed Dress | Women    | medium | orange | Printed Summer Dress |

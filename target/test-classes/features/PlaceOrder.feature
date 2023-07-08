Feature: Place order for product

Scenario Outline: Verify User able to add product in cart and proceed to checkout
Given User login with <Username> and <Password>, and redirect to product inventory page
When User add product <ProductName> to cart
And User proceed to cart page
Then Verify added product showing in cart
And Verify user is able to proceed to checkout and place order successfully

Examples:
|Username  							| Password 				|ProductName     				|
|standard_user					|secret_sauce			|Sauce Labs Backpack			|
|performance_glitch_user|secret_sauce			|Sauce Labs Fleece Jacket	|



Feature: Autometed End2End Tests
Description: The purpose of this test is to test End to End integration

Scenario: Customer place an order by purchasing an item from search
Given user is on Home Page
When he search for dress
And choose to buy the first item
And moves to checkout from mini cart
And enter "<customer>" personal details on checkout page
And select same delivery address
And select payment method as check payment
And place the order

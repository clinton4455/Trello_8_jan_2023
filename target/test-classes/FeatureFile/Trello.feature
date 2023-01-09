Feature: Validating Board funtionality in trello website

Scenario: Validating Board funtionality in trello
Given Login into the trello and create board
When Create a list and name it as List A and  List B
And Add a card in list A and using drag and drop in List B
Then Logout
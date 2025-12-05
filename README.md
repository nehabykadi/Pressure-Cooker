# Pressure-Cooker
Team members: Neha Ramachandra, Victoria Davis

USER STORY:
As a player, you will see an order displayed briefly in terminal, and then try to type it as accurately as possible. They will receive a score and a "tip" based on how accurate their order was. 

HOW THE GAME WORKS:
Each round a random food order shows up briefly on screen. The order disappears and the user has to type the order from memory as accurately as possible. The game grades your accuracy by comparing your input and the original. You will recieve a tip based on your performance. More money and score will allow you to unlock player upgrades. 

DESIGN CHOICES and patterns used:

Builder pattern - will be used to build food orders

Factory pattern - will be used to build orders for different types of food

Observer pattern - will be used for input, and sending messages to the grader

Singleton pattern - will be used for making one global instance of a player as this is not a multiplayer game

State pattern - maybe?? for the game itself

decorator pattern (don't really wanna use this) for the character's upgrades?

Assumptions:
- 

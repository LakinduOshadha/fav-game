# fav-game

Favorite Game

Max likes football very much. In order to check the popularity of the game, he decided to talk to random 
people and ask them about their favorite game and note it down in a list. Given a list of name of people and 
their favorite sport, help Max in finding the sport liked by most of the people, and also how many people like 
football. He could have met same people more than once, he will only count response of his first meet with 
any person.

Note: The name of person as well as sport is a single string in uppercase. The length of the name of people 
as well as sport is less than 12.

Input: 
 First line will contain number of entries in the list. (i.e. N)
 Next N lines will contain two strings, person’s name and sports he/she likes.

Output: 
 In first line, name of sport liked by most number of people (in case of more than one game is liked 
by highest number of people, output the first one in lexicographical order).
 In second line, number of people having football as their favorite game.

Constraints: 
 1 ≤ N ≤ 100000
 1 ≤ length (person name), length (sport name) ≤ 12
 You can use in-build Java classes for key-value mapping.

Sample Input: 
7
A cricket
B football
C cricket
D cricket
E chess
F chess
G chess

Sample output: 
Chess
Football 1

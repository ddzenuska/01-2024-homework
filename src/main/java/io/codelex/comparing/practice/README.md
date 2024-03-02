# Practice

## Exercise #1

Write a Java program to create a reverse order view of the elements contained in a given tree set.

Write a Java program to get the first and last elements in a tree set.

Given elements:
 - Red
 - Green
 - Black
 - Pink
 - orange

## Exercise #2

Create a tree set with a random number from 0 to 100, with a 1000 elements inside.

Write a Java program to find the numbers less than 7 in a tree set.

## Exercise #3

Create a TreeMap and fill it with all the values in the table.

Print out only the keys.

Sort the map by the last letter of the color name, print out contents.

| Color | HTML code |
| --- | --- |
| Red | #FF5733 |
| Green | #DAF7A6 |
| Black | #000000 |
| White | #FFFFFF |

## Exercise #4

See [BooksExercise](./BooksExercise.java)

## Exercise #5

See [CompareToStrings](./CompareToStrings.java)

## Exercise #6

We have strings, we would like to sort then according to length.

The short strings first. The result is that within the strings of the same length we see them in random order.

How can we sort them according to abc? So first come the short strings, but within each length we have abc order.

```
Foo
Foobar
Bar
Baz
Moo
Another
Reallylong
Shorter
```

## Exercise #7

Write a program that asks for the names of runners and the time it took each of them to finish a race. The program should display the names of the runners in the order that they finished. Use a comparator and Collections.sort.

## Exercise #8

Write a class with the following static method:
 - *mostFrequent* - it accepts a reference to a String object as an argument and returns the character that occurs the most frequently in the object.

## Exercise #9

Write a program that asks the user to enter three names, and then display the name sorted in ascending order.

For example if the user entered "Charlie" , "Leslie" , and "Andy", the program would display:

```
Andy
Charlie
Leslie
```

## Exercise #10

See [Tournament](./Tournament.java)

Tally the results of a small football competition.

Based on an input file containing which team played against which and what the
outcome was, create a file with a table like this:

```text
Team                           | MP |  W |  D |  L |  P
Devastating Donkeys            |  3 |  2 |  1 |  0 |  7
Allegoric Alaskans             |  3 |  2 |  0 |  1 |  6
Blithering Badgers             |  3 |  1 |  0 |  2 |  3
Courageous Californians        |  3 |  0 |  1 |  2 |  1
```

What do those abbreviations mean?

- MP: Matches Played
- W: Matches Won
- D: Matches Drawn (Tied)
- L: Matches Lost
- P: Points

A win earns a team 3 points. A draw earns 1. A loss earns 0.

The outcome should be ordered by points, descending. In case of a tie, teams are ordered alphabetically.

###

Input

Your tallying program will receive input that looks like:

```text
Allegoric Alaskans;Blithering Badgers;win
Devastating Donkeys;Courageous Californians;draw
Devastating Donkeys;Allegoric Alaskans;win
Courageous Californians;Blithering Badgers;loss
Blithering Badgers;Devastating Donkeys;loss
Allegoric Alaskans;Courageous Californians;win
```

The result of the match refers to the first team listed. So this line

```text
Allegoric Alaskans;Blithering Badgers;win
```

Means that the Allegoric Alaskans beat the Blithering Badgers.

This line:

```text
Courageous Californians;Blithering Badgers;loss
```

Means that the Blithering Badgers beat the Courageous Californians.

And this line:

```text
Devastating Donkeys;Courageous Californians;draw
```

Means that the Devastating Donkeys and Courageous Californians tied.
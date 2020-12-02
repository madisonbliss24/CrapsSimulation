# CrapsSimulation_Java

This java code simulates 100,000 games of Craps and displays the full details of the first 10 rounds. Total wins and losses are printed at the end.

Craps game rules: 

-Two Dice are used

-First roll: 
      The first roll (“come-out roll”) wins if the total is a 7 or 11. The first roll loses if the total is a 2,
      3, or 12 (“craps”). If any of these five numbers is rolled on the first roll, tally the win or loss, and
      the round is over.

      If none of the above is rolled on a first roll, then the value rolled is saved, i.e., a “point” is
      established.
 
-Subsequent rolls: 
      Continue rolling the dice until either a 7 is rolled or the point is rolled. 

      If the point is rolled before a 7, then tally a win. If a 7 is rolled before the point, tally a loss. Then
      the round is over.


---------------------------------------------------------------------------------------------------------------------------------------------
EXAMPLE OUTPUT:
Round 1 , Roll 1 -- Die 1: 6 , Die 2: 1 -- Total: 7
WIN!
1 win(s) , 0 loss(es)

-------------------------------------------------------------------------------

Round 2 , Roll 1 -- Die 1: 2 , Die 2: 6 -- Total: 8
Point is 8
Round 2 , Roll 2 -- Die 1: 4 , Die 2: 2 -- Total: 6
Round 2 , Roll 3 -- Die 1: 2 , Die 2: 3 -- Total: 5
Round 2 , Roll 4 -- Die 1: 6 , Die 2: 5 -- Total: 11
Round 2 , Roll 5 -- Die 1: 2 , Die 2: 6 -- Total: 8
WIN!
2 win(s) , 0 loss(es)

-------------------------------------------------------------------------------

Round 3 , Roll 1 -- Die 1: 1 , Die 2: 2 -- Total: 3
LOSS!
2 win(s) , 1 loss(es)

-------------------------------------------------------------------------------

Round 4 , Roll 1 -- Die 1: 4 , Die 2: 5 -- Total: 9
Point is 9
Round 4 , Roll 2 -- Die 1: 4 , Die 2: 6 -- Total: 10
Round 4 , Roll 3 -- Die 1: 2 , Die 2: 1 -- Total: 3
Round 4 , Roll 4 -- Die 1: 6 , Die 2: 6 -- Total: 12
Round 4 , Roll 5 -- Die 1: 1 , Die 2: 4 -- Total: 5
Round 4 , Roll 6 -- Die 1: 4 , Die 2: 4 -- Total: 8
Round 4 , Roll 7 -- Die 1: 1 , Die 2: 3 -- Total: 4
Round 4 , Roll 8 -- Die 1: 6 , Die 2: 2 -- Total: 8
Round 4 , Roll 9 -- Die 1: 6 , Die 2: 1 -- Total: 7
LOSS!
2 win(s) , 2 loss(es)

-------------------------------------------------------------------------------

Round 5 , Roll 1 -- Die 1: 3 , Die 2: 4 -- Total: 7
WIN!
3 win(s) , 2 loss(es)

-------------------------------------------------------------------------------

Round 6 , Roll 1 -- Die 1: 5 , Die 2: 1 -- Total: 6
Point is 6
Round 6 , Roll 2 -- Die 1: 4 , Die 2: 6 -- Total: 10
Round 6 , Roll 3 -- Die 1: 3 , Die 2: 1 -- Total: 4
Round 6 , Roll 4 -- Die 1: 2 , Die 2: 1 -- Total: 3
Round 6 , Roll 5 -- Die 1: 6 , Die 2: 1 -- Total: 7
LOSS!
3 win(s) , 3 loss(es)

-------------------------------------------------------------------------------

Round 7 , Roll 1 -- Die 1: 4 , Die 2: 2 -- Total: 6
Point is 6
Round 7 , Roll 2 -- Die 1: 5 , Die 2: 4 -- Total: 9
Round 7 , Roll 3 -- Die 1: 3 , Die 2: 6 -- Total: 9
Round 7 , Roll 4 -- Die 1: 2 , Die 2: 1 -- Total: 3
Round 7 , Roll 5 -- Die 1: 4 , Die 2: 2 -- Total: 6
WIN!
4 win(s) , 3 loss(es)

-------------------------------------------------------------------------------

Round 8 , Roll 1 -- Die 1: 6 , Die 2: 4 -- Total: 10
Point is 10
Round 8 , Roll 2 -- Die 1: 3 , Die 2: 1 -- Total: 4
Round 8 , Roll 3 -- Die 1: 1 , Die 2: 5 -- Total: 6
Round 8 , Roll 4 -- Die 1: 5 , Die 2: 2 -- Total: 7
LOSS!
4 win(s) , 4 loss(es)

-------------------------------------------------------------------------------

Round 9 , Roll 1 -- Die 1: 4 , Die 2: 3 -- Total: 7
WIN!
5 win(s) , 4 loss(es)

-------------------------------------------------------------------------------

Round 10 , Roll 1 -- Die 1: 3 , Die 2: 4 -- Total: 7
WIN!
6 win(s) , 4 loss(es)

-------------------------------------------------------------------------------


OVERALL: 
49654 win(s) , 50346 loss(es)

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
Round 1 , Roll 1 -- Die 1: 6 , Die 2: 1 -- Total: 7 <br>
WIN! <br>
1 win(s) , 0 loss(es) <br>

-------------------------------------------------------------------------------

Round 2 , Roll 1 -- Die 1: 2 , Die 2: 6 -- Total: 8 <br>
Point is 8 <br>
Round 2 , Roll 2 -- Die 1: 4 , Die 2: 2 -- Total: 6 <br>
Round 2 , Roll 3 -- Die 1: 2 , Die 2: 3 -- Total: 5 <br>
Round 2 , Roll 4 -- Die 1: 6 , Die 2: 5 -- Total: 11 <br>
Round 2 , Roll 5 -- Die 1: 2 , Die 2: 6 -- Total: 8 <br>
WIN! <br>
2 win(s) , 0 loss(es) <br>

-------------------------------------------------------------------------------

Round 3 , Roll 1 -- Die 1: 1 , Die 2: 2 -- Total: 3 <br>
LOSS! <br>
2 win(s) , 1 loss(es) <br>

-------------------------------------------------------------------------------

Round 4 , Roll 1 -- Die 1: 4 , Die 2: 5 -- Total: 9 <br>
Point is 9 <br>
Round 4 , Roll 2 -- Die 1: 4 , Die 2: 6 -- Total: 10 <br>
Round 4 , Roll 3 -- Die 1: 2 , Die 2: 1 -- Total: 3 <br>
Round 4 , Roll 4 -- Die 1: 6 , Die 2: 6 -- Total: 12 <br>
Round 4 , Roll 5 -- Die 1: 1 , Die 2: 4 -- Total: 5 <br>
Round 4 , Roll 6 -- Die 1: 4 , Die 2: 4 -- Total: 8 <br>
Round 4 , Roll 7 -- Die 1: 1 , Die 2: 3 -- Total: 4 <br>
Round 4 , Roll 8 -- Die 1: 6 , Die 2: 2 -- Total: 8 <br>
Round 4 , Roll 9 -- Die 1: 6 , Die 2: 1 -- Total: 7 <br>
LOSS! <br>
2 win(s) , 2 loss(es) <br>

-------------------------------------------------------------------------------

Round 5 , Roll 1 -- Die 1: 3 , Die 2: 4 -- Total: 7 <br>
WIN! <br>
3 win(s) , 2 loss(es) <br>

-------------------------------------------------------------------------------

Round 6 , Roll 1 -- Die 1: 5 , Die 2: 1 -- Total: 6 <br>
Point is 6 <br>
Round 6 , Roll 2 -- Die 1: 4 , Die 2: 6 -- Total: 10 <br>
Round 6 , Roll 3 -- Die 1: 3 , Die 2: 1 -- Total: 4 <br>
Round 6 , Roll 4 -- Die 1: 2 , Die 2: 1 -- Total: 3 <br>
Round 6 , Roll 5 -- Die 1: 6 , Die 2: 1 -- Total: 7 <br>
LOSS! <br>
3 win(s) , 3 loss(es) <br>

-------------------------------------------------------------------------------

Round 7 , Roll 1 -- Die 1: 4 , Die 2: 2 -- Total: 6 <br>
Point is 6 <br>
Round 7 , Roll 2 -- Die 1: 5 , Die 2: 4 -- Total: 9 <br>
Round 7 , Roll 3 -- Die 1: 3 , Die 2: 6 -- Total: 9 <br>
Round 7 , Roll 4 -- Die 1: 2 , Die 2: 1 -- Total: 3 <br>
Round 7 , Roll 5 -- Die 1: 4 , Die 2: 2 -- Total: 6 <br>
WIN! <br>
4 win(s) , 3 loss(es) <br>

-------------------------------------------------------------------------------

Round 8 , Roll 1 -- Die 1: 6 , Die 2: 4 -- Total: 10 <br>
Point is 10 <br>
Round 8 , Roll 2 -- Die 1: 3 , Die 2: 1 -- Total: 4 <br>
Round 8 , Roll 3 -- Die 1: 1 , Die 2: 5 -- Total: 6 <br>
Round 8 , Roll 4 -- Die 1: 5 , Die 2: 2 -- Total: 7 <br>
LOSS! <br>
4 win(s) , 4 loss(es) <br>

-------------------------------------------------------------------------------

Round 9 , Roll 1 -- Die 1: 4 , Die 2: 3 -- Total: 7 <br>
WIN! <br>
5 win(s) , 4 loss(es) <br>

-------------------------------------------------------------------------------

Round 10 , Roll 1 -- Die 1: 3 , Die 2: 4 -- Total: 7 <br>
WIN! <br>
6 win(s) , 4 loss(es) <br>

-------------------------------------------------------------------------------


OVERALL:  <br>
49654 win(s) , 50346 loss(es) <br>

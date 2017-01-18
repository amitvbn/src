Problem Statement:
Tote betting involves punters choosing the outcome of a Camel race by placing bets into a pool
of money. Punters who successfully predict the outcome of a race take a share of the pool
proportional to their stake. For example, a punter who places a $2 bet on a winning selection
would receive twice the winnings of a punter who placed a $1 stake. A Bookie takes a
commission out of the pool before it is split between winning punters.
The calculator must support X (say two) products with the following rules:
WIN
● Punters must choose the winner of a race
● Bookie takes a 15% commission from the Win pool
● The remaining total is split, proportionally to stake, amongst punters who chose the
correct winning camel.
PLACE
● Punters must choose the first, second or third place camel in a race
● Bookie takes a 12% commission from the Place pool
● The total pool is split evenly into 3 and each of these amounts is then split, proportionally
to stake, amongst the punters who chose each placed camel
Input: list of bets
Your program should read its input from stdin. It will receive a list of bets placed on the current
race, one per line. The format of bets is Bet:<product>:<selections>:<stake>, where
● <product> is either W or P
● <selection> is a single runner number (e.g. 4)
● <stake> is an amount in whole dollars (e.g. 35)
For example:
● Bet:W:3:5 is a $5 bet on camel 3 to win
● Bet:P:2:10 is a $10 bet on camel 2 to come first, second or third
Input: race results
Eventually, your program will receive the race results on stdin. You can assume this is the last
input it will receive.
The format of the results is Result:<first>:<second>:<third>.
For example, Result:5:3:8 represents a race where camel 5 finished first, camel 3 finished
second and camel 8 finished third.
Output: dividends
A Dividend in betting terms is the amount returned on a winning Tote bet. This is declared in
decimal odds and your stake is included in the return.
For example, on a camel winning a race the Tote dividend may be 6.5. A $10 bet would return
$65 giving a profit of $55.
When bets have been placed and results provided, your program should generate the dividends
for each product for a race. The dividends should be printed on stdout, in the following format:
<product>:<winningSelections>:<dividend>.
For example:
W:2:$2.61 # Win bet on camel 2 yields $2.61
P:2:$1.06 # Place bet on camel 2 yields $1.06
P:3:$1.27 # Place bet on camel 3 yields $1.27
P:1:$2.13 # Place bet on camel 1 yields $2.13
Example
Here is sample data for a given race. This is what your program will receive on stdin:
Bet:W:1:3
Bet:W:2:4
Bet:W:3:5
Bet:W:4:5
Bet:W:1:16
Bet:W:2:8
Bet:W:3:22
Bet:W:4:57
Bet:W:1:42
Bet:W:2:98
Bet:W:3:63
Bet:W:4:15
Bet:P:1:31
Bet:P:2:89
Bet:P:3:28
Bet:P:4:72
Bet:P:1:40
Bet:P:2:16
Bet:P:3:82
Bet:P:4:52
Bet:P:1:18
Bet:P:2:74
Bet:P:3:39
Bet:P:4:105
Result:2:3:1
And this is what it should output on stdout:
Win:2:$2.61
Place:2:$1.06
Place:3:$1.27
Place:1:$2.13

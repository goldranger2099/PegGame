Scenario:
A player begins playing the Peg Game on a board. The player clicks any one of 15 available pegs to remove, then the game begins. A player can select a peg if the position next to the adjacent peg is empty (both the two pegs and empty position must be in a straight line). The selected peg is then moved to the empty position, while the adjacent peg, which is “jumped over” is removed. However, if the selected peg has two or more such empty positions available to move to, the player must select the end position. Before every turn, the game will check for any available moves, i.e. pegs that can move to empty positions; if not, the game is over. The player wins the peg game if only one peg remains anywhere on the board.

Creative:
On the right side, the player can select skins for the board
The peg game is a graphic-based user interface
The player can select where to remove the first peg
Reset button to play again
Winner textbox (North Star)
Konami code easter egg

Nouns:
Board
Peg
Buttons (reset, skin)
Button Click Listeners
Rules

Verbs:
remove
getPosition
setPosition
select2
checkWin
checkLose
Reset

Classes:
PegGame
Board
Rules

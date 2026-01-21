Prithee
1/21/26
Chloe Wang

This program entry point will be in the Main class

This program takes no arguments

This program prints an incomplete script and stops a word, prompting user to fill in the correct word.
The script: Two households, both alike in dignity,
            In fair Verona, where we lay our scene,
            From ancient grudge break to new mutiny,
            Where civil blood makes civil hands unclean.
            From forth the fatal loins of these two foes
            A pair of star-cross’d lovers take their life;
            Whose misadventured piteous overthrows
            Do with their death bury their parents’ strife.
            The fearful passage of their death-mark’d love,
            And the continuance of their parents’ rage,
            Which, but their children’s end, nought could remove,
            Is now the two hours’ traffic of our stage;
            The which if you with patient ears attend,
            What here shall miss, our toil shall strive to mend.

The rules are as follows:
1. Program stops when there are 3 correct guesses or 3 wrong guesses.
2. The sonnet restarts everytime a guess is made.

Pseudocode
let rightCount = number of correct guesses
let wrongCount = number of wrong guesses
let hiddenWord = string of the chosen word
let script = arraylist of each word and ",", ".", ";" in the sonnet

Get random number for indexing
While index of num is ",", ".",";"
    reroll the random number
hiddenWord = script[num]
for i through num:
    print out i
        if the next word is not a ",", ".", or ";", then print a space
print out a space and a line of dashes

while rightCount and wrongCount are less than 3
    call script() to print the sonnet again
    Scanner read user input
    if hiddenWord equals input
        rightCount++
        SOP ("ur right!")
    else hiddenWord does not equal input
        wrongCount++
        SOP ("ur wrong")

TESTS
All 3 correct
All 3 wrong
2 wrong, 3 correct












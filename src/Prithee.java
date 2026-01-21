import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Prithee {
    private int rightCount;
    private int wrongCount;
    private String hiddenWord;
    String[] myArray = {"Two", "households", ",", "both", "alike", "in", "dignity",
            "In", "fair", "Verona", ",", "where", "we", "lay", "our", "scene", ",",
            "From", "ancient", "grudge", "break", "to", "new", "mutiny", ",",
            "Where", "civil", "blood", "makes", "civil", "hands", "unclean", ".",
            "From", "forth", "the", "fatal", "loins", "of", "these", "two", "foes",
            "A", "pair", "of", "star-cross'd", "lovers", "take", "their", "life", ";",
            "Whose", "misadventured", "piteous", "overthrows",
            "Do", "with", "their", "death", "bury", "their", "parents'", "strife", ".",
            "The", "fearful", "passage", "of", "their", "death-mark'd", "love", ",",
            "And", "the", "continuance", "of", "their", "parents'", "rage", ",",
            "Which", ",", "but", "their", "children's", "end", ",", "nought", "could", "remove", ",",
            "Is", "now", "the", "two", "hours'", "traffic", "of", "our", "stage", ";",
            "The", "which", "if", "you", "with", "patient", "ears", "attend", ",",
            "What", "here", "shall", "miss", ",", "our", "toil", "shall", "strive", "to", "mend", "."};
    private ArrayList<String> script = new ArrayList<>(Arrays.asList(myArray));
    //First method to generate a script with missing word in dashes.
    public void newScript(){
        int num = (int)(Math.random()* script.size());
        while ((script.get(num).equals(",")) || (script.get(num).equals(".")) || (script.get(num).equals(";"))){
            num = (int)(Math.random()* script.size());
        }
        hiddenWord = script.get(num);
        for (int i = 0; i < num; i++){
            System.out.print(script.get(i));
            if (i + 1 < script.size()) {
                if (!script.get(i + 1).equals(",") && !script.get(i + 1).equals(".") && !script.get(i + 1).equals(";")) {
                    System.out.print(" ");
                }
            }
        }
        System.out.println(" " + "__________");
    }
    //Second method that main would call input guess. Most logic would happen here because I don't want to make another method
    public void playGame(Scanner sc){
        while (rightCount < 3 && wrongCount < 3) {
            newScript();
            System.out.println("Fill in the blank warrior: ");
            String guess = sc.nextLine();
            if (guess.equalsIgnoreCase(hiddenWord)){
                rightCount++;
                System.out.println("You guessed right warrior!");
            }
            else{
                wrongCount++;
                System.out.println("You guessed wrong FAILURE");
            }
        }
    }
}






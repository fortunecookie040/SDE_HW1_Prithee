import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class PritheeTest {

    @Test
    public void newScript() {
        Scanner sc = new Scanner(System.in);
        Prithee game = new Prithee();
        game.playGame(sc);
        sc.close();

    }

    @Test
    public void playGame() {
        //ngl i'm not too sure how to junit test this. i'm not familiar with junit testing or scanners.
        //I simply tested 3 times using the code above. 
        //I did: 3 correct, 3 incorrect, and 2 incorrect 3 correct. 
    }
}

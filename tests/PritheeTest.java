import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class PritheeTest {

    @Test
    public void newScript() {
        Prithee game = new Prithee();
        game.newScript();
    }

    @Test
    public void playGame() {
        Scanner sc = new Scanner(System.in);
        Prithee game = new Prithee();
        game.playGame(sc);
        sc.close();

    }
}

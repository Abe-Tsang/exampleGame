import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Driver {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Result r = new Result();

        String playerName;
        Player p = new Player();
        System.out.println("Type name: ");
        playerName = br.readLine();
        p.setName(playerName);

        Game g = new Game();
        g.playGame();
        p.setScore(g.getScore());
        r.addResult(p.getName(), p.getScore());

        r.showResult();
    }
}

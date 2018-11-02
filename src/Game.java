import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Game {
    private int score;
    private String[] questions;
    private String[] answers;
    public Game() {
        score = 0;
        questions = new String[2];
        questions[0] = "How many fingers do humans have?";
        questions[1] = "Is your heart on the left side or right side? (Answer left or right)";
        answers = new String[2];
        answers[0] = "10";
        answers[1] = "left";
    }
    public void playGame() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp = "";
        for(int i = 0; i < 2; i++){
            System.out.println(questions[i]);
            temp = br.readLine();
            if(temp.equals(answers[i])){
                score++;
            }
        }
    }
    public int getScore(){
        return score;
    }
}

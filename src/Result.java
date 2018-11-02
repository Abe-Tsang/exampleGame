import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Result {
    String[] names;
    int[] scores;
    static int count;
    public Result(){
        names = new String[2];
        scores = new int[2];
        count = 0;
    }
    public void addResult(String name, int score){
        names[count] = name;
        scores[count] = score;
        count++;
    }
    public void showResult(){
        for(int i = 0; i < 2; i++){
            System.out.println(names[i] + ": " + scores[i]);
        }
    }

}

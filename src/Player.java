public class Player {
    private String name;
    private int score;

    public Player(){
        name = "";
        score = 0;
    }
    public void setName(String _name){
        name = _name;
    }
    public void setScore(int _score){
        score = _score;
    }
    public String getName(){
        return name;
    }
    public int getScore(){
        return score;
    }
    public String toString(){
        return name + ": " + score;
    }
}

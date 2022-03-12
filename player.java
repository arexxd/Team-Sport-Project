public abstract class player {
    String name, team;
    int score;

    public player(String playerName, String teamName, int score){
        name = playerName;
        team = teamName;
        score = 0;
    }
    public int getScore(){
        return score;   
    }
    public String getName(){
        return name;
    }
    public String getTeam(){
        return team;
    }
    public String toString(){
        String result = "Player " + name;
        result += "\nTeam " + team;
        result += "\nScore " + score;
        return result;
    }
}
class Badminton extends player {
    public Badminton(String playerName, String teamName, int score){
        super name, team;
    }
    public String 
}
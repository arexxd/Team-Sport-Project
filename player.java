public abstract class player {
    String name, team;
    int score;

    public player(String playerName, String teamName, int score){
        name = playerName;
        team = teamName;
        score = 0;
    }
    public abstract void score();
    public int getscore(){
        return score;
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
        this.name;
        this.team;
        this.score;
    }

    @Override
    public void score() {
        if player.
    }
    public String 
}
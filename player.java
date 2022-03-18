public abstract class player
{
protected String player, team;
protected int score;

public player (String playerName, String teamName)
{
    player = playerName;
    team = teamName;
    score = 0;
}

public int getScore()
{
    return score;
}

public abstract void score();

public String toString()
{
    String result = "Player: " + player;
    result += "nTeam: " + team;
    result += "nScore: " + score;
    return result;
}

public class Badminton extends player{
    public Badminton(String playerName, String teamName){
        super(playerName, teamName);
    }
public 


}


}
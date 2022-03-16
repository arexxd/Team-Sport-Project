public abstract class player {
    String name, team;
    int score;

    public player(String playerName, String teamName, int score){
        name = playerName;
        team = teamName;
        score = 0;
    }
    public int getscore(){
        return score;
    }
    public String toString(){
        String result = "Player " + name;
        result += "\nTeam " + team;
        result += "\nScore " + score;
        return result;
    }
    public abstract player score(player player1, player player2);
}
class Badminton extends player {
    private String name;
    private String team;
    private int score;
    public Badminton(String playerName, String teamName, int score){
        super(playerName, teamName, score));
        this.name=playerName;
        this.team=teamName;
        this.score=score;
    }


    public player score(Badminton player1, Badminton player2) {
        Badminton player=new Badminton("they","are",0);
        if(player1.getScore()>player2.getScore()){
            return player1;
        }else if(player1.getScore()<player2.getScore()){
            return player2;
        }else{
            return player;
        }
    }

    public int getScore(){
        return score;
    }
}
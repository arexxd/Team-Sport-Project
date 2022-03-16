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
    public abstract String score(player player1, player player2);
}
class Badminton extends player {
    public Badminton(String playerName, String teamName, int score){
        super(playerName, teamName, score);
    }
    public String score(player player1, player player2) {
        Badminton player=new Badminton("they","are",0);
        if(player1.getscore()>player2.getscore()){
            return player1.toString();
        }else if(player1.getscore()<player2.getscore()){
            return player2.toString();
        }else{
            return player.toString();
        }
    }
}

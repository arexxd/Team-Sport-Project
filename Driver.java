public class Driver{
    public static void main(String[] args)
    {
        //badminton players
        Badminton Bad1 = new Badminton("Joe Chung", "Team1");
        System.out.println(Bad1.score());
        Badminton Bad2 = new Badminton("Mike Wang", "Team2");
        System.out.println(Bad2.score());
        //tennis players
        Tennis Ten1 = new Tennis("Chad Burchill", "Team1");
        System.out.println(Ten1.score()); 
        Tennis Ten2 = new Tennis("Andrew Jackson", "Team2");
        System.out.println(Ten2.score());
        //basketball players
        Basketball BB1 = new Basketball("Joe Chung", "Team1");
        System.out.println(BB1.score());
        Basketball BB2 = new Basketball("Joe Chung", "Team1");
        System.out.println(BB2.score());
    }
}    
abstract class player{
    protected String player, team;
    protected int score;
    public player (String playerName, String teamName){
        player = playerName;
        team = teamName;
        score = 0;
    }
    public String getTeam(){
        return team;
    }
    public int getScore(){
        return score;
    }
    public String getName(){
        return player;
    }
}    
    class Badminton extends player{
        public Badminton(String playerName, String teamName){
            super(playerName, teamName);
        }
        public String score(){
            return "Player " + getName() + "on " + getTeam() + " has " + getScore() + " points";
        }
    }    
    class Tennis extends player{
        public Tennis(String playerName, String teamName){
            super(playerName, teamName);
        }
        public String score(){
            return "Player " + getName() + "on " + getTeam() + " has " + getScore() + " points";
        }
    }
    class Basketball extends player{
        public Basketball(String playerName, String teamName){
            super(playerName, teamName);
        }
        public String score(){
            return "Player " + getName() + "on " + getTeam() + " has " + getScore() + " points";
    }
}

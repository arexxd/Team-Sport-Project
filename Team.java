abstract class Team {
    private String name;
    private int points;
    public Team(String pname, int ppoints)
    {
        name = pname;
        points = ppoints;
    }
    public String getName()
    {
        return name;
    }
    public int getPoints()
    {
        return points;
    }
}

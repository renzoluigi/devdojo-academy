package academy.devdojo.javaoneforall.javacore.Gassociation.domain;

public class Player {
    private String name;
    private Team team;

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", team=" + team.getName() +
                '}';
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}

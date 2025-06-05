package academy.devdojo.javaoneforall.javacore.Gassociation.test;

import academy.devdojo.javaoneforall.javacore.Gassociation.domain.Player;
import academy.devdojo.javaoneforall.javacore.Gassociation.domain.Team;

public class PlayerTest02 {
    public static void main(String[] args) {
        Team team1 = new Team("Palmeiras");
        Player player1 = new Player("Renzo");
        player1.setTeam(team1);

        System.out.println(player1);
    }
}

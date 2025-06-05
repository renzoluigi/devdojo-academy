package academy.devdojo.javaoneforall.javacore.Gassociation.test;

import academy.devdojo.javaoneforall.javacore.Gassociation.domain.Player;
import academy.devdojo.javaoneforall.javacore.Gassociation.domain.Team;

public class PlayerTest03 {
    public static void main(String[] args) {
        Player player1 = new Player("Estevão");
        Player player2 = new Player("Endrick");
        Team team = new Team("Palmeiras");
        Player[] players = {player1, player2};

        player1.setTeam(team);
        player2.setTeam(team);
        team.setPlayers(players);

        System.out.println("----Player-----");
        System.out.println(player1);
        System.out.println(player2);
        System.out.println("----Team-----");
        System.out.println(team);
    }
}

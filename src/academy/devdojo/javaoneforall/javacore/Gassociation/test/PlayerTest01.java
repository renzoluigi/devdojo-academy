package academy.devdojo.javaoneforall.javacore.Gassociation.test;

import academy.devdojo.javaoneforall.javacore.Gassociation.domain.Player;

public class PlayerTest01 {
    public static void main(String[] args) {
        Player p1 = new Player("Endrick");
        Player p2 = new Player("Estevão");
        Player p3 = new Player("Messi");

        Player p4 = p1;

        Player[] players = {p4, p2, p3};

        p1.setName("Renzo");

        for (int i = 0 ; i < players.length ; i++) {
            System.out.println("p" + (i+1) + ": " + players[i].getName());
        }
        //Output:
        //p1: Renzo
        //p2: Estevão
        //p3: Messi
    }
}

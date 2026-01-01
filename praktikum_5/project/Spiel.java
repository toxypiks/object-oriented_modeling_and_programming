package project;

public class Spiel
{
    public static void main (String[] args)
    {
        System.out.print("Hello from Spiel\n");

        ThreadpoolBasedGame game = new ThreadpoolBasedGame(5, 100);
        Player[] player = game.play();
        Player[] ranked_player = game.rank(player);
        for(int i = 0; i < ranked_player.length; i++)
            {
                System.out.println(ranked_player[i].toString());
            }
    }
}

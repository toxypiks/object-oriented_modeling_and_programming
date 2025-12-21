package project;

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ThreadpoolBasedGame
{
    private static int NUMBER_OF_THREADS;
    private static int NUMBER_OF_TASKS;

    public ThreadpoolBasedGame(final int numberOfThreads, final int numberOfTasks)
    {
        this.NUMBER_OF_THREADS = numberOfThreads;
        this.NUMBER_OF_TASKS = numberOfTasks;
    }

    public static Player[] play()
    {
        // Create Thread pool with fiixed numbers of threads
        final ExecutorService executorService = Executors.newFixedThreadPool(NUMBER_OF_THREADS);
        try {
            // Create array of tasks
            final Player[] aufgaben = createTasks();

            // Schedule tasks
            final List<CompletableFuture<Player>> aufgabenErgebnisse = scheduleTasks(executorService, aufgaben);

            // Waiting for all tasks to finish
            aufgabenErgebnisse.forEach(CompletableFuture::join);

            // Combine results of all tasks
            final Player[] result = combineResults(aufgabenErgebnisse);

            return result;
        } finally {
            // Shutdown Threadpool
            executorService.shutdown();
        }
    }

    private static Player[] createTasks()
    {
        Player[] arrayOfPlayer = new Player[NUMBER_OF_TASKS];
        for(int i = 0; i < NUMBER_OF_TASKS; i++)
            {
                final Player player = new Player("Player" + i, 1000);
                arrayOfPlayer[i] = player;
            }
        return arrayOfPlayer;
    }

    private static List<CompletableFuture<Player>> scheduleTasks(final ExecutorService executorService, final Player[] arrayOfPlayer)
    {
        final List<CompletableFuture<Player>> aufgabenErgebnisse = new ArrayList<>();
        for (Player player : arrayOfPlayer)
            {
                // Start tasks
                final CompletableFuture<Player> aufgabeCompletableFuture = CompletableFuture.supplyAsync (player::play, executorService);

                // Add tasks to list of tasks
                aufgabenErgebnisse.add(aufgabeCompletableFuture);
            }
        return aufgabenErgebnisse;
    }

    private static Player[] combineResults(final List<CompletableFuture<Player>> aufgabenErgebnisse)
    {
        final Player[] ergebnisse = new Player[NUMBER_OF_TASKS];
        int i = 0;
        for (CompletableFuture<Player> aufgabe : aufgabenErgebnisse) {
            try {
                ergebnisse[i++] = aufgabe.get();
            } catch (InterruptedException interruptedException) {
            } catch (ExecutionException executionException) {
            }
        }
        return ergebnisse;
    }

    public Player[] rank(Player[] playerToRank)
    {
        for(int i = 0; i <= playerToRank.length - 1; i++)
            {
                for(int j = 1; j <= playerToRank.length - 1; j++)
                    {
                        if(istSchlechter(playerToRank[i], playerToRank[j]))
                            {
                                Player tmp = playerToRank[i];
                                playerToRank[i] = playerToRank[j];
                                playerToRank[j] = tmp;
                            }
                    }
            }
        return playerToRank;
    }

    public int compare(Player playerOne, Player playerTwo)
    {
        WurfStatistik wurfStatistikPlayerOne = playerOne.getWurfStatistik();
        WurfStatistik wurfStatistikPlayerTwo = playerTwo.getWurfStatistik();

        for(Integer key : wurfStatistikPlayerOne.keySet())
            {
                if(wurfStatistikPlayerOne.get(key) > wurfStatistikPlayerTwo.get(key))
                    {
                        return 1;
                    }
                if(wurfStatistikPlayerOne.get(key) < wurfStatistikPlayerTwo.get(key))
                    {
                        return -1;
                    }
            }
        return 0;
    }

    public boolean istSchlechter(Player playerOne, Player playerTwo)
    {
        int result = compare(playerOne, playerTwo);
        return (result < 0) ? true : false;
    }
}

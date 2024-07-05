package programs.multuThreading;
/*
Write a program in Java to simulate the table tennis game. The game should be played in a synchronized
manner by two players. When the two players are ready, an appropriate message should be displayed. When
        the game starts, the output should be displayed in the following format:
        Player 1 ready...
        Player 2 ready...
*/

class Table {

    private final Object lock = new Object();
    private boolean player1Ready = false;

    public void playerReady(String playerName) throws InterruptedException {
        synchronized (lock) {
            if (playerName.equalsIgnoreCase("Player 1")) {
                System.out.println(playerName + " ready...");
                player1Ready = true;
                lock.notify();
            } else {
                while (!player1Ready) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                System.out.println(playerName + " ready...");
            }
        }
    }
}

class Player implements Runnable {

    private final String name;
    private final Table table;

    Player(String name, Table table) {
        this.name = name;
        this.table = table;
    }

    @Override
    public void run() {
        try {
            table.playerReady(name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class TableTennisGame {

    public static void main(String[] args) throws InterruptedException {

        Table table = new Table();
        for (int i = 0; i < 10; i++) {
            Thread thread1 = new Thread(new Player("Player 1", table));
            Thread thread2 = new Thread(new Player("Player 2", table));

            thread1.start();
            thread2.start();

            try {
                thread1.join();
                thread2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

package programs.multuThreading;
/* Create a Java program that creates two threads namely Thread1 and Thread2. You need to create a method
        that prints a table for a specified integer up to 10 numbers. Thread1 should print the table of 2 and Thread2
        should print the table of 4. The table values must be printed with a delay of 1 second. You need to ensure that
        only one thread at a time can print the table. Further, the name of the thread that is printing the table should
        be displayed.*/

class PrintTable implements Runnable {
    int num;

    public PrintTable(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        try {
            TableDisplay.printTable(num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class TableDisplay {

    public synchronized static void printTable(int num) throws InterruptedException {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + num * i);
            Thread.sleep(1000);
        }

    }

    public static void main(String[] args) {
        //prints in non sequential way
        /*Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i * 2);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Thread1");

        Thread thread2 = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i * 4);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Thread2");

        thread1.start();
        thread2.start();*/

        // Prints in Sequential way

        Thread thread3 = new Thread(new PrintTable(2), "Thread1");
        Thread thread4 = new Thread(new PrintTable(4), "Thread2");

        thread3.start();
        thread4.start();

    }

}

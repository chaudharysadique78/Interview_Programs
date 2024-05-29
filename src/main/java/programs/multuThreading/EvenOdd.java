package programs.multuThreading;

/*print even odd using 2 threads*/

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EvenOdd {

    static int max_num = 10;
    static int currentNum = 1;
    static Object lock = new Object();

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Runnable even = () -> {
            while (currentNum <= max_num) {
                synchronized (lock) {
                    if (currentNum % 2 != 0) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        lock.notify();
                        System.out.println(Thread.currentThread().getName() + " Even " + currentNum);
                        currentNum++;
                    }
                }
            }
        };

        Runnable odd = () -> {
            while (currentNum <= max_num) {
                synchronized (lock) {
                    if (currentNum % 2 == 0) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        lock.notify();
                        System.out.println(Thread.currentThread().getName() + " Odd " + currentNum);
                        currentNum++;
                    }
                }
            }
        };
        executorService.submit(odd);
        executorService.submit(even);

        executorService.shutdown();
    }


}

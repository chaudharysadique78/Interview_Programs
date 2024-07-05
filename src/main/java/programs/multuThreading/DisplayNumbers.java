package programs.multuThreading;/*Create a Java program that creates two runnable tasks, Display 1 to 10 and Display 11 to 20. The Display 1
        to 10 task should print the numbers in the range of 1 to 10 inside a loop. The task, Display 11 to 20, should
        print the numbers in the range of 11 to 20 inside a loop. Implement the preceding tasks by using an executor
        service. Ensure that the executor service is shutdown*/


import java.util.concurrent.*;

public class DisplayNumbers {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<Void> task1 = executorService.submit(new Callable<Void>() {
            @Override
            public Void call() throws Exception {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(i);
                }
                return null;
            }
        });

        executorService.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    task1.get(); // wait for task1 to complete
                    for (int i = 11; i <= 20; i++) {
                        System.out.println(i);
                    }
                } catch (ExecutionException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        executorService.shutdown();
        try {
            executorService.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}

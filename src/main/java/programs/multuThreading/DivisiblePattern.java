package programs.multuThreading;

// 1.	There is a list of number from 1 to 20 and there are three threads which will print the numbers
//Thread-1 will print numbers which are divisible by 3
//Thread-2 will print numbers which are divisible by 5
//Thread-3 will print remaining numbers in the list
//
//How will you approach this

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DivisiblePattern {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            numbers.add(i);
        }

        ExecutorService executor = Executors.newFixedThreadPool(3);

        List<Callable<Void>> task=new ArrayList<>();
        task.add(new DivisibleByThree(numbers));
        task.add(new DivisibleByFive(numbers));
        task.add(new RemainingNumbers(numbers));

        try {
            executor.invokeAll(task);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    static class DivisibleByThree implements Callable<Void> {

        private List<Integer> numbers;

        public DivisibleByThree(List<Integer> numbers) {
            this.numbers = numbers;
        }

        public Void call() {

            for (int num : numbers) {
                if (num % 3 == 0) {
                    System.out.println("Thread 1 " + num);
                }
            }
            return null;
        }
    }

    static class DivisibleByFive implements Callable<Void> {

        private List<Integer> numbers;

        public DivisibleByFive(List<Integer> numbers) {
            this.numbers = numbers;
        }

        public Void call() {

            for (int num : numbers) {
                if (num % 5 == 0) {
                    System.out.println("Thread 2 " + num);
                }
            }
            return null;
        }
    }

    static class RemainingNumbers implements Callable<Void> {

        private List<Integer> numbers;

        public RemainingNumbers(List<Integer> numbers) {
            this.numbers = numbers;
        }

        public Void call() {

            for (int num : numbers) {
                if (num % 5 != 0 && num % 3 != 0 ) {
                    System.out.println("Thread 3 " + num);
                }
            }
            return null;
        }
    }
}

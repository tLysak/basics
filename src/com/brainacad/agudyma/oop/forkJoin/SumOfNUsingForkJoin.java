package com.brainacad.agudyma.oop.forkJoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * Created by User on 01/07/2016.
 */
public class SumOfNUsingForkJoin {
    private static long N = 1000_000;
    private static final int NUM_THREADS = 10;

    static class RecSumOfN extends RecursiveTask<Long> {
        long from, to;

        public RecSumOfN(long from, long to) {
            this.from = from;
            this.to = to;
        }

        public Long compute() {
            long localSum;
            localSum = 0;
            if ((to - from) <= N / NUM_THREADS) {
                localSum = 0;
                for (long i = from; i <= to; i++) {
                    localSum += i;
                }
                System.out.printf("\t Summing of value range %d to %d is %d %n",
                        from, to, localSum);
                return localSum;
            } else { // no, the range is big for a thread to handle, so fork the computation
// we find the mid-point value in the range from..to
                long mid = (from + to) / 2;
                System.out.printf("Forking computation into two ranges: " +
                        "%d to %d and %d to %d %n", from, mid, mid, to);
// determine the computation for first half with the range from..mid
                RecSumOfN firstHalf = new RecSumOfN(from, mid);
// now, fork off that task
                RecSumOfN secondHalf = new RecSumOfN(mid + 1, to);

                firstHalf.fork();

// determine the computation for second half with the range mid+1..to

                secondHalf.fork();
                long resultSecond = secondHalf.compute();
// now, wait for the first half of computing sum to
// complete, once done, add it to the remaining part
                return firstHalf.join() + secondHalf.join();
            }
        }
    }


    public static void main(String[] args) {
// Create a fork-join pool that consists of NUM_THREADS
        ForkJoinPool pool = new ForkJoinPool(NUM_THREADS);
// submit the computation task to the fork-join pool
        long computedSum = pool.invoke(new RecSumOfN(0, N));
// this is the formula sum for the range 1..N
        long formulaSum = (N * (N + 1)) / 2;
// Compare the computed sum and the formula sum
        System.out.printf("Sum for range 1..%d; computed sum = %d, formula sum = %d %n", N,
                computedSum, formulaSum);
    }
}


package com.brainacad.vmarch.lesson25;


import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class SumOfNUsingForkJoin {

    private static final int NUM_THREADS = 10;
    private static long N = 1000_000L;

    static class RecSumOfN extends RecursiveTask<Long> {
        long from, to;


        public RecSumOfN(long from, long to) {
            this.from = from;
            this.to = to;
        }

        public static void main(String[] args) {

            ForkJoinPool pool = new ForkJoinPool(NUM_THREADS);

            long computedSum = pool.invoke(new RecSumOfN(0, N));

            long formulaSum = (N * (N + 1)) / 2;

            System.out.printf("Sum for range 1..%d; computed sum = %d, formula sum = %d %n", N,
                    computedSum, formulaSum);
        }

        public Long compute() {
            if ((to - from) <= N / NUM_THREADS) {

                long localSum = 0;

                for (long i = from; i <= to; i++) {
                    localSum += i;
                }
                System.out.printf("\t Summing of value range %d to %d is %d %n",
                        from, to, localSum);
                return localSum;
            } else {
                long mid = (from + to) / 2;
                System.out.printf("Forking computation into two ranges: " +
                        "%d to %d and %d to %d %n", from, mid, mid, to);

                RecSumOfN firstHalf = new RecSumOfN(from, mid);

                firstHalf.fork();


                RecSumOfN secondHalf = new RecSumOfN(mid + 1, to);

                long resultSecond = secondHalf.compute();

                return firstHalf.join() + resultSecond;
            }

        }
    }
}
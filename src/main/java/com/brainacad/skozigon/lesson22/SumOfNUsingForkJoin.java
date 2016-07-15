package com.brainacad.skozigon.lesson22;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * Created by skozigon on 01.07.2016.
 */
public class SumOfNUsingForkJoin {
    private static long N = 1000000l;
    private static final int NUM_THREADS = 10;

    static class RescSumOfN extends RecursiveTask<Long> {
        long from, to;

        public RescSumOfN(long from, long to) {
            this.from = from;
            this.to = to;
        }


        public Long compute() {
            if ((to - from) <= N / NUM_THREADS) {
                long localSum = 0;
                for (long i = from; i <= to; i++){
                    localSum+= i;
                }
                System.out.printf("\tSumming of range %d to %d is %d %n", from, to, localSum);
                return localSum;
            }
            else{
                long mid = (from + to)/2;
                System.out.printf("Forkong into two ranges: " + "%d to %d and %d to %d%n", from, mid, mid, to);
                RescSumOfN firstHalf = new RescSumOfN(from,mid);
                firstHalf.fork();
                RescSumOfN secondHalf = new RescSumOfN(mid+1, to);
                secondHalf.fork();
//                long resultSecond = secondHalf.compute();
                return firstHalf.join()+ secondHalf.join();
//                        resultSecond;
            }
        }
    }

    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool(NUM_THREADS);
        long computedSum = pool.invoke(new SumOfNUsingForkJoin.RescSumOfN(0, N));
        long formulaSum = (N*(N+1))/2;
        System.out.printf("Sum for range 1..%d; computed sum = %d, formula sum = %d %n", N,
                computedSum, formulaSum);
    }
}

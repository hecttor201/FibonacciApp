package com.example.fibonaccidemo.service;

import org.springframework.stereotype.Service;

@Service
public class FibonacciService {

    /**
     *  Method to obtain a Fibonacci number based on the received index.
     *
     * @param n index indicating which position in Fibonacci we want to obtain
     * @return value at the Fibonacci index
     */
    public long calculateFibonacci(int n) {
        if (n <= 0) {
            // For this calculation, standard Fibonacci is used, which states that the first position or previous one is always 0.
            return 0;
        } else if (n == 1) {
            // For the second position, it is always one.
            return 1;
        } else {
            // From here, we can start creating our Fibonacci number according to the requested position.
            long fib = 0;
            long prev1 = 1;
            long prev2 = 0;
            for (int i = 2; i <= n; i++) {
                fib = prev1 + prev2;
                prev2 = prev1;
                prev1 = fib;
            }
            return fib;
        }
    }

}

package com.example.fibonaccidemo.controllet;

import com.example.fibonaccidemo.service.FibonacciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fibonacci")
public class FibonacciController{

    @Autowired
    private FibonacciService fibonacciService;

    /**
     *  get a Fibonacci number based on the received index.
     *
     * @param n index indicating which position in Fibonacci we want to obtain
     * @return value at the Fibonacci index
     */
    @GetMapping("/{n}")
    public ResponseEntity<Long> calculateFibonacci(@PathVariable int n) {
        long result = fibonacciService.calculateFibonacci(n);
        return ResponseEntity.ok(result);
    }
}

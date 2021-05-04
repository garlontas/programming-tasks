package io.github.garlontas.primes;

// This small program demonstrates the usage of PrimeGenerator.
// It generates Prime Numbers from 2-10 and prints them to console.

public class Example {
    public static void main(String[] args) {
        PrimeGenerator primes = new PrimeGenerator(10);
        System.out.print("Primes: ");
        for (int i:primes.getPrimes()) {
            System.out.print(String.valueOf(i) + " ");
        }
    }
}

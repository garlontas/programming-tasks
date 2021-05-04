package io.github.garlontas.primes;

import garlontas.Primes.*;

public class Example {
    public static void main(String[] args) {
        PrimeGenerator primes = new PrimeGenerator(10);
        System.out.print(primes.getPrimes());
    }
}

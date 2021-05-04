package io.github.garlontas.primes;

import java.math.*;
import java.util.*;

public class PrimeGenerator {
    private int maxValue;
    private Array removed;
    private int maxValueSqrt;
    private ArrayList<Integer> primes;

    public PrimeGenerator (int maxValue) {
        this.maxValue = maxValue;
        removed = new Array<Integer>(this.maxValue);
        Arrays.fill(removed, false);
        maxValueSqrt = (int) Math.sqrt((double) maxValue);
        generatePrimes();
    }

    private void generatePrimes() {
        for (i=2; i<maxValueSqrt; i++) {
            if (!removed[i]) {
                primes.add(i);
                for (j=i*i; j<maxValue; j++) {
                    removed[j] = true;
                }
            }
        }
        
        for (i=maxValueSqrt+1; i<maxValue; i++) {
            if (!removed[i]) {
                primes.add(i);
            }
        }
                
    }

    public ArrayList getPrimes () {
        return primes;
    }
}
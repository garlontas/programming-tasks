package io.github.garlontas.primes;

import java.util.*;

public class PrimeGenerator {
    private int maxValue;
    private Boolean[] removed;
    private int maxValueSqrt;
    private ArrayList<Integer> primes = new ArrayList<Integer>();

    public PrimeGenerator (int maxValue) {
        this.maxValue = maxValue;
        removed = new Boolean[this.maxValue];
        Arrays.fill(removed, false);
        maxValueSqrt = (int) Math.sqrt((double) maxValue);
        generatePrimes();
    }

    private void generatePrimes() {
        for (int i=2; i<maxValueSqrt; i++) {
            if (!removed[i]) {
                primes.add(i);
                for (int j=i*i; j<maxValue; j = j+i) {
                    removed[j] = true;
                }
            }
        }
        
        for (int i=maxValueSqrt+1; i<maxValue; i++) {
            if (!removed[i]) {
                primes.add(i);
            }
        }
                
    }

    public ArrayList<Integer> getPrimes () {
        return primes;
    }
}
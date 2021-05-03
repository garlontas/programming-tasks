"""
This small program demonstrates the usage of PrimeGenerator.
It generates Prime Numbers from 2-10 and prints them to console.
"""
import primes

primes = primes.PrimeGenerator(10) #  Generate Primes from 2 to 10
for prime in primes.get_primes():
    print(prime, end="")

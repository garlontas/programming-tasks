import math


class PrimeGenerator:

    def __init__(self, maxValue):
        self.__maxValue = maxValue
        self.__removed = [False]*maxValue
        self.__maxValueSqrt = int(math.sqrt(maxValue))
        self.__primes = []
        self.__generate_primes()

    def __generate_primes(self):
        for i in range(2, self.__maxValueSqrt):
            if not self.__removed[i]:
                self.__primes.append(i)
                j = i*i
                for j in range(j, self.__maxValue, i):
                    self.__removed[j] = True

        for i in range(self.__maxValueSqrt+1, self.__maxValue):
            if not self.__removed[i]:
                self.__primes.append(i)

    def get_primes(self):
        return self.__primes
    
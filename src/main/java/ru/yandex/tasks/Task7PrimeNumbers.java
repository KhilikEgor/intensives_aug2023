package ru.yandex.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task7PrimeNumbers {
    public static int[] findPrimes(int N) {
        /*
         * 2 <= N <= 10^6
         * Выход: отсортированный массив всех простых чисел от 2 до N
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧
        ArrayList<Integer> primes = new ArrayList<>();
        for (int num = 2; num <= N; num++) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes.add(num);
            }
        }
        int[] result = new int[primes.size()];
        for (int i = 0; i < primes.size(); i++) {
            result[i] = primes.get(i);
        }
        return result;
    }


    public static void selfCheck() {
        int[] output = {2, 3, 5};

        assert (Arrays.equals(output, findPrimes(5)));
    }
}
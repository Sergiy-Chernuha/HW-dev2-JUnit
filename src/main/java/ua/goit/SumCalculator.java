package ua.goit;

import java.util.stream.IntStream;

public class SumCalculator {
    public int sum(int n) throws IllegalArgumentException{
        if (n==0){
           throw new IllegalArgumentException();
        }

        return IntStream.range(0, n + 1).sum();
    }

}

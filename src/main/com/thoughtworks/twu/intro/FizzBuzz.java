package com.thoughtworks.twu.intro;

import java.util.stream.IntStream;

public class FizzBuzz {

    public static void fizzBuzz(int n) {
        IntStream.rangeClosed(1, n).forEach(i -> {
            if(i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz");
            else if(i % 3 == 0)
                System.out.println("Fizz");
            else if(i % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        });
    }

    public static void main(String[] args) {
        fizzBuzz(100);
    }

}

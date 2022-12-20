package com.techprimers.testing;

public class FizzBuzz {

    public String play(int number) {

        if (number == 0) throw new IllegalArgumentException("Number must not be 0");
        if (number % 2 == 0) return "2";
        if (number % 3 == 0) return "3";
        if (number % 5 == 0) return "5";


        return String.valueOf(number);
    }
}

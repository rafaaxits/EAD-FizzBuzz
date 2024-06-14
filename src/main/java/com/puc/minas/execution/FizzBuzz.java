package com.puc.minas.execution;

public class FizzBuzz {
    public String convertElement(Integer number) {
        if(number % 3 == 0 && number % 5 == 0){
            return "FizzBuzz";
        }
        else if(number % 3 == 0) {
            return "Fizz";
        } else if(number % 5 == 0) {
            return "Buzz";
        }
        return number.toString();
    }
}

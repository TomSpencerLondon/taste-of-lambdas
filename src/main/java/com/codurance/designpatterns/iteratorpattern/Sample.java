package com.codurance.designpatterns.iteratorpattern;

import java.util.stream.IntStream;

public class Sample {

  public static void main(String[] args) {
    System.out.println(factorial(5));
    System.out.println(factorialFunction(5));
  }

  public static int factorial(int number) {
    int product = 1;
    for (int i = 1; i <= number; i++) {
      product *= i;
    }

    return product;
  }

  public static int factorialFunction(int number) {
    return IntStream.rangeClosed(1, number)
        .reduce(1, (product, index) -> product * index);
  }
}

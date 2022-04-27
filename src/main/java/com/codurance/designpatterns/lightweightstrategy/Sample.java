package com.codurance.designpatterns.lightweightstrategy;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Sample {

  public static void main(String[] args) {
    List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);
//   Imperative
    System.out.println(totalValues(values));
    System.out.println(totalEvenValues(values));
    System.out.println(totalOddValues(values));

    // Functional
    System.out.println(totalValuesFunction(values, value -> true));
    System.out.println(totalValuesFunction(values, value -> value % 2 == 0));
    System.out.println(totalValuesFunction(values, value -> value % 2 != 0));
  }

  public static int totalValuesFunction(List<Integer> numbers, Predicate<Integer> selector) {
    return numbers.stream()
        .filter(selector)
        .mapToInt(value -> value)
        .sum();
  }

  private static int totalValues(List<Integer> numbers) {
    int total = 0;

    for (int number : numbers) {
      total += number;
    }

    return total;
  }

  public static int totalEvenValues(List<Integer> numbers) {
    int total = 0;

    for (int number : numbers) {
      if (number % 2 == 0) {
        total += number;
      }
    }

    return total;
  }

    public static int totalOddValues(List<Integer> numbers) {
    int total = 0;

    for(int number : numbers) {
      if(number % 2 != 0) total += number;
    }

    return total;
  }
}

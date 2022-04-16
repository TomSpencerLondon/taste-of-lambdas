package com.codurance.a08avoidsharedmutability;

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sample {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5);

    // double the even values and put that into a list.

    // Wrong way to do this.
    ArrayList<Integer> doubleOfEven = new ArrayList<>();

    numbers.stream()
        .filter(e -> e % 2 == 0)
        .map(e -> e * 2)
        .forEach(e -> doubleOfEven.add(e));
    // mutability is OK, sharing is nice, shared mutability is devils work

    // friends don't let friends do shared mutation.

    System.out.println(doubleOfEven); // don't do this

    List<Integer> doubleOfEven2 = numbers.stream()
        .filter(e -> e % 2 == 0)
        .map(e -> e * 2)
        .collect(toList());

    System.out.println(doubleOfEven2);
  }
}

package com.codurance.a19creatinginfinitestream;

import java.util.stream.Stream;

public class Sample {

  public static void main(String[] args) {
    System.out.println(Stream.iterate(100, e -> e + 1));

    // start with 100, create a series
    // 100, 101, 102, 103, ...
  }
}

package com.codurance.a02justtheessence;

public class Sample {

  public static void main(String[] args) {
    Thread th = new Thread(() -> System.out.println("In another thread"));

    th.start();

    System.out.println("In main");
  }
}

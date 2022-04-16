package com.codurance.a01highceremony;

public class Sample {

  public static void main(String[] args) {
    Thread th = new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("In another thread");
      }
    });

    th.start();

    System.out.println("In main");
  }
}

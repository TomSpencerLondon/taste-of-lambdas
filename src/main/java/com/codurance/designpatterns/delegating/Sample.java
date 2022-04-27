package com.codurance.designpatterns.delegating;

import java.util.function.Function;

public class Sample {

  public static void main(String[] args) {
    CalculateNAV calculateNAV = new CalculateNAV(ticker -> 33.33);
    System.out.println(calculateNAV.compute("ORCL", 100));

    CalculateNAV calculateNAV2 = new CalculateNAV(StockFetcher::getStockPrice);
    System.out.println(calculateNAV2.compute("ORCL", 100));
  }
}

class CalculateNAV {

  private Function<String, Double> priceFinder;

  public CalculateNAV(Function<String, Double> priceFinder) {
    this.priceFinder = priceFinder;
  }

  public double compute(String ticker, int stocks) {
    return stocks * priceFinder.apply(ticker);
  }
}

class StockFetcher {
  public static double getStockPrice(String ticker) {
    System.out.println("Do real work and get the stock price...");

    return 35.55;
  }
}
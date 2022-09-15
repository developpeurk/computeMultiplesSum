package com.codingametest.yassine.demo;
import java.util.Arrays;
import java.util.HashMap;

public class Stockprices {
    public static String[] getTopStocks(String[] stocks, double[][] prices) {
        HashMap<Double, String> topStocks = new HashMap<>();
        double avgPrice;

        for (int i = 0; i < stocks.length; i++) {
            avgPrice = 0;
            for (double[] price : prices) avgPrice += price[i];
            topStocks.put(avgPrice / prices.length, stocks[i]);
        }

        return topStocks
                .keySet()
                .stream()
                .sorted((f1, f2) -> Double.compare(f2, f1))
                .limit(3)
                .map(topStocks::get)
                .toArray(String[]::new);
    }

    public static void main(String[] args) {
        String[] stocks = {"AMZN", "CACC", "EQIX", "GOOG", "ORLY", "ULTA"};
        double[][] prices = {
                {12.81, 11.09, 12.11, 10.93, 9.83, 8.14},
                {10.34, 10.56, 10.14, 12.17, 13.1, 11.22},
                {11.53, 10.67, 10.42, 11.88, 11.77, 10.21}
        };
        System.out.println(Arrays.toString(getTopStocks(stocks, prices)));
    }
}

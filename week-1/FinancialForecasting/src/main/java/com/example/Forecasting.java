package com.example;
public class Forecasting {
    public static double calculateFutureValue(double currentValue, double growthRate, int periods) {
        if (periods <= 0) {
            return currentValue;
        }
        return calculateFutureValue(currentValue * (1 + growthRate), growthRate, periods - 1);
    }
    public static double calculateFutureValueIterative(double currentValue, double growthRate, int periods) {
        double futureValue = currentValue;
        for (int i = 0; i < periods; i++) {
            futureValue *= (1 + growthRate);
        }
        return futureValue;
    }
}

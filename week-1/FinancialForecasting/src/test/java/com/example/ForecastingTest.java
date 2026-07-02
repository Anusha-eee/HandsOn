package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ForecastingTest {
    @Test
    public void testCalculateFutureValue() {
        double startValue = 1000.0;
        double growthRate = 0.05;
        int periods = 5;
        double expected = 1276.2815625;
        double recursiveResult = Forecasting.calculateFutureValue(startValue, growthRate, periods);
        double iterativeResult = Forecasting.calculateFutureValueIterative(startValue, growthRate, periods);
        assertEquals(expected, recursiveResult, 0.0001);
        assertEquals(expected, iterativeResult, 0.0001);
        assertEquals(recursiveResult, iterativeResult, 0.0001);
    }
    @Test
    public void testZeroPeriods() {
        double startValue = 1000.0;
        double growthRate = 0.05;
        double recursiveResult = Forecasting.calculateFutureValue(startValue, growthRate, 0);
        double iterativeResult = Forecasting.calculateFutureValueIterative(startValue, growthRate, 0);
        assertEquals(startValue, recursiveResult, 0.0001);
        assertEquals(startValue, iterativeResult, 0.0001);
    }
}

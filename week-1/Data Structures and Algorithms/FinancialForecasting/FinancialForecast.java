public class FinancialForecast {
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

    public static void main(String[] args) {
        double startValue = 1000.0;
        double growthRate = 0.05; // 5% growth
        int periods = 5; // 5 years

        System.out.println("Starting Value: $" + startValue);
        System.out.println("Growth Rate: " + (growthRate * 100) + "%");
        System.out.println("Periods: " + periods + " years");

        double recursiveResult = calculateFutureValue(startValue, growthRate, periods);
        double iterativeResult = calculateFutureValueIterative(startValue, growthRate, periods);

        System.out.println("\n--- Forecasting Results ---");
        System.out.println("Future Value (Recursive): $" + recursiveResult);
        System.out.println("Future Value (Iterative): $" + iterativeResult);
    }
}

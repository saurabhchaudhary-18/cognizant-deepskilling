//package Week-1.DSA.FinancialForecast;

public class Finance {

    // Recursive method
    public static double futureValue(double currentValue, double growthRate, int years) {

        // Base Case
        if (years == 0) {
            return currentValue;
        }

        // Recursive Case
        return futureValue(currentValue, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {

        double initialValue = 10000;
        double growthRate = 0.10; // 10%
        int years = 5;
        //Instead of this User input alsp=o an option to do so...

        double predictedValue = futureValue(initialValue, growthRate, years);

        System.out.println("Initial Value : ₹" + initialValue);
        System.out.println("Growth Rate   : " + (growthRate * 100) + "%");
        System.out.println("Years         : " + years);
        System.out.printf("Future Value  : ₹%.2f%n", predictedValue);
    }
}

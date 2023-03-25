package ru.netology.stats;

public class StatsService {

    public int salesAmount(int[] sales) {
        int amountSales = 0;
        for (int i = 0; i < sales.length; i++) {
            amountSales = (int) (amountSales + sales[i]);
        }
        return amountSales;
    }

    public int overallAverageForTheSale(int[] sales) {
        int averageAmount = salesAmount(sales) / sales.length;
        return averageAmount;

    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int numberOfMonthsBelowAverage(int[] sales) {
        int belowAverageMonth = overallAverageForTheSale(sales);
        int countMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < belowAverageMonth) {
                countMonth++;
            }
        }
        return countMonth;
    }

    public int numberOfMonthsAboveAverage(int[] sales) {
        int aboveAverageMonth = overallAverageForTheSale(sales);
        int countMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > aboveAverageMonth) {
                countMonth++;
            }
        }
        return countMonth;
    }
}


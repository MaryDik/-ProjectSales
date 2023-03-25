package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void lookingForTheSumOfAllSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSumSales = 180;
        int actualSumSales = service.salesAmount(sales);

        Assertions.assertEquals(expectedSumSales, actualSumSales);

    }

    @Test
    public void lookingForAverageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverageSales = 15;
        int actualAverageSales = service.overallAverageForTheSale(sales);

        Assertions.assertEquals(expectedAverageSales, actualAverageSales);

    }

    @Test
    public void lookingForMonthNumberWithPeakSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonthPeakSales = 8;
        int actualMonthPeakSales = service.maxSales(sales);

        Assertions.assertEquals(expectedMonthPeakSales, actualMonthPeakSales);

    }

    @Test
    public void lookingForMonthNumberWithMinSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonthMinSales = 9;
        int actualMonthMinSales = service.minSales(sales);

        Assertions.assertEquals(expectedMonthMinSales, actualMonthMinSales);

    }

    @Test
    public void lookingForAmountMonthsWithSalesBelowAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAmountMonths = 5;
        int actualAmountMonths = service.numberOfMonthsBelowAverage(sales);

        Assertions.assertEquals(expectedAmountMonths, actualAmountMonths);

    }

    @Test
    public void lookingForAmountMonthsWithSalesAboveAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAboveMonths = 5;
        int actualAboveMonths = service.numberOfMonthsAboveAverage(sales);

        Assertions.assertEquals(expectedAboveMonths, actualAboveMonths);

    }
}


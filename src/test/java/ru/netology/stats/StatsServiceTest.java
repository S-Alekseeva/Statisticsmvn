package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindSumAllSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.sumAllSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldFindAverageSalesSum() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        double expectedAverageSum = 15;
        double actualAverageSum = service.averageSalesSum(sales);

        Assertions.assertEquals(expectedAverageSum, actualAverageSum);
    }

    @Test
    public void shouldFindMaxSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 25, 19, 20, 7, 14, 14, 18};

        long expectedSales = 6;
        long actualSales = service.maxSales(sales);

        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void shouldFindMinSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSales = 9;
        long actualSales = service.minSales(sales);

        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void salesUnderAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedCount = 5;
        int actualCount = service.salesUnderAverage(sales);

        Assertions.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void salesOverAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedCount = 5;
        int actualCount = service.salesOverAverage(sales);

        Assertions.assertEquals(expectedCount, actualCount);
    }
}

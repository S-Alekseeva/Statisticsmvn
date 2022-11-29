package ru.netology.stats;

public class StatsService {

    public int sumAllSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public double averageSalesSum(int[] sales) {
        double sum = sumAllSales(sales);
        double averageSalesSum = sum / sales.length;
        return averageSalesSum;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int salesUnderAverage(int[] sales) {
        int count = 0;
        double sum = averageSalesSum(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sum)
                count++;
            ;
        }
        return count;
    }

    public int salesOverAverage(int[] sales) {
        int count = 0;
        double sum = averageSalesSum(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sum)
                count++;
        }
        return count;
    }
}
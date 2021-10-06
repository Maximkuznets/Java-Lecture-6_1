package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int findAverage(int[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public int findMonthMaxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int findMonthMinSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int numberMonthSaleUnderAverage(int[] sales) {

        int monthUnderAverage = 0;
        for (int sale : sales) {
            if (sale < findAverage(sales)) {
                monthUnderAverage = monthUnderAverage + 1;
            }
        }
        return monthUnderAverage;
    }

    public int numberMonthSaleOverAverage(int[] sales) {

        int monthOverAverage = 0;
        for (int sale : sales) {
            if (sale > findAverage(sales)) {
                monthOverAverage = monthOverAverage + 1;
            }
        }
        return monthOverAverage;
    }

}

package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();
        int expected = 180;
        int actual = service.calculateSum(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindAverage() {
        StatsService service = new StatsService();
        int expected = 15;
        int actual = service.findAverage(purchases);
        assertEquals(expected, actual);

    }

    @Test
    void shouldFindMonthMaxSales() {
        StatsService service = new StatsService();
        int expected = 8;
        int actual = service.findMonthMaxSales(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMonthMinSales() {
        StatsService service = new StatsService();
        int expected = 9;
        int actual = service.findMonthMinSales(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void shouldNumberMonthSaleUnderAverage() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.numberMonthSaleUnderAverage(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void shouldNumberMonthSaleOverAverage() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.numberMonthSaleOverAverage(purchases);
        assertEquals(expected, actual);
    }

}
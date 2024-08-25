package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void sumOfAllSalesTest() {
        //Given
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        //When
        long actual = service.sumOfAllSales(sales);

        //Then
        long expected = 180;
        assertEquals(expected, actual);
    }

    @Test
    void avgOfSumSalesInMonthTest() {
        //Given
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        //When
        double actual = service.avgOfSumSalesInMonth(sales);

        //Then
        double expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    void numberMonthOfMaxSalesTest() {
        //Given
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        //When
        int actual = service.numberMonthOfMaxSales(sales);

        //Then
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void numberMonthOfMinSalesTest() {
        //Given
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        //When
        int actual = service.numberMonthOfMinSales(sales);

        //Then
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void countMonthInWhichSalesWasBelowAverageTest() {
        //Given
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        //When
        int actual = service.countMonthInWhichSalesWasBelowAverage(sales);

        //Then
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void countMonthInWhichSalesWasAboveAverageTest() {
        //Given
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        //When
        int actual = service.countMonthInWhichSalesWasAboveAverage(sales);

        //Then
        int expected = 5;
        assertEquals(expected, actual);
    }

}
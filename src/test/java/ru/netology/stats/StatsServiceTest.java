package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    double sales[] = {8.5, 15, 8.5, 15, 18, 20, 0, 20, 10, 15, 14, 18};

    @Test
    void shouldCalculateSumOfSales() {
        StatsService service = new StatsService();

        //double sales[] = {8.5, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected = 162.0;
        double actual = service.sumOfSales(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateAverageSum() {
        StatsService service = new StatsService();
        double expected = 13.5;
        double actual = service.averageSum(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMaxSales() {
        StatsService service = new StatsService();
        int expected = 8;
        int actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);
    }


    @Test
    void shouldCalculateMinSales() {
        StatsService service = new StatsService();
        int expected = 7;
        int actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateminMonthsCount() {
        StatsService service = new StatsService();
        int expected = 4;
        int actual = service.minMonthsCount(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculatemaxMonthCount() {
        StatsService service = new StatsService();
        int expected = 8;
        int actual = service.maxMonthCount(sales);
        Assertions.assertEquals(expected, actual);
    }
}



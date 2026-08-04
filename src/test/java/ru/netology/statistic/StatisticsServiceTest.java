package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void findMaxWhenMaxAtEnd() {
        StatisticsService service = new StatisticsService();

        long[] incomes = {3, 5, 8, 12};

        long expected = 12;

        long actual = service.findMax(incomes);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void findMaxWhenSeveralMaxValues() {
        StatisticsService service = new StatisticsService();

        long[] incomes = {12, 5, 8, 12, 3};

        long expected = 12;

        long actual = service.findMax(incomes);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void findMaxWhenMaximumChangesSeveralTimes() {
        StatisticsService service = new StatisticsService();

        long[] incomes = {1, 10, 5, 20, 3};

        long expected = 20;

        long actual = service.findMax(incomes);

        Assertions.assertEquals(expected, actual);
    }
}
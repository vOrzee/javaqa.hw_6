package ru.netology.stats;

public class StatsService {

    public int sumOfAllSales(int[] monthSales) {
        int sum = 0;
        for (int monthSale : monthSales) {
            sum += monthSale;
        }
        return sum;
    }

    public double avgOfSumSalesInMonth(int[] monthSales) {
        return (double) sumOfAllSales(monthSales) / monthSales.length;
    }

    public int numberMonthOfMaxSales(int[] monthSales) {
        int numberMax = 0;
        for (int i = 0; i < monthSales.length; i++) {
            if (monthSales[i] >= monthSales[numberMax]) {
                numberMax = i;
            }
        }
        return numberMax + 1;
    }

    public int numberMonthOfMinSales(int[] monthSales) {
        int numberMin = 0;
        for (int i = 0; i < monthSales.length; i++) {
            if (monthSales[i] <= monthSales[numberMin]) {
                numberMin = i;
            }
        }
        return numberMin + 1;
    }

    public int countMonthInWhichSalesWasBelowAverage(int[] monthSales) {
        int count = 0;
        double avg = avgOfSumSalesInMonth(monthSales);
        for (int monthSale : monthSales) {
            if (monthSale < avg) { count++; }
        }
        return count;
    }

    public int countMonthInWhichSalesWasAboveAverage(int[] monthSales) {
        int count = 0;
        double avg = avgOfSumSalesInMonth(monthSales);
        for (int monthSale : monthSales) {
            if (monthSale > avg) { count++; }
        }
        return count;
    }

}

package ru.netology.stats;

public class StatsService {

    public long sumOfAllSales(long[] monthSales) {
        long sum = 0;
        for (long monthSale : monthSales) {
            sum += monthSale;
        }
        return sum;
    }

    public double avgOfSumSalesInMonth(long[] monthSales) {
        return (double) sumOfAllSales(monthSales) / monthSales.length;
    }

    public int numberMonthOfMaxSales(long[] monthSales) {
        int numberMax = 0;
        for (int i = 0; i < monthSales.length; i++) {
            if (monthSales[i] >= monthSales[numberMax]) {
                numberMax = i;
            }
        }
        return numberMax + 1;
    }

    public int numberMonthOfMinSales(long[] monthSales) {
        int numberMin = 0;
        for (int i = 0; i < monthSales.length; i++) {
            if (monthSales[i] <= monthSales[numberMin]) {
                numberMin = i;
            }
        }
        return numberMin + 1;
    }

    public int countMonthInWhichSalesWasBelowAverage(long[] monthSales) {
        int count = 0;
        double avg = avgOfSumSalesInMonth(monthSales);
        for (long monthSale : monthSales) {
            if (monthSale < avg) { count++; }
        }
        return count;
    }

    public int countMonthInWhichSalesWasAboveAverage(long[] monthSales) {
        int count = 0;
        double avg = avgOfSumSalesInMonth(monthSales);
        for (long monthSale : monthSales) {
            if (monthSale > avg) { count++; }
        }
        return count;
    }

}

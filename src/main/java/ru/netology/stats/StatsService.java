package ru.netology.stats;

public class StatsService {

    public double sumOfSales(double[] sales) {
        //сумма всех продаж
        double sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public double averageSum(double[] sales) {
        //средняя сумма продаж в месяц
        double avgSales = 0;
        avgSales = sumOfSales(sales) / sales.length;
        return avgSales;
    }

    public int maxSales(double[] sales) {
        //Номер месяца, в котором был пик продаж
        int maxSalesDay = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxSalesDay]) {
                maxSalesDay = i;
            }
        }
        return maxSalesDay + 1;
    }

    public int minSales(double[] sales) {
        //Номер месяца, в котором был минимум продаж
        int minSalesDay = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minSalesDay]) {
                minSalesDay = i;
            }
        }
        return minSalesDay + 1;
    }

    public int minMonthsCount(double[] sales) {
        //Кол-во месяцев, в которых продажи были ниже среднего
        int monthCount = 0;
        for (double sale : sales) {
            if (sale <= averageSum(sales)) {
                monthCount = monthCount + 1;
            }
        }
        return monthCount;
    }

    public int maxMonthCount(double[] sales) {
        //Кол-во месяцев, в которых продажи были выше среднего
        int monthCount = 0;
        for (double sale : sales) {
            if (sale >= averageSum(sales)) {
                monthCount = monthCount + 1;
            }
        }
        return monthCount;
    }

}

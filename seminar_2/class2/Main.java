package class2;

import class2.exceptions.ZeroDivisionException;

import static class2.utils.MathsUtils.division;

public class Main {

    public static void main(String[] args) {

        var doubleRes = doubleDivision(125.5, 5.5);
        System.out.println("Результат double деления: ");
        System.out.println(doubleRes);
        System.out.println();

        try {
            var intRes = intDivision(10, 0);
            System.out.println("Результат int деления: ");
            System.out.println(intRes);
        } catch (ZeroDivisionException e) {
            System.out.println("Возникла ошибка в ходе выполнения программы: ");
            e.printStackTrace();
        } finally {
            System.out.println("Программа завершена c кодом 0 :)");
        }
    }

    private static Integer intDivision(int numerator, int denominator) {
        return division(Integer.class, numerator, denominator);
    }

    private static Double doubleDivision(double numerator, double denominator) {
        return division(Double.class, numerator, denominator);
    }

}

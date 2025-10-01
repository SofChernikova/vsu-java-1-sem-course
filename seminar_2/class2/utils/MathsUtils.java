package class2.utils;

import class2.exceptions.ZeroDivisionException;

public class MathsUtils {

    public static <T extends Number> T division(Class<T> type, T arg1, T arg2) {
        if (arg2.equals(0)) {
            throw new ZeroDivisionException("Попытка делить на 0 пресечена!");
        }

        return type.cast(arg1.doubleValue() / arg2.doubleValue());
    }
}

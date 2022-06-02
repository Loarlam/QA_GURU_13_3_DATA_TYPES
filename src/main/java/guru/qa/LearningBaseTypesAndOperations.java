package guru.qa;

import java.util.Random;

import static java.lang.String.format;
import static java.lang.String.valueOf;
import static java.lang.System.out;

public class LearningBaseTypesAndOperations {
    private static int integerVar1 = new Random().nextInt(214748) + 1,
            integerVar2 = new Random().nextInt(2147483) + 1;
    private static double doubleVar1 = new Random().nextInt(10000000) + 90000000.2d,
            doubleVar2 = new Random().nextInt(30000000) + 70000000.4d;
    private static byte byteVar1 = 67,
            byteVar2 = 61;
    private static short shorVal1 = 3459,
            shorVal2 = 1333;
    private static long longVal1 = new Random().nextInt(1000000000) + 9000000000L,
            longVal2 = new Random().nextInt(1000000000) + 100000000L;
    private static float floatVal1 = new Random().nextInt(10000000) + 20000000.2f,
            floatVal2 = new Random().nextInt(50000000) + 90000000.2f;
    private static char[] charArray = {'к', 'и', 'н', 'г'};
    private static boolean boolVal1 = false;
    private static String stringVal1 = "кинг";

    public static void displayMinAndMaxValueOfType() {
        out.println(format("Int:\nmax = %s\nmin = %s\n", Integer.MAX_VALUE, Integer.MIN_VALUE));
        out.println(format("Double:\nmax = %s\nmin = %s\n", Double.MAX_VALUE, Double.MIN_VALUE));
        out.println(format("Byte:\nmax = %s\nmin = %s\n", Byte.MAX_VALUE, Byte.MIN_VALUE));
        out.println(format("Short:\nmax = %s\nmin = %s\n", Short.MAX_VALUE, Short.MIN_VALUE));
        out.println(format("Long:\nmax = %s\nmin = %s\n", Long.MAX_VALUE, Long.MIN_VALUE));
        out.println(format("Float:\nmax = %s\nmin = %s\n", Float.MAX_VALUE, Float.MIN_VALUE));
    }

    public static void addNumbers() {
        out.println(format("Int:\n%s + %s = %s\n", integerVar1, integerVar2, integerVar1 + integerVar2));
        out.println(format("Double:\n%s + %s = %s\n", doubleVar1, doubleVar2, doubleVar1 + doubleVar2));
        out.println(format("Byte:\n%s + %s = %s\n", byteVar1, byteVar2, byteVar1 + byteVar2));
        out.println(format("Short:\n%s + %s = %s\n", shorVal1, shorVal2, shorVal1 + shorVal2));
        out.println(format("Long:\n%s + %s = %s\n", longVal1, longVal2, longVal1 + longVal2));
        out.println(format("Float:\n%s + %s = %s\n", floatVal1, floatVal2, floatVal1 + floatVal2));
    }

    public static void subractNumbers() {
        out.println(format("Int:\n%s - %s = %s\n", integerVar1, integerVar2, integerVar1 - integerVar2));
        out.println(format("Double:\n%s - %s = %s\n", doubleVar1, doubleVar2, doubleVar1 - doubleVar2));
        out.println(format("Byte:\n%s - %s = %s\n", byteVar1, byteVar2, byteVar1 - byteVar2));
        out.println(format("Short:\n%s - %s = %s\n", shorVal1, shorVal2, shorVal1 - shorVal2));
        out.println(format("Long:\n%s - %s = %s\n", longVal1, longVal2, longVal1 - longVal2));
        out.println(format("Float:\n%s - %s = %s\n", floatVal1, floatVal2, floatVal1 - floatVal2));
    }

    public static void divideWithRemainderNumbers() {
        out.println(format("Int:\n%s / %s = %s\n", integerVar2, integerVar1, integerVar2 / integerVar1));
        out.println(format("Double:\n%s / %s = %s\n", doubleVar1, doubleVar2, doubleVar2 / doubleVar1));
        out.println(format("Byte:\n%s / %s = %s\n", byteVar1, byteVar2, byteVar2 / byteVar1));
        out.println(format("Short:\n%s / %s = %s\n", shorVal1, shorVal2, shorVal2 / shorVal1));
        out.println(format("Long:\n%s / %s = %s\n", longVal1, longVal2, longVal2 / longVal1));
        out.println(format("Float:\n%s / %s = %s\n", floatVal1, floatVal2, floatVal2 / floatVal1));
    }

    public static void divideWithModuleReminderNumbers() {
        out.println(format("Int:\n%s %% %s = %s\n", integerVar2, integerVar1, integerVar2 % integerVar1));
        out.println(format("Double:\n%s %% %s = %s\n", doubleVar1, doubleVar2, doubleVar2 % doubleVar1));
        out.println(format("Byte:\n%s %% %s = %s\n", byteVar1, byteVar2, byteVar2 % byteVar1));
        out.println(format("Short:\n%s %% %s = %s\n", shorVal1, shorVal2, shorVal2 % shorVal1));
        out.println(format("Long:\n%s %% %s = %s\n", longVal1, longVal2, longVal2 % longVal1));
        out.println(format("Float:\n%s %% %s = %s\n", floatVal1, floatVal2, floatVal2 % floatVal1));
    }

    public static void multiplyNumbers() {
        out.println(format("Int:\n%s * %s = %s\n", integerVar2, integerVar1, integerVar2 * integerVar1));
        out.println(format("Double:\n%s * %s = %s\n", doubleVar1, doubleVar2, doubleVar2 * doubleVar1));
        out.println(format("Byte:\n%s * %s = %s\n", byteVar1, byteVar2, byteVar2 * byteVar1));
        out.println(format("Short:\n%s * %s = %s\n", shorVal1, shorVal2, shorVal2 * shorVal1));
        out.println(format("Long:\n%s * %s = %s\n", longVal1, longVal2, longVal2 * longVal1));
        out.println(format("Float:\n%s * %s = %s\n", floatVal1, floatVal2, floatVal2 * floatVal1));
    }

    public static void checkingStringAndBooleanType() {
        byteVar1 += byteVar2;

        if (stringVal1.contains(valueOf(charArray)) != boolVal1 && byteVar1 == -128)
            out.println("Условие пройдено\n");
        else
            out.println("Условие не пройдено\n");
    }

    public static void makeAnOverflow() {
        out.println(format("Int:\n%s + %s = %s\n", Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE + Integer.MAX_VALUE));
        out.println(format("Double:\n%s + %s = %s\n", Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE + Double.MAX_VALUE));
        out.println(format("Byte:\n%s + %s = %s\n", Byte.MAX_VALUE, Byte.MAX_VALUE, Byte.MAX_VALUE + Byte.MAX_VALUE));
        out.println(format("Short:\n%s + %s = %s\n", shorVal1, shorVal2, shorVal1 + shorVal2));
        out.println(format("Long:\n%s + %s = %s\n", Long.MAX_VALUE, Long.MAX_VALUE, Long.MAX_VALUE + Long.MAX_VALUE));
        out.println(format("Float:\n%s + %s = %s\n", Float.MAX_VALUE, Float.MAX_VALUE, Float.MAX_VALUE + Float.MAX_VALUE));
    }

    public static void main(String[] args) {
        displayMinAndMaxValueOfType();
        addNumbers();
        subractNumbers();
        divideWithRemainderNumbers();
        divideWithModuleReminderNumbers();
        checkingStringAndBooleanType();
        multiplyNumbers();
        makeAnOverflow();
    }
}
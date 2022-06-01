package guru.qa;

import java.util.Random;

import static java.lang.String.format;
import static java.lang.String.valueOf;
import static java.lang.System.out;

public class LearningBaseTypesAndOperations {
    private static int _integerVar1 = new Random().nextInt(214748) + 1,
            _integerVar2 = new Random().nextInt(2147483) + 1;
    private static double _doubleVar1 = new Random().nextInt(10000000) + 90000000.2d,
            _doubleVar2 = new Random().nextInt(30000000) + 70000000.4d;
    private static byte _byteVar1 = 67,
            _byteVar2 = 61;
    private static short _shorVal1 = 3459,
            _shorVal2 = 1333;
    private static long _longVal1 = new Random().nextInt(1000000000) + 9000000000L,
            _longVal2 = new Random().nextInt(1000000000) + 100000000L;
    private static float _floatVal1 = new Random().nextInt(10000000) + 20000000.2f,
            _floatVal2 = new Random().nextInt(50000000) + 90000000.2f;
    private static char[] _charArray = {'к', 'и', 'н', 'г'};
    private static boolean _boolVal1 = false;
    private static String _stringVal1 = "кинг";

    public static void displayMinAndMaxValueOfType() {
        out.println(format("Int:\nmax = %s\nmin = %s\n", Integer.MAX_VALUE, Integer.MIN_VALUE));
        out.println(format("Double:\nmax = %s\nmin = %s\n", Double.MAX_VALUE, Double.MIN_VALUE));
        out.println(format("Byte:\nmax = %s\nmin = %s\n", Byte.MAX_VALUE, Byte.MIN_VALUE));
        out.println(format("Short:\nmax = %s\nmin = %s\n", Short.MAX_VALUE, Short.MIN_VALUE));
        out.println(format("Long:\nmax = %s\nmin = %s\n", Long.MAX_VALUE, Long.MIN_VALUE));
        out.println(format("Float:\nmax = %s\nmin = %s\n", Float.MAX_VALUE, Float.MIN_VALUE));
    }

    public static void addNumbers() {
        out.println(format("Int:\n%s + %s = %s\n", _integerVar1, _integerVar2, _integerVar1 + _integerVar2));
        out.println(format("Double:\n%s + %s = %s\n", _doubleVar1, _doubleVar2, _doubleVar1 + _doubleVar2));
        out.println(format("Byte:\n%s + %s = %s\n", _byteVar1, _byteVar2, _byteVar1 + _byteVar2));
        out.println(format("Short:\n%s + %s = %s\n", _shorVal1, _shorVal2, _shorVal1 + _shorVal2));
        out.println(format("Long:\n%s + %s = %s\n", _longVal1, _longVal2, _longVal1 + _longVal2));
        out.println(format("Float:\n%s + %s = %s\n", _floatVal1, _floatVal2, _floatVal1 + _floatVal2));
    }

    public static void subractNumbers() {
        out.println(format("Int:\n%s - %s = %s\n", _integerVar1, _integerVar2, _integerVar1 - _integerVar2));
        out.println(format("Double:\n%s - %s = %s\n", _doubleVar1, _doubleVar2, _doubleVar1 - _doubleVar2));
        out.println(format("Byte:\n%s - %s = %s\n", _byteVar1, _byteVar2, _byteVar1 - _byteVar2));
        out.println(format("Short:\n%s - %s = %s\n", _shorVal1, _shorVal2, _shorVal1 - _shorVal2));
        out.println(format("Long:\n%s - %s = %s\n", _longVal1, _longVal2, _longVal1 - _longVal2));
        out.println(format("Float:\n%s +- %s = %s\n", _floatVal1, _floatVal2, _floatVal1 - _floatVal2));
    }

    public static void divideWithRemainderNumbers() {
        out.println(format("Int:\n%s / %s = %s\n", _integerVar2, _integerVar1, _integerVar2 / _integerVar1));
        out.println(format("Double:\n%s / %s = %s\n", _doubleVar1, _doubleVar2, _doubleVar2 / _doubleVar1));
        out.println(format("Byte:\n%s / %s = %s\n", _byteVar1, _byteVar2, _byteVar2 / _byteVar1));
        out.println(format("Short:\n%s / %s = %s\n", _shorVal1, _shorVal2, _shorVal2 / _shorVal1));
        out.println(format("Long:\n%s / %s = %s\n", _longVal1, _longVal2, _longVal2 / _longVal1));
        out.println(format("Float:\n%s / %s = %s\n", _floatVal1, _floatVal2, _floatVal2 / _floatVal1));
    }

    public static void divideWithModuleReminderNumbers() {
        out.println(format("Int:\n%s %% %s = %s\n", _integerVar2, _integerVar1, _integerVar2 % _integerVar1));
        out.println(format("Double:\n%s %% %s = %s\n", _doubleVar1, _doubleVar2, _doubleVar2 % _doubleVar1));
        out.println(format("Byte:\n%s %% %s = %s\n", _byteVar1, _byteVar2, _byteVar2 % _byteVar1));
        out.println(format("Short:\n%s %% %s = %s\n", _shorVal1, _shorVal2, _shorVal2 % _shorVal1));
        out.println(format("Long:\n%s %% %s = %s\n", _longVal1, _longVal2, _longVal2 % _longVal1));
        out.println(format("Float:\n%s %% %s = %s\n", _floatVal1, _floatVal2, _floatVal2 % _floatVal1));
    }

    public static void multiplyNumbers() {
        out.println(format("Int:\n%s * %s = %s\n", _integerVar2, _integerVar1, _integerVar2 * _integerVar1));
        out.println(format("Double:\n%s * %s = %s\n", _doubleVar1, _doubleVar2, _doubleVar2 * _doubleVar1));
        out.println(format("Byte:\n%s * %s = %s\n", _byteVar1, _byteVar2, _byteVar2 * _byteVar1));
        out.println(format("Short:\n%s * %s = %s\n", _shorVal1, _shorVal2, _shorVal2 * _shorVal1));
        out.println(format("Long:\n%s * %s = %s\n", _longVal1, _longVal2, _longVal2 * _longVal1));
        out.println(format("Float:\n%s * %s = %s\n", _floatVal1, _floatVal2, _floatVal2 * _floatVal1));
    }

    public static void checkingStringAndBooleanType() {
        _byteVar1 += _byteVar2;

        if (_stringVal1.contains(valueOf(_charArray)) != _boolVal1 && _byteVar1 == -128)
            out.println("Условие пройдено\n");
        else
            out.println("Условие не пройдено\n");
    }

    public static void makeAnOverflow() {
        out.println(format("Int:\n%s + %s = %s\n", Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE + Integer.MAX_VALUE));
        out.println(format("Double:\n%s + %s = %s\n", Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE + Double.MAX_VALUE));
        out.println(format("Byte:\n%s + %s = %s\n", Byte.MAX_VALUE, Byte.MAX_VALUE, Byte.MAX_VALUE + Byte.MAX_VALUE));
        out.println(format("Short:\n%s + %s = %s\n", _shorVal1, _shorVal2, _shorVal1 + _shorVal2));
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
package guru.qa;

import java.util.Random;

import static java.lang.String.*;
import static java.lang.System.*;

public class LearningBaseTypesAndOperations {
    private static int _integerVar1 = new Random().nextInt(214748) + 1,
                       _integerVar2 = new Random().nextInt(2147483) + 1;

    public static void addNumbers() {
        out.println(format("Сложение:\n%s + %s = %s\n", _integerVar1, _integerVar2, _integerVar1 + _integerVar2));
    }

    public static void subractNumbers() {
        out.println(format("Вычитание:\n%s + %s = %s\n", _integerVar1, _integerVar2, _integerVar1 - _integerVar2));
    }

    public static void main(String[] args) {
        addNumbers();
        subractNumbers();
    }
}


package academy.devdojo.javaoneforall.javacore.Bintroductionmethods.test;

import academy.devdojo.javaoneforall.javacore.Bintroductionmethods.domain.Calculator;

public class CalculatorTest02 { //Varargs (int...)
    public static void main(String... args) {
        int[] numbers = {1, 2, 3, 4, 5};
        Calculator calculator = new Calculator();
        calculator.sumArrayVarArgs(1,numbers);
        calculator.sumArrayVarArgs(1, 3, 4, 2, 1);
    }
}

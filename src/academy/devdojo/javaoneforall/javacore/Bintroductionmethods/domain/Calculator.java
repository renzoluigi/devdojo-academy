package academy.devdojo.javaoneforall.javacore.Bintroductionmethods.domain;

public class Calculator {

    public void sumTwoNumbers(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public void subtractTwoNumbers(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    // Varargs works like an array of int[]
    public void sumArrayVarArgs( double v, int... numbers) { // If do you want to have more than 1 parameter, Vararg parameter must be the last in the list
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        System.out.println(sum);
    }
}

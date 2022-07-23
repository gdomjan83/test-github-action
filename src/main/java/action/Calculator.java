package action;

public class Calculator {

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public double division(int num1, int num2) {
        return (double) num1 / num2;
    }

    public double power(int num1, int num2) {
        return Math.pow(num1, num2);
    }
}

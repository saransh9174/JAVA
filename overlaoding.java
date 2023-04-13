class Calculator {
    int add(int num1, int num2) {
        return num1 + num2;
    }

    double add(double num1, double num2) {
        return num1 + num2;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(2, 3)); // Output: 5

        System.out.println(calculator.add(2.5, 3.7)); // Output: 6.2
    }
}

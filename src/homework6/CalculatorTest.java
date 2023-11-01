package homework6;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator  = new Calculator();

        calculator.calculateSum();
        calculator.calculateSum(1);
        calculator.calculateSum(1, 2);
        calculator.calculateSum(1, 2, 3);
        calculator.calculateSum(1, 2, 3, 4);
        calculator.calculateSum(1, 2, 3, 4, 5);
    }
}

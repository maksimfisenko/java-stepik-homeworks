package homework8;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(Calculator.multiply(1, 2, 3));
        Calculator.printDivisionResult(7, 4);
        calculator.printCircleInfo(1.2);
    }
}

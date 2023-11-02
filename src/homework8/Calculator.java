package homework8;

public class Calculator {
    final private static double pi = 3.14;
    public static int multiply(int n1, int n2, int n3) {
        return n1 * n2 * n3;
    }

    public static void printDivisionResult(int n1, int n2) {
        System.out.println(n1 / n2 + " " + n1 % n2);
    }

    private double calculateCircleSquare(double radius) {
        return pi * radius * radius;
    }

    private double calculateCircleLength(double radius) {
        return 2 * pi * radius;
    }

    public void printCircleInfo(double radius) {
        System.out.println("Radius: " + radius +
                "\nCircle Square: " + this.calculateCircleSquare(radius) +
                "\nCircle Length: " + this.calculateCircleLength(radius));
    }
}

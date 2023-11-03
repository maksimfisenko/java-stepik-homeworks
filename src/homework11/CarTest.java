package homework11;

public class CarTest {
    public static void swapColors(Car car1, Car car2) {
        String car1Color = car1.color;
        car1.color = car2.color;
        car2.color = car1Color;
    }

    public static void changeNumOfDoors(Car car, int numOfDoors) {
        car.numOfDoors = numOfDoors;
    }

    public static void main(String[] args) {
        Car car1 = new Car("red", "x", 2);
        Car car2 = new Car("green", "y", 4);

        System.out.println("Before: ");
        System.out.println("Car 1: " + car1.color + " " + car1.engine + " " + car1.numOfDoors);
        System.out.println("Car 2: " + car2.color + " " + car2.engine + " " + car2.numOfDoors);

        swapColors(car1, car2);
        changeNumOfDoors(car2, 6);

        System.out.println("After: ");
        System.out.println("Car 1: " + car1.color + " " + car1.engine + " " + car1.numOfDoors);
        System.out.println("Car 2: " + car2.color + " " + car2.engine + " " + car2.numOfDoors);
    }
}

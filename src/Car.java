/**
 * Created by Julia on 28.08.2016.
 */
public class Car {
    public String myName = "test car";
    public String color;
    public int speed = 44;
    public String model;

    public Car (String name, String color, int speed, String model) {
        System.out.println("The name of the car is: " + name);
        System.out.println("The color of the car is: " + color);
        System.out.println("The speed of the car is: " + speed);
        System.out.println("The model of the car is: " + model);
        myName=name;
    }

    public static void start () {
        System.out.println("The car has started to move");
    }

    public void printName () {
        System.out.println("The name of the car is: " + myName);
    }

}

/**
 * Created by Julia on 26.08.2016.
 */
public class Main {

    private static User user;
    private static int number;
    private static String name;


    private static Car car1;
    private static Car car2;
    private static Car car3;

    private static Car car4;
    private static Car car5;

    public static void main(String[] args) {
        System.out.println("Hello Java!!!");
        //static method is being called:  the myName of the class.the myName of the method.
        User.helloStaticUser();
        Car.start();

        user = new User();

        user.helloUser();
        number = 555;

        new Car ("Honda","blue",55,"WER88");

        car1 = new Car("BMW", "white" ,8888, "X5");
        car2 = car1;
        car3 = new Car("Ford", "dark-blue" ,99999, "Fusion");

        car1.printName();
        car2.printName();
        car3.printName();

        car1.printColor();
        car2.printColor();
        car3.printColor();

        car1.printSpeed();
        car2.printSpeed();
        car3.printSpeed();

        car4= new Car ("Bently");
        car5= new Car ("Nissan");

        Car.helloNewCar();
        car4.newCar();
        car5.newCar();

        car1.printAllParms("BMW", "white" ,8888, "X5");
    }

}

import java.util.StringTokenizer;

/**
 * Created by Julia on 27.08.2016.
 */
public class User{
    public static String name = "tefal";
    public User age;
    public String country;

    //constructor
    public User () {
        System.out.println("User!");
    }

    //method of the object
    public void helloUser () {
        System.out.println("Hello User!");
    }

    //method of the class
    public static void helloStaticUser () {
        System.out.println("Hello,static User!");

    }
}

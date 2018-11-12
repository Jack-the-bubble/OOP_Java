import java.util.Objects;

public class Animal {
    int legs;

    public static void testClassMethod() {
        System.out.println("The static method in Animal");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Animal");
    }

    public Animal() {
        legs = 4;
    }


    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            Animal object = (Animal)obj;
            return Objects.equals(legs, object.legs);
        }else
            return false;
    }
}

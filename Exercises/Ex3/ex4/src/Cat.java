public class Cat extends Animal{


    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        Animal anotherAnimal = new Animal();
        anotherAnimal.legs = 3;
        Animal myAnimal = myCat;
        Animal.testClassMethod();
        Cat.testClassMethod();
        myAnimal.testInstanceMethod();
        myCat.testInstanceMethod();

        anotherAnimal.testInstanceMethod();
        if (anotherAnimal.equals(myAnimal)) {
            System.out.println("Are equal, the class is"+anotherAnimal.getClass());
        }else System.out.println("Are not equal, the class is "+anotherAnimal.getClass());

    }
}

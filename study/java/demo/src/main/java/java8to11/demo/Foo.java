package java8to11.demo;

public class Foo {
    public static void main(String[] args) {
//        RunSomething runSomething = () -> System.out.println("hello");
        Plus10 plus10 = new Plus10();
        System.out.println("plus10.apply(1) = " + plus10.apply(1));
    }
}

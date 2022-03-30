package decorator.ex2;

public class DecoratorMain {
    public static void main(String[] args) {
        Greeter greeter= new Greeter();
        System.out.println(greeter.greet());
        MessageDocorator decorator=new MessageDocorator(greeter);

        System.out.printf(decorator.greet());
    }
}

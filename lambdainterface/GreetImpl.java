package lambdainterface;

public class GreetImpl implements Greetings{
    @Override
    public void greet() {
        System.out.println("hi");
    }
}

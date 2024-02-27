package lambdainterface;

public class GreetMain {

    public static void main(String args[])
    {
        GreetImpl gr= new GreetImpl();
        gr.greet();

        Greetings g =() -> {
            System.out.println("bye");
        };

        g.greet();

    }
}

package lambdainterface;

import java.util.function.Function;
import java.util.function.Predicate;

class FunctionInterfaceExample{

    public static String greet(String name)
    {
        return "hi "+name;
    }
}
public class Sam {

    public static void main(String args[])
    {
        Predicate<String> s1= (s) -> {
            return s.equals("hi");
        };
        System.out.println(s1.test("bye"));

        Function<String, String> f1= FunctionInterfaceExample:: greet;
        System.out.println(f1.apply("thanmayee"));




    }




}

package collections;

import java.util.*;
public class TreeSets {

    public static void main(String[] args)
    {
        TreeSet<String> ts= new TreeSet<>();
        ts.add("z");
        ts.add("x");
        ts.add("a");
        ts.add("b");

        Iterator<String> itr= ts.descendingIterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}

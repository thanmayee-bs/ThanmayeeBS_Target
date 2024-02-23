package collections;
import java.util.*;
public class linkedl {
    public static void main(String[] args)
    {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("abc");
        ll.add("xyz");
        ll.add("efg");

        Iterator<String> itr = ll.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println(ll.getFirst());

    }
}

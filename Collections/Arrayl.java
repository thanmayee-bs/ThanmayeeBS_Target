package Collections;

import java.util.*;

public class Arrayl {

    public static void main(String args[])
    {
        ArrayList<Integer> al= new ArrayList<>();

        for(int i=0;i<5;i++)
            al.add((i+1)*10);
        for(Integer integer : al) {
            System.out.println(integer);
        }
        al.set(1,0);
        Collections.sort(al);
        for(int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }

    }
}

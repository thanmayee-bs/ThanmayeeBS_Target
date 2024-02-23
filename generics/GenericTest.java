package generics;

import java.sql.SQLOutput;

class Test<T>{

    T obj;
    Test(T ob){
        obj=ob;
    }
    public T getObject() {
        return obj;
    }
}
public class GenericTest {

    public static void main(String[] args) {
        Test<Integer> t1 = new Test<>(10);
        System.out.println(t1.getObject());
        Test<String> t2 = new Test<>("hi");
        System.out.println(t2.getObject());
    }



}

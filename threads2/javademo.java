package threads2;

import threads.ThreadsDemo;

public class javademo {

    public static void main(String args[]) throws InterruptedException {
        ThreadJoin th1 = new ThreadJoin();
        ThreadJoin th2 = new ThreadJoin();
        ThreadJoin th3 =  new ThreadJoin();

        th1.start();
        th1.join(); //asking t2 to wait till t1 finishes
        th2.start();
        th2.join();
        th3.start();
    }
}

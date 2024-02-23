package threads;

public class ThreadsDemo {
    public static void main(String args[])
    {
        RThread rthread= new RThread();
        Thread rt= new Thread(rthread);
        rt.start();
        Multi dbThread= new Multi("dbThread",10);
        dbThread.start();
        Multi netThread= new Multi("netThread",100);
        netThread.start();
        for(int i=1;i<5;i++)
        {
            try {
                Thread.sleep(750);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+"-"+i*1000);
        }
    }
}

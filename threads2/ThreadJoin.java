package threads2;

public class ThreadJoin extends Thread{

    @Override
    public void run()
    {
        for(int i=1;i<5;i++)
        {
            System.out.println(i+" "+Thread.currentThread().getName());
        }
    }
}

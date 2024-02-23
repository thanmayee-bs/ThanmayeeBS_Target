package threads;

public class Multi extends Thread{
    int multiplicand;
    public Multi(String dbThread, int i) {
        super(dbThread);
        multiplicand=i;
    }
    @Override
    public void run()
    {
        for(int i=1;i<5;i++)
        {
            try {
                Thread.sleep(500);  //putting main thread to sleep
                System.out.println(i*multiplicand);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}

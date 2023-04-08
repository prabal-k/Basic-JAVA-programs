public class Main  {
    public static void main(String[] args) throws InterruptedException
    {
        counter c = new counter();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run()
            {
                for (int i=0;i<1000;i++){
                    c.inc();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable()
        {
            @Override
            public void run() {
                for(int i=0;i<500;i++){
                    c.inc();
                }
            }
        });

        thread1.start();
        thread2.start();


        thread2.join();
        thread1.join();
        System.out.println("count : "+ c.count);
    }
}
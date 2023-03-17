public class Main {
    public static void main(String[] args) {
        process1 p1 = new process1();
        process2 p2 = new process2();
        p1.start();
        p2.start();
    }
}
class process1 extends Thread
{
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("process1....");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class process2 extends Thread
{
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("process2....");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

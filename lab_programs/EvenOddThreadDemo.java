class EvenThread extends Thread {
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println("Even Thread: " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 19; i += 2) {
            System.out.println("Odd Thread: " + i);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class EvenOddThreadDemo {
    public static void main(String[] args) {

        EvenThread e = new EvenThread();
        OddThread o = new OddThread();

        e.start();
        o.start();
    }
}
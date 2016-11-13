package moleque;

import java.util.concurrent.Semaphore;

public class ThreadDiv extends Thread{
    private int num1, num2;
    private Semaphore backward;

    public ThreadDiv(int n1, int n2, Semaphore back)
    {
        if (n2 == 0)
            throw new IllegalArgumentException("Argument 'divisor' is 0");
        num1 = n1;
        num2 = n2;
        backward = back;
    }

    public void run()
    {
        try {
            backward.acquire();
            System.out.println("Div = " + (num1 / num2));
        }
        catch (InterruptedException ex) {
            System.err.println("Division interrupted");
        }
    }
}

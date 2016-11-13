package moleque;

import java.util.concurrent.Semaphore;

public class ThreadMult extends Thread
{
    private int num1, num2, num3;
    private Semaphore backward, forward;

    public ThreadMult(int n1, int n2, int n3, Semaphore back, Semaphore front)
    {
        num1 = n1;
        num2 = n2;
        num3 = n3;
        backward = back;
        forward = front;
    }

    public void run()
    {
        try {
            backward.acquire();
            System.out.println("Mult = " + (num1 * num2 * num3));
            forward.release();
        }
        catch (InterruptedException ex) {
            System.err.println("Multiplication interrupted");
        }
    }
}

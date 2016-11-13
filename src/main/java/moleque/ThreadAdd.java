package moleque;

import java.util.concurrent.Semaphore;

public class ThreadAdd extends Thread
{
    private int num1, num2;
    private Semaphore forward;

    public ThreadAdd(int n1, int n2, Semaphore fwd)
    {
        num1 = n1;
        num2 = n2;
        forward = fwd;
    }

    public void run()
    {
        System.out.println("Sum = " + (num1 + num2));
        forward.release();
    }
}

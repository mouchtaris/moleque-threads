package moleque;

import java.util.concurrent.Semaphore;

public class ThreadSub extends Thread
{
    private int num1, num2;
    private Semaphore backward, forward;

    public ThreadSub(int n1, int n2, Semaphore back, Semaphore front)
    {
        num1 = n1;
        num2 = n2;
        backward = back;
        forward = front;
    }

    public void run()
    {
        backward.acquire();
        System.out.println("Sub =" + (num1 - num2));
        forward.release();
    }
}

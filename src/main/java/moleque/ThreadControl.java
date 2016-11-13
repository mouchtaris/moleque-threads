package moleque;

import java.util.concurrent.Semaphore;

public class ThreadControl
{
    public static void main(String[] args)
    {
        Semaphore sem1 = new Semaphore(0),
                  sem2 = new Semaphore(0),
                  sem3 = new Semaphore(0);
        ThreadAdd thr1 = new ThreadAdd(2,3, sem1);
        ThreadSub thr2 = new ThreadSub(2,3, sem1, sem2);
        ThreadMult thr3 = new ThreadMult(2,2,1, sem2, sem3);
        ThreadDiv thr4 = new ThreadDiv(6, 2, sem3);

        thr1.start();
        thr2.start();
        thr3.start();
        thr4.start();
    }
}

package moleque;

public class ThreadSub extends Thread
{
    private int num1, num2;

    public ThreadSub(int n1, int n2)
    {
        num1 = n1;
        num2 = n2;
    }

    public void run()
    {
        System.out.println("Sub =" + (num1 - num2));
    }
}

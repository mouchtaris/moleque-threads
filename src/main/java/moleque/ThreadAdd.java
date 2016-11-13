package moleque;

public class ThreadAdd extends Thread
{
    private int num1, num2;

    public ThreadAdd(int n1, int n2)
    {
        num1 = n1;
        num2 = n2;
    }

    public void run()
    {
        System.out.println("Sum = " + (num1 + num2));
    }
}

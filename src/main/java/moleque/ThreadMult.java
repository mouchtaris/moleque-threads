package moleque;

public class ThreadMult extends Thread
{
    private int num1, num2, num3;

    public ThreadMult(int n1, int n2, int n3)
    {
        num1 = n1;
        num2 = n2;
        num3 = n3;
    }

    public void run()
    {
        System.out.println("Mult = " + (num1 * num2 * num3));
    }
}

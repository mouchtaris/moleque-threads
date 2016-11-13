package moleque;

public class ThreadDiv extends Thread{
    private int num1, num2;

    public ThreadDiv(int n1, int n2)
    {
        if (n2 == 0)
            throw new IllegalArgumentException("Argument 'divisor' is 0");
        num1 = n1;
        num2 = n2;
    }

    public void run()
    {
         System.out.println("Div = " + (num1 / num2));
    }
}

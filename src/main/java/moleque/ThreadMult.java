package moleque

public class ThreadMult extends Thread
{
    private int num1, num2, num3;

    // Κατασκευαστής
    public ThreadMult(int n1, int n2, int n3)
    {
        num1 = n1;
        num2 = n2;
        num3 = n3;
    }

    // Νήμα που υπολογίζει το γινόμενο τριών αριθμών
    public void run()
    {
        System.out.println("Mult = " + (num1 * num2 * num3));
    }
}

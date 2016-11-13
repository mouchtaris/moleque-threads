class ThreadAdd extends Thread
{
	private int num1, num2;  
	// Κατασκευαστής
	public ThreadAdd(int n1, int n2)
	{
		num1 = n1;
		num2 = n2;
	} 
	
	// Νήμα που υπολογίζει το άθροισμα δύο αριθμών
	public void run()
	{
		System.out.println("Sum = " + (num1 + num2));
	}
}

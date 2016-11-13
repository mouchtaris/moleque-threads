class ThreadControl
{
	public static void main(String[] args) 
	{
		// Δημιουργία τριών διαφορετικών νημάτων
		ThreadAdd thr1 = new ThreadAdd(2,3);
		ThreadSub thr2 = new ThreadSub(2,3);
		ThreadMult thr3 = new ThreadMult(2,2,1);

		// Εκκίνηση τριών παράλληλων νημάτων
		thr1.start();
		thr2.start();
		thr3.start();
	}
}

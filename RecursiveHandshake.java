

public class RecursiveHandshake
{
	//private int n;
	private int numHandshakes;

	public int getNumHandshakes()
	{
		return numHandshakes;
	}

	public void handshake(int n)
	{
		if(n <= 1)
		{
			System.out.println();
		}
		else
		{
			numHandshakes += (n-1);
			handshake(n-1);
		}
	}

	public static void main(String[] args)
	{
		RecursiveHandshake people = new RecursiveHandshake();
		people.handshake(3);
		System.out.println(people.getNumHandshakes());
	}
}
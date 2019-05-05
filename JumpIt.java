

public class JumpIt
{
	private int[] array;
	private int[] sortedArray;
	private int totalCost = 0;

	public JumpIt(int[] array)
	{
		this.array = array;
		//this.sortedArray = array;
		//sortArray();
	}

	public void getArray()
	{
		for(int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public int getTotalCost()
	{
		return totalCost;
	}

	public int[] sortArray()
	{
		int small, temp;
		for(int i = 0; i < sortedArray.length; i++)
		{
			small = i;
			for(int j = i + 1; j < sortedArray.length; j++)
			{
				if(sortedArray[j] < sortedArray[small])
				{
					small = j;
				}
			}
			if(small != i)
			{
				temp = sortedArray[small];
				sortedArray[small] = sortedArray[i];
				sortedArray[i] = temp;
			}
		}
		return(sortedArray);
	}

	public void lowestCost(int n)
	{
		if(n >= (array.length - 1))
		{
			System.out.println();
		}
		else if(n == (array.length - 2))
		{
			totalCost = totalCost + array[n+1];
		}
		else
		{
			if((totalCost + array[n+1]) <= (totalCost + array[n+2]))
			{
				totalCost = totalCost + array[n+1];
				lowestCost(n+1);
			}
			else
			{
				totalCost = totalCost + array[n+2];
				lowestCost(n+2);
			}
		}
	}

	public static void main(String[] args)
	{
		int[] array = {0,3,80,6,57,10};
		JumpIt test = new JumpIt(array);

		test.lowestCost(0);

		System.out.println(test.getTotalCost());
	}
}
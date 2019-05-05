

public class NeedleInHaystack
{
	private static int n = 0;
	private static String haystack;
	private static String tempHaystack;
	private static String needle;
	private static String tempNeedle;

	public NeedleInHaystack(String haystack, String needle)
	{
		this.haystack = haystack;
		this.tempHaystack = "";
		this.needle = needle;
		this.tempNeedle = "";
	}

	public static String getHaystack()
	{
		return haystack;
	}

	public String getNeedle()
	{
		return needle;
	}

	public static boolean contains(String haystack, String needle)
	{
		boolean containsBool = false;
		if(haystack.length() < needle.length())
		{
			System.out.println("Haystack too short");
			containsBool = false;
		}
		else if(needle.charAt(n) != haystack.charAt(n))
		{
			if(n >= needle.length())
				contains(String.valueOf(haystack.charAt(n+1)), String.valueOf(needle.charAt(n)));
			else	
				contains(String.valueOf(haystack.charAt(n+1)), String.valueOf(needle.charAt(n+1)));

		}
		else if(tempNeedle.equals(tempHaystack))
		{
			containsBool = true;
		}
		else
		{
			tempNeedle = tempNeedle + needle.charAt(n);
			tempHaystack = tempHaystack + haystack.charAt(n);
			if(n >= needle.length())
				contains(String.valueOf(haystack.charAt(n+1)), String.valueOf(needle.charAt(n)));
			else	
				contains(String.valueOf(haystack.charAt(n+1)), String.valueOf(needle.charAt(n+1)));

		}
		return containsBool;
	}

	public static void main(String[] args)
	{
		NeedleInHaystack test = new NeedleInHaystack("Kristina", "tina");
		test.contains(test.getHaystack(),test.getNeedle());
	}
}
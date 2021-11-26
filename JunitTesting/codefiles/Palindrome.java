package palindrome_package;

public class Palindrome {
	public boolean checkPalindrome(String a)
	{
		if(a==" ")
		{
			throw new IllegalArgumentException("must be supplied a valid input string");
		}
		int n=a.length();
		for(int i=0;i<n/2;i++)
		{
			if(a.charAt(i)!=a.charAt(n-1-i))
			{
				return false;
			}
		}
		return true;
	}

}

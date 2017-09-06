
public class PalindromeCheck {

	public boolean isPalindrome(String str)
	{
		String reverse = "";
		
		int orgLength = str.length();
		
		for(int i = orgLength-1;i>=0;i--)
		{
			reverse = reverse + str.charAt(i);
		}

		if (str.equals(reverse))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}

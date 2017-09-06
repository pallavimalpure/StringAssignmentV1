
public class StringApp {

	public static void main(String[] args) 
	{
		PalindromeCheck checkpalindrome = new PalindromeCheck();
		String str = "dalad";
		boolean result = checkpalindrome.isPalindrome(str);
		if (result)
		{
			System.out.println(String.format("String %s is Palindrome",str));
		}
		else
		{
			System.out.println(String.format("String %s is not Palindrome",str));
		}
		
		StringReverse rev = new StringReverse();
		String revString = rev.reverseAString(str);
		System.out.println(String.format("Reverse String of %s is %s",str,revString));
		
		ReplaceChar repChar = new ReplaceChar();
		String repString = repChar.replaceChartAt(str, 'd', 'a');
		System.out.println(String.format("Replaced String of %s is %s",str,repString));
				
		
		MaxRepeatedChar maxRep = new MaxRepeatedChar ();
		char maxRepeated = maxRep.findMaxRepeatedChar(str);
		System.out.println("Maximum Repeated character: " + maxRepeated);
		
	}

}


public class StringReverse 
{
	public String reverseAString(String str)
	{
		String reverse = "";
		
		int strLength = str.length();
		
		for(int i = strLength-1; i >= 0 ; i--)
		{
			reverse = reverse + str.charAt(i);
		}
		
		return reverse;
		
		
	}
}

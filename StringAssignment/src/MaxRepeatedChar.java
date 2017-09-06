
public class MaxRepeatedChar 
{
	public char findMaxRepeatedChar(String str)
	{
		char maxRep = ' ', currentChar = ' ';
		int charCnt = 0;
		int maxCnt = 0;
		
		int orgLength = str.length();
		
		for(int i = 0; i < orgLength -1 ; i++)
		{
			for(int j = 0; j < orgLength -1; j++)
			{
				if (str.charAt(i) == str.charAt(j))
				{
					charCnt++;
					currentChar = str.charAt(i);
				}
			}
			if (charCnt > maxCnt)
			{
				maxCnt = charCnt;
				maxRep = currentChar;
				charCnt = 0;
				currentChar = ' ';
			}
		}
		
		return maxRep;
	}
}


public class ReplaceChar 
{
	public String replaceChartAt(String str, char target, char replacement)
	{		
		int orgLength = str.length();
		String repString = "";
		
		for(int i = 0;i < orgLength;i ++)
		{
			if (str.charAt(i) == target)
			{
				repString = repString + replacement;
			}
			else
			{
				repString = repString + str.charAt(i);
			}
		}
		
		return repString;
	}
}

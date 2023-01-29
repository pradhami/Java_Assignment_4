public class Q3 
{

	public static void main(String[] args) 
	{
		/* WAP to check if “2552” is palindrome or not */	

		String str = "2552";
		
		char[] strArray = str.toCharArray();
		int flag = 0;
		for(int i = strArray.length-1, j = 0; i>=0 && j<strArray.length; i--,j++)
		{
			if(j >= i)
			{
				break;
			}
			else if(strArray[i] == strArray[j])
			{
				flag++;
			}
		}
		if(flag == strArray.length/2)
		{
			System.out.println(str + " is palindrome");
		}
		else
		{
			System.out.println(str + " is not palindrome");
		}
	}
}

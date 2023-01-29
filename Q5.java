import java.util.Scanner;

public class Q5 
{

	public static void main(String[] args) 
	{
		/* WAP to implement Anagram Checking least inbuilt methods being used */	

		String firstStr, secondStr;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter first string: ");
		firstStr = sc.nextLine();
		System.out.print("Please enter second string: ");
		secondStr = sc.nextLine();
		sc.close();
		
		char[] firstStrArray = firstStr.toCharArray();
		char[] secondStrArray = secondStr.toCharArray();
		

		int count = 0;
		int spaceCount = 0;
		for(int i = 0; i<firstStrArray.length; i++)
		{
			if(firstStrArray[i] != ' ')
			{
				for(int j = 0; j<secondStrArray.length; j++)
				{
					if(firstStrArray[i] == secondStrArray[j])
					{
						secondStrArray[j] = '\u0000';
						count++;
					}
				}
			}
			else
			{
				spaceCount++;
			}
		}
		if(count == firstStrArray.length-spaceCount)
		{
			System.out.print("Strings "+ firstStr + " and " + secondStr + " are Anagram!");
		}
		else 
		{
			System.out.print("Strings "+ firstStr + " and " + secondStr + " are not Anagram.");
		}
	}
}

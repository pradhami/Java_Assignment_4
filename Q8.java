import java.util.Scanner;

public class Q8 
{

	public static void main(String[] args) 
	{
		/* WAP to find the maximum occurring character in a String */	

		String str;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter string: ");
		str = sc.nextLine();
		sc.close();
		
		char[] strArray = str.toCharArray();
		
		int high = 0;
		char ch = strArray[0];
		for(int i = 0; i<strArray.length; i++)
		{
			int count = 0;
			for(int j = 0; j<strArray.length; j++)
			{
				if(strArray[i] == strArray[j] && strArray[i] != ' ')
				{
					count++;
				}
			}
			if(count > high)
			{
				high = count;
				ch = strArray[i];
			}
		}
	
		System.out.print("Maximum occurring character in " + str + " is " + ch);
	
	}
}

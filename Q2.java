import java.util.Scanner;

public class Q2 
{

	public static void main(String[] args) 
	{
		/* WAP to print Duplicates characters from the String */	

		String str;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter string: ");
		str = sc.nextLine();
		sc.close();
		
		char[] strArray = str.toCharArray();
		
		System.out.print("Duplicates characters from the String are: ");
		for(int i = 0; i<strArray.length; i++)
		{
			int flag = 0;
			for(int j = 0; j<strArray.length; j++)
			{
				if(j < i && strArray[i] == strArray[j])
				{
					break;
				}
				else if(j > i && strArray[i] == strArray[j])
				{
					flag++;
				}
			}
			
			if(flag != 0)
			{
				System.out.print(strArray[i] + " ");
			}
		}
	}
}

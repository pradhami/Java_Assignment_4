import java.util.Scanner;

public class Q7 
{

	public static void main(String[] args) 
	{
		/* WAP to find if String contains all unique characters */	

		String str;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter string: ");
		str = sc.nextLine();
		sc.close();
		
		char[] strArray = str.toCharArray();
		
		int flag = 0;
		for(int i = 0; i<strArray.length; i++)
		{
			if(flag == 0)
			{
				for(int j = 0; j<strArray.length; j++)
				{
					if(j < i && strArray[i] == strArray[j])
					{
						break;
					}
					else if(j > i && strArray[i] == strArray[j])
					{
						flag++;
						break;
					}
				}
			}
			else
			{
				break;
			}
		}
			
		if(flag == 0)
		{
			System.out.print("String "+ str + " contains all unique characters!");
		}
		else
		{
			System.out.print("String "+ str + " contains duplicate characters.");
		}
	}
}

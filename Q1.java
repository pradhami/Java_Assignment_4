import java.util.Scanner;

public class Q1 
{

	public static void main(String[] args) 
	{
		/* WAP to remove Duplicates from a String */	

		String str;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter string: ");
		str = sc.nextLine();
		sc.close();
		
		char[] strArray = str.toCharArray();
		
		char[] tmp = new char[strArray.length];
		tmp[0] = strArray[0];
		int index = 1;
		for(int i = 1; i<strArray.length; i++)
		{
			int flag = 0;
			for(int j = 0; j<strArray.length; j++)
			{
				if(strArray[i] == tmp[j])
				{
					flag = 1;
					break;
				}
				else if(tmp[j] == '\u0000')
				{
					break;
				}
			}
			
			if(flag != 1)
			{
				tmp[index] = strArray[i];
				index++;
			}
		}
		
		System.out.print("String after removing duplicate characters: ");
		for (char c : tmp) 
		{
			if(c != '\u0000')
			{
				System.out.print(c);
			}
		}
	}

}

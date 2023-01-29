import java.util.Scanner;

public class Q6 
{

	public static void main(String[] args) 
	{
		/* WAP to implement Pangram Checking with least inbuilt methods being used */	

		String str;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter string: ");
		str = sc.nextLine();
		sc.close();

		char[] strArray = str.toCharArray();

		int[] aplha = new int[26];
		for(int i = 0; i<strArray.length; i++)
		{
			if(strArray[i] >= 65 && strArray[i] <= 90)
			{
				aplha[strArray[i]-65]++;
			}
			else if(strArray[i] >= 97 && strArray[i] <= 122)
			{
				aplha[strArray[i]-97]++;
			}
		}
		
		int flag = 0;
		for (int i : aplha) 
		{
			if(i == 0)
			{
				flag = 1;
			}
		}
		
		if(flag == 0)
		{
			System.out.print("String "+ str + " is Pangram!");
		}
		else
		{
			System.out.print("String "+ str + " is not Pangram!");
		}
	}
}

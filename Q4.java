import java.util.Scanner;

public class Q4 
{

	public static void main(String[] args) 
	{
		/* WAP to count the number of consonants, vowels, special characters in a String */
		
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter string: ");
		str = sc.nextLine();
		sc.close();
		
		char[] strArray = str.toCharArray();
		int consonants = 0, vowels = 0, specialCharacters = 0;
		for(int i = 0; i<strArray.length; i++)
		{
			if(strArray[i] == 'a' || strArray[i] == 'e' || strArray[i] == 'i' || strArray[i] == 'o'|| strArray[i] == 'u'||
					strArray[i] == 'A' || strArray[i] == 'E'|| strArray[i] == 'I'|| strArray[i] == 'O' || strArray[i] == 'U')
			{
				vowels++;
			}
			else if((strArray[i] >= 65 && strArray[i] <= 90) || (strArray[i] >= 97 && strArray[i] <= 122))
			{
				consonants++;
			}
			else if((strArray[i] < 48 || strArray[i] > 57) && strArray[i] != ' ')
			{
				specialCharacters++;
			}
		}
		System.out.println("Number of consonants: "+ consonants);
		System.out.println("Number of vowels: "+ vowels);
		System.out.println("Number of special characters: "+ specialCharacters);
	}
}

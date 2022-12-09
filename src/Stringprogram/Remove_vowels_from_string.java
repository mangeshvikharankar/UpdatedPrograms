package Stringprogram;

public class Remove_vowels_from_string {
	
	public static void main (String[] args)
	{
		String str = "the dog chased cat into the yard";
//		String newstr = str.replaceAll("[aeiou]", "");
//		System.out.println(newstr);
		
		String newstr = "";
		String  vowels = "aeiouAEIOU";
		char ch;
		int count;

		
		for (int i =0; i<str.length();i++)
		{
			count =0;
			ch = str.charAt(i);
			for(int k =0; k<vowels.length();k++)
			{
				if (ch == vowels.charAt(k))
					count++;
			}
			if (count==0)
			{
				newstr = newstr + ch;
			}
		}
		System.out.println(newstr);
	}

}

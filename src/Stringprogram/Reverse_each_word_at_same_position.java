package Stringprogram;

public class Reverse_each_word_at_same_position 
{
	public static void main (String [] args)
	
	{
		String Given = "I am Captain Jack Sparrow";
		String Result = "";
		String [] Words = Given.split(" ");
		
		for (int i =0; i<Words.length;i++)
		{
			String word = Words[i];
			String wordreverse = "";
			for (int x =word.length()-1;x>=0;x--)
			{
				wordreverse = wordreverse +word.charAt(x);
				
			}
			Result = Result + wordreverse + " ";
			
		}
		System.out.println(Result);
		
		
		
//		for (int i=0; i<=Sort.length-1; i++)
//		{
//			String Reverse = Sort [i];
//			char [] New = Reverse.toCharArray();
//			int a ;
//			int b = New.length-1;
//			char temp;
//			for (a=0; a<b; a++)
//			{
//				temp = New [a];
//				New [a]= New [b];
//				New [b]= temp;
//				b--;
//			}
//			Result = Result + new String (New) + " ";		
//		}
//		System.out.println(Result);	
	}
}



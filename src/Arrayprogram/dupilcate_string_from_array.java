package Arrayprogram;

public class dupilcate_string_from_array 
{
  // Program to find the duplicated words from string
	
	public static void main(String[] args) 
	{
		String str ="aaa bbb bbb aab";
		String arr [] = str.split(" ");
		
		for ( int i =0; i<=arr.length; i++)
			{
				for  ( int j =i+1; j <=arr.length-1; j++)
				{
					if (arr[i].equals(arr[j]))
					{
						System.out.println(arr[j]);
					}
	
				}
	    
//		for ( int i =0; i<=arr.length-1; i++)
//		{
//			int count =1;
//			for  ( int j =i+1; j <=arr.length-1; j++)
//			{
//				if ((arr[i].equals(arr[j])))
//				{
//					count++;
//					arr[j]=" ";
//				}
//			}
//			if (count>1 && arr[i]!=" ")
//			{
//				System.out.println(arr[i] +" -duplicate string found in array");
//			}
//
//		}
	}

}
}

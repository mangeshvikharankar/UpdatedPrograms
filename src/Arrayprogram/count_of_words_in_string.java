package Arrayprogram;

import java.util.HashMap;

public class count_of_words_in_string 
{
	public static void main(String[] args) {
		
        int arr[] = {10, 20, 10, 40, 50, 50, 60, 60, 60};
   

        HashMap<Integer,Integer> hsmap = new HashMap<Integer,Integer>();

 
        for (int i =0; i<arr.length;i++) 
        {
        	if(hsmap.containsKey(arr[i]))
        	{
        		hsmap.put(arr[i], hsmap.get(arr[i])+1);
        		
        	}
        	else 
        	{
        			hsmap.put(arr[i], 1);
			}
           
        }
        System.out.println(hsmap);
}
}
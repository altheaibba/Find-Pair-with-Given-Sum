import java.util.*;

public class PairSum 
{
	public static void main(String [] args)
	{
		int [] array = {1,2,4,4};
		int sum = 8;
		System.out.println(checkPair(array,sum));
	}
	
	public static boolean checkPair(int [] array, int sum)
	{
		Hashtable<Integer,Integer> ht = new Hashtable<>(); //Hash table will store the difference between the sum and the integer in the array
		
		for(int i = 0; i<array.length; i++) //Iterate through array and check each element
		{	
			if(ht.containsKey(sum-array[i])) //If the element is in the hash table, i.e. if the element has been seen before
			{
				return true; //Match found
			}
			else //If the element has NOT been seen in the array before
			{
				ht.put(array[i], sum-array[i]); //Add it to the hash table
			}
		}
		return false;
	}
}

package comStringPrograms.java;
import java.lang.String;
import java.lang.System;

public class Anagrams {
	
	public static void main(String args[]) {
		
		String str1="abcd";
		String str2="dabc";
		
		System.out.println(isAnagram(str1,str2));
	}

	
	public static boolean isAnagram(String str1,String str2)
	{
		if(str1.length() != str2.length())
		{
			return false;
		}
		
		 str1 = str1.toLowerCase();
		 str2 = str2.toLowerCase();
		 
		 int[] array = new int[256];
		 
		 for(char c : str1.toCharArray())
		 {
			 array[c]++;
		 }
		 for(char c : str2.toCharArray())
		 {
			 array[c]--;
		 }
		 
		 for(int i : array)
		 {
			 if(i != 0)
				 
				 return false;
		 }
		 return true;
	}
}

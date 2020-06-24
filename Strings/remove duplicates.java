/*
Given a string, the task is to remove duplicates from it. Expected time complexity O(n) where n is length of input string and extra space O(1) under the assumption that there are total 256 possible characters in a string.

Note: that original order of characters must be kept same. 

Input:
First line of the input is the number of test cases T. And first line of test case contains a string.

Output: 
Modified string without duplicates and same order of characters.

Constraints: 
1 <= T <= 15
1 <= |string|<= 1000

Example:
Input:
2
geeksforgeeks
geeks for geeks

Output:
geksfor
geks for
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		sc.nextLine();
		int w =0;
		while(w<t)
		{
		    String s = sc.nextLine();
		    
		    LinkedHashMap<Character,Boolean> hm = new LinkedHashMap<>();
		    
		    for(int i=0;i<s.length();i++)
		    {
		        if(!hm.containsKey(s.charAt(i)))
		        {
		            hm.put(s.charAt(i),true);
		        }
		    }
		    
		    for(Map.Entry<Character,Boolean> e : hm.entrySet())
		    {
		        System.out.print(e.getKey());
		    }
		    System.out.println();
		    w++;
		}
	}
}
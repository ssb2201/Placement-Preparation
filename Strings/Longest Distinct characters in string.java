/*
Given a string S, find length of the longest substring with all distinct characters.  For example, for input "abca", the output is 3 as "abc" is the longest substring with all distinct characters.

Input:
The first line of input contains an integer T denoting the number of test cases.
The first line of each test case is String str.

Output:
Print length of smallest substring with maximum number of distinct characters.
Note: The output substring should have all distinct characters.

Constraints:
1 ≤ T ≤ 100
1 ≤ size of str ≤ 10000

Example:
Input:
2
abababcdefababcdab
geeksforgeeks

Output:
6
7
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
		
		int w=0;
		while(w<t)
		{
		    String s = sc.nextLine();
		    int max =0;
		    int a =0;
		    HashMap<Character,Integer> hm = new HashMap<>();
		    for(int i=0;i<s.length();i++)
		    {
		        if(!hm.containsKey(s.charAt(i)))
		        {
		            hm.put(s.charAt(i),i);
		            
		            a++;
		   
		        }
		        else
		        {
		           
		           
		            int j = hm.get(s.charAt(i));
		            a=0;
		            hm =new HashMap<>();
		            i=j;
		            
		        }
		         max = Math.max(max,a);
		    }
		    System.out.println(max);
		    w++;
		}
	}
}
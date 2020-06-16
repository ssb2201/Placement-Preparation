/*
Longest Common Prefix in an Array 
Given a array of N strings, find the longest common prefix among all strings present in the array.

Input:
The first line of the input contains an integer T which denotes the number of test cases to follow. Each test case contains an integer N. Next line has space separated N strings.

Output:
Print the longest common prefix as a string in the given array. If no such prefix exists print "-1"(without quotes).

Constraints:
1 <= T <= 103
1 <= N <= 103
1 <= |S| <= 103

Example:
Input:
2
4
geeksforgeeks geeks geek geezer
3
apple ape april

Output:
gee
ap

Explanation:
Testcase 1: Longest common prefix in all the given string is gee.
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int q=0;q<t;q++)
		{
		    int n = sc.nextInt();
		    String[] a = new String[n];
		    sc.nextLine();
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i] =sc.next();
		    }

		    String ans="";
		    
		    int len = a[0].length();
		    int flag=1;

		    for(int i=0;i<len;i++)
		    {
		        
		       ans = a[0].substring(0,i+1);

		        for(int j=0;j<n;j++)
		        {
		            if(a[j].indexOf(ans)!=0)
		            {
		                  ans = a[0].substring(0,i);
		                  flag=0;
		                  break;
		            }
 
		        }
		   
		        if(flag==0)
		        {
		            break;
		        }
		    }
		   if(ans.length()!=0)
		   {
		        System.out.println(ans);
		   }
		   else
		   {
		        System.out.println(-1);
		   }
		}
	}
}
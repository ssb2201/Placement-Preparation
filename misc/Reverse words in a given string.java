/*
Reverse words in a given string 
Given a String of length S, reverse the whole string without reversing the individual words in it. Words are separated by dots.

Input:
The first line contains T denoting the number of testcases. T testcases follow. Each case contains a string S containing characters.

Output:
For each test case, in a new line, output a single line containing the reversed String.

Constraints:
1 <= T <= 100
1 <= |S| <= 2000

Example:
Input:
2
i.like.this.program.very.much
pqr.mno

Output:
much.very.program.this.like.i
mno.pqr
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
		for(int i=0;i<t;i++)
		{
		    String s = sc.nextLine();
		    String[] a = s.split("\\.");
		    
		    for(int j=a.length-1;j>=0;j--)
		    {
		        if(j==0)
		        {
		            System.out.print(a[j]);
		        }
		        else
		        {
		            System.out.print(a[j]+".");
		        }
		    }
		    
		    System.out.println();
		}
	}
}
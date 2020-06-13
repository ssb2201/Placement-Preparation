/*
Permutations of a given string 
Given a string S. The task is to print all permutations of a given string.

Input:
The first line of input contains an integer T, denoting the number of test cases. Each test case contains a single string S in capital letter.

Output:
For each test case, print all permutations of a given string S with single space and all permutations should be in lexicographically increasing order.

Constraints:
1 ≤ T ≤ 10
1 ≤ size of string ≤ 5

Example:
Input:
2
ABC
ABSG

Output:
ABC ACB BAC BCA CAB CBA 
ABGS ABSG AGBS AGSB ASBG ASGB BAGS BASG BGAS BGSA BSAG BSGA GABS GASB GBAS GBSA GSAB GSBA SABG SAGB SBAG SBGA SGAB SGBA

Explanation:
Testcase 1: Given string ABC has permutations in 6 forms as ABC, ACB, BAC, BCA, CAB and CBA .
*/


//solution 1

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
		    printPermutation(s,"");
		    System.out.println();
		}
	}
	
	public static void printPermutation(String ques,String ans)
	{
	    if(ques.length()==0)
	    {
	        System.out.print(ans+" ");
	        return;
	    }
	    
	    
	    for(int i=0;i<ques.length();i++)
	    {
	        char ch = ques.charAt(i);
	        String roq = ques.substring(0,i)+ques.substring(i+1);
	        
	        printPermutation(roq,ans+ch);
	    }
	}
}



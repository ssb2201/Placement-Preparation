/*
Given N non-negative integers a_1, a_2, ..., a_n  where each represents a point at coordinate  (i, a_i) . N vertical lines are drawn such that the two endpoints of line i is at  (i, a_i)  and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.

Input: 
The first line of input contains an integer T denoting the number of test cases. Each test case contains an integer N followed by N space separated integers.

Output:
For each test case, the output is the integer denoting the maximum area of water that can be contained ( maximum area instead of maximum volume as working with 2D)

Constraints:
1 <= T <= 100
2 <= N <= 50
1 <= A[] <= 100

Example:
Input:
2
4
1 5 4 3 
5
3 1 2 4 5
Output:
6
12

Explanation:
1. 5 and 3 are distance 2 apart. So the size of the base = 2. Height of container = min(5, 3) = 3. So total area = 3 * 2 = 6.
2. 5 and 3 are distance 4 apart. So the size of the base = 4. Height of container = min(5, 3) = 3. So total area = 4 * 3 = 12.
*/

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		    int n = sc.nextInt();
		    int[] a = new int[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i] = sc.nextInt();
		    }
		    
		   int l=0;
		   int r = n-1;
		   int area =0;
		   while(l<r)
		   {
		       area = Math.max(area,Math.min(a[l],a[r])*(r-l));
		   
		       
		       if(a[l]<a[r])
		       {
		           l++;
		       }
		       else
		       {
		           r--;
		       }
		   }
		   System.out.println(area);
		}
	}
	
	
}
/*
Square root
Given an integer x. The task is to find the square root of x. If x is not a perfect square, then return floor(√x).

Input:
First line of input contains number of testcases T. For each testcase, the only line contains the number x.

Output:
For each testcase, print square root of given integer.

User Task:
The task is to complete the function floorSqrt() which should return the square root of given number x.

Constraints:
1 ≤ T ≤ 1000
1 ≤ x ≤ 107

Example:
Input:
2
5
4
Output:
2
2

Explanation:
Testcase 1: Since, 5 is not perfect square, so floor of square_root of 5 is 2.
Testcase 2: Since, 4 is a perfect square, so its square root is 2.
*/

class SquareRoot
{
     long floorSqrt(long x)
	 {
		// Your code here
		long lo =0;
		long hi =x;
		long ans=0;
		while(lo<=hi)
		{
		   long mid = (lo+hi)/2;
		   long a =(mid*mid);
		   if(a==x)
		   {
		       ans = (long)mid;
		       break;
		   }
		   else if(a>x)
		   {
		       hi=mid-1;
		   }
		   else
		   {
		       lo=mid+1;
		       ans=mid;
		   }
		}
		
		return ans;
		
	 }
}
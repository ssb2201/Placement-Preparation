/*
Longest consecutive subsequence 
Given an array of positive integers. Find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order.

Input:
The first line of input contains T, number of test cases. First line of line each test case contains a single integer N.
Next line contains N space separated values of the array.

Output:
Print the output of each test case in a seprate line.

Your Task:
You don't need to read input or print anything. Your task is to complete the function findLongestConseqSubseq() which takes the array arr[] and the size of the array as inputs and returns the length of the longest subsequence of consecutive integers. 

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).

Constraints:
1 <= T <= 100
1 <= N <= 105
0 <= a[i] <= 105

Example:
Input:
2
7
2 6 1 9 4 5 3
7
1 9 3 10 4 20 2
Output:
6
4

Explanation:
Testcase 1:  The consecutive numbers here are 1, 2, 3, 4, 5, 6. These 6 numbers form the longest consecutive subsquence.
*/

class Subseq
{   
    // arr[] : the input array
    // N : size of the array arr[]
    
    // return the length of the longest subsequene of consecutive integers
	static int findLongestConseqSubseq(int arr[], int N)
	{
	   // add your code here
	   
	   HashSet<Integer> s = new HashSet<>();
	   int ans =0;
	   for(int k=0;k<N;k++)
	   {
	       s.add(arr[k]);
	   }    
	       for(int i=0;i<N;i++)
	       {
	           if(!s.contains(arr[i]-1))
	           {
	               int j = arr[i];
	               while(s.contains(j))
	               {
	                   j++;
	               }
	               
	               if(ans < j-arr[i])
	               {
	                   ans = j-arr[i];
	               }
	           }
	           
	       }
	  
	   return ans;
	}
}
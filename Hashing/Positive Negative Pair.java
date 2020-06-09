/*
Given an array of distinct integers, find all the pairs having negative and positive value of a number that exists in the array.

Input:
First line of input contains number of testcases T. For each testcase, first line contains an integer N, number of elements in the array. Next line contains N space separated array elements.

Output:
Print the pairs of negative and positive that have the same absolute value in order of their occurrences. Print 0 if no such pair exists.

Your Task:
Complete the function findPairs() which takes the array A[] and the size of the array, N, as input parameters and returns an array of integers. 
Elements in the array should contain the pairs according to order of their occurrence. Within the pair the negative integer should appear before positive integer. Return empty integer list if no such pair exists.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)

Constraints:
1 <= T <= 50
1 <= N <= 106
-106 <= arr[i] <= 106

Example:
Sample Input:
2
8
1 3 6 -2 -1 -3 2 7
3
3 2 1

Sample Output:
-1 1 -3 3 -2 2
0

Explanation:
Testcase 1: 1, 3 and 2 are present pairwirse postive and negative. 6 and 7 have no pair.
Testcase 2: No such pair exists so the output is 0.
*/

class Sol
{
    public static ArrayList<Integer>findPairs(int arr[], int n) 
    { 
    	// code here.
    	ArrayList<Integer> a = new ArrayList<>();
    	HashMap<Integer,Integer> hm = new HashMap<>();
    	
    	for(int i=0;i<n;i++)
    	{
    	    if(hm.containsKey(Math.abs(arr[i])))
    	    {
    	        a.add(-Math.abs(arr[i]));
    	        a.add(Math.abs(arr[i]));
    	    }
    	    else
    	    {
    	        hm.put(Math.abs(arr[i]),0);
    	    }
    	}
    	
    	return a;
    	
    }
}
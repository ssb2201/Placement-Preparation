/*
Max distance between same elements 
Given an array with repeated elements, the task is to find the maximum distance between two occurrences of an element.


Input:

The first line of input will contain no of test cases T . Then T test cases follow . Each test case contains 2 lines. The first line of each test case contains an integer N denoting the number of elements in the array, the next line contains N space separated integer's.


Output:

For each test case in new line print the Maximum distance between two occurrences of an element


Constraints:

1<=T<=100

1<=N<=1000


Example:

Input

2
6
1 1 2 2 2 1
12
3 2 1 2 1 4 5 8 6 7 4 2

Output

5
10

Explanation

Test case 1: 
arr[] = {1, 1, 2, 2, 2, 1}
Max Distance: 5
Distance for 1 is: 5-0 = 5
Distance for 2 is : 4-2 = 2
Max Distance 5

Test case 2:
arr[] = {3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2}
Max Distance 10
maximum distance for 2 is 11-1 = 10
maximum distance for 1 is 4-2 = 2
maximum distance for 4 is 10-5 = 5
*/

class GfG
{
    int maxDistance(int arr[], int n)
    {
	// Your code here
	    HashMap<Integer,Integer> hm = new HashMap<>();
	    
	    int max_dist=0;
	    for(int i=0;i<n;i++)
	    {
	        if(!hm.containsKey(arr[i]))
	        {
	            hm.put(arr[i],i);
	        }
	        else
	        {
	            max_dist = Math.max(max_dist,i-hm.get(arr[i]));
	        }
	    }
	    
	    return max_dist;
    }
}

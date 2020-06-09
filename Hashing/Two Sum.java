/*
Two Sum 
Given an array of positive integers and an integer. Determine whether or not there exist two elements in A whose sum is exactly equal to that integer.

Input:
The first line of input contains an integer T denoting the number of test cases. The first line of each test case contains N denoting the size of array and X denoting the given number. The second line of each test case contains N space separated integers as array input.

Output:
Print "Yes" if there exist two elements in A whose sum is exactly X, else "No" (without quotes).

Your Task :
You don't need to read input or print anything. Your task is to complete the boolean function keypair() which takes the array A[], the size of the array (N) and another number (X) as inputs and returns true if there exists a pair in A[] that sums up to X and returns false otherwise.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 105
1 ≤ A[i] ≤ 105
1 ≤ X ≤ 2*105

Example:
Input:
2
6 16
1 4 45 6 10 8
5 10
1 2 4 3 6
Output:
Yes
Yes

Explanation:
Testcases 1: 10 and 6 are numbers making a pair whose sum is equal to 16.
*/
class Solution {
    // A[] : the input array of positive integers
    // N : size of the array arr[]
    // X : the required sum
    public boolean keypair(int[] A, int N, int X) {
        // code here
        HashSet<Integer> s = new HashSet<Integer>();
        for(int i=0;i<N;i++)
        {
            int temp= X - A[i];
            
            
            if(s.contains(temp))
            {
                return true;
            }
            s.add(A[i]);
        }
        
        return false;
    }
}
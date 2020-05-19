/*
Missing number in array
Given an array of size N-1 such that it can only contain distinct integers in the range of 1 to N. Find the missing element.

Input:
The first line of input contains an integer T denoting the number of test cases. For each test case first line contains N denoting the size of the array. The subsequent line contains N-1 space separated array elements.

Output:
Print the missing number.

Your Task :
Complete the function MissingNumber() that takes array and N as input and returns the value of the missing number.

Constraints:
1 ≤ T ≤ 200
1 ≤ N ≤ 106
1 ≤ array[i] ≤ 106

Example:
Input:
2
5
1 2 3 5
10
1 2 3 4 5 6 7 8 10

Output:
4
9

Explanation:
Testcase 1: Given array : 1 2 3 5. Missing element is 4.
*/

class Solution {
    int MissingNumber(int array[], int n) {
        // Your Code Here
        int x1=array[0];
        int x2=1;
        
        for(int i=1;i<n-1;i++)
        {
            x1=x1 ^ array[i];
        }
        
        for(int i=2;i<=n;i++)
        {
            x2=x2 ^ i;
        }
        
        return x1 ^ x2;
    }
}
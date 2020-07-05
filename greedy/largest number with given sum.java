/*
Largest number with given sum 
A boy lost the password of his super locker. He remembers the number of digits N as well as the sum S of all the digits of his password. He know that his password is the largest number of N digits that can be possible with given sum S. As he is busy doing his homework, help him retrieving his password.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. The first line of each test case contains two space separated integers N and S, where N is the number of digits in password and S is the sum of all the digits of the password.

Output:
Corresponding to each test case, in a new line, print the largest integer if possible , else print -1.

Your Task : Complete the function largestnumber() that returns  the largest possible strings as answer.

Constraints:
1 <= T <= 100
1 <= N <= 104
0 <= S <= 106

Expected Time Complexity : O(N)
Expected Auxilliary Space : O(1)

Example:
Input:
3
5 12
3 29
3 26

Output:
93000
-1
998

Explanation :
Testcase 1: Sum of elements is 12. Largest possible 5 digit number is 93000.
Testcase 2: There is no such three digit number whose sum is 29.
*/

class Solution
{
    // Function to return Largest Number
    static String largestNumber(int n, int sum)
    {
        // add your code here
        if(sum>9*n)
        {
            return "-1";
        }
        else
        {
        int i=0;
        String ans="";
        while(i<n)
        {
            if(sum!=0)
            {
                int a = sum>9?9:sum;
            
                ans=ans+a;
                sum=sum-a;
            
            }
            else
            {
                ans=ans+0;
            }
            i++;
        }
            return ans;
        }
    }
}


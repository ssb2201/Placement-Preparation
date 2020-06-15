/*
Longest Common Subsequence 
Given two sequences, find the length of longest subsequence present in both of them. Both the strings are of uppercase.

Input:
First line of the input contains no of test cases  T,the T test cases follow.
Each test case consist of 2 space separated integers A and B denoting the size of string str1 and str2 respectively
The next two lines contains the 2 string str1 and str2 .

Output:
For each test case print the length of the longest common subsequence of the two strings .

Expected Time Complexity : O(N*N)
Expected Auxiliary Space: O(N*N)

Constraints:
1<=T<=200
1<=size(str1),size(str2)<=100

Example:
Input:
2
6 6
ABCDGH
AEDFHR
3 2
ABC
AC
Output:
3
2
Explanation
LCS for input Sequences “ABCDGH” and “AEDFHR” is “ADH” of length 3.

LCS of "ABC" and "AC" is "AC" of length 2.
*/
class LCS{
    
    // function to find LCS
    static int lcs(int p, int q, String s1, String s2){
        // your code here
        int[][] strg = new int[s1.length()+1][s2.length()+1];
    
    strg[s1.length()][s2.length()]=0;
    
    for(int i=s1.length();i>=0;i--)
    {
        for(int j=s2.length();j>=0;j--)
        {
            if(i==s1.length() || j==s2.length())
            {
                strg[i][j]=0;
                continue;
            }
            
            if(s1.charAt(i)==s2.charAt(j))
            {
                strg[i][j] = 1+ strg[i+1][j+1];
            }
            
            else
            {
                strg[i][j]= Math.max(strg[i][j+1],strg[i+1][j]);
            }
            
        }
    }
    return strg[0][0];
        
        
    }
    
}
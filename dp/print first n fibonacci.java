/*Print first n Fibonacci Numbers 
Given a number N, print the first N fibonacci numbers.

Input Format:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. The first line of each test case contains the integer N.

Output Format:
For each testcase, in a new line, print the first n fibonacci numbers.

Your Task:
Complete printFibb function and print the first n fibonacci numbers with a space between each number in the function itself. The new line is provided by the driver code.

Constraints:
1<= T <=100
1<= N <=84

Example:
Input:
2
7
5

Output:
1 1 2 3 5 8 13
1 1 2 3 5

Explanation:
Testcase1: The first 7 fibonacci numbers are printed.
Testcase2: The first 5 fibonacci numbers are printed.

*/

public static void printFibb(int n) 
{
    //Your code here
    long[] strg = new long[n+1];
    
    strg[0] =0;
    strg[1]=1;
    
    for(int i=2;i<=n;i++)
    {
        strg[i] = strg[i-1]+strg[i-2];
    }
    
    for(int i=1;i<=n;i++)
    {
        System.out.print(strg[i]+" ");
    }
}
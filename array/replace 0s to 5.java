/*
Replace all 0's with 5
You are given an integer N. You need to convert all zeroes of N to 5.

Input Format:
The first line of input contains an integer T denoting the number of test cases . Then T test cases follow . Each test case contains a single integer N denoting the number.

Output Format:
For each test case, there will be a new line containing an integer where all zero's are converted to 5.

Your Task:
Your task is to complete the function convertFive() which takes an integer N as an argument and replaces all zeros in the number N with 5. Your function should return the converted number.

Constraints:
1 <= T <= 100
1 <= n <= 10000

Example:
Input
2
1004
121
Ouput
1554
121
Explanation:
Test Case 1: There are two zeroes in "1004", on replacing all zeroes with 5, the new number will be 1554.


*/

class GfG {
    int convertfive(int num) {
        // Your code here
        if(num==0)
        {
            return 5;
        }
        
        else 
        {
            return convert(num);
        }
    }
    
    int convert(int num)
    {
        if(num==0)
        {
            return 0;
        }
        int digit = num%10;
        if(digit==0)
        {
            digit =5;
        }
        return convert(num/10)*10+digit;
    }
}
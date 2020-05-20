/*
Find duplicates in an array
Given an array a[] of size n which contains elements from 0 to n-1, your task is to complete the function printDuplicates which prints the duplicate elements of the given array. If no duplicate element is found print -1.

Note: Auxiliary Space must be O(1) and Time complexity must be O(n).

Input:
The first line of input contains an integer T denoting the no of test cases. Then T test cases follow. Each test case contains an integer n which denotes number of elements of Array. Second line of each test case contains n space separated integers denoting elements of array a[].

Output:
Print the duplicate elements from the given array.The order of the output should be in sorted order.


Your Task:
Your task is to complete the function printDuplicates(), which takes array a[] and n as input as parameter. New line is automatically added by the driver code.


Constraints:
1<=T<=100
1<=N<=105
0<=A[i]<=N-1, for each valid i

Example:
Input:
2
4
0 3 1 2
5
2 3 1 2 3 
Output:
-1
2 3 
*/
class GfG {
    public static void printDuplicates(int arr[], int n) {
       // add code here.
       int flag=0;
       for(int i=0;i<n;i++)
       {
           arr[arr[i]%n]+=n;
       }
       for(int i=0;i<n;i++)
       {
           if(arr[i]>=n*2)
           {
               System.out.print(i+" ");
               flag=1;
           }
       }
       if(flag==0)
       {
           System.out.print(-1);
       }
   }
}
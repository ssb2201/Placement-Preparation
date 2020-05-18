/*
Third largest element
Given an array of distinct elements. Your task is to find the third largest element in it. You have to complete the function thirdLargest which takes two argument. The first argument is the array a[] and the second argument is the size of the array (n). The function returns an integer denoting the third largest element in the array a[]. The function should return -1 if there are less than 3 elements in input.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. The first line of each test case is N, size of array. The second line of each test case contains N space separated values of the array a[].

Output:
Output for each test case will be the third-largest element of the array.

Your Task:
You don't need to read input or print anything. Your task is to complete the function thirdLargest() with accepts the array and number of elements as arguments and returns the third largest element of the array.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 105
1 ≤ A[i] ≤ 105

Example(To be used for only expected output):
Input:
2
5
2 4 1 3 5
2
10 2
Output:
3
-1

*/
Code:

long long thirdLargest(long long a[], long long n)
{
     //Your code here
     
     if(n<3)
     {
         return -1;
     }
     else
     {
         int i=0;
         int l =0;
         int l2 =0;
         int l3=0;
         
         while(i<n)
         {
             if(a[i]>l)
             {
                 l3=l2;
                 l2=l;
                 l=a[i];
             }
             
             else if(a[i]>l2)
             {
                 l3=l2;
                 l2=a[i];
             }
             
             else if(a[i]>l3)
             {
                 l3=a[i];
             }
             i++;
         }
         
         return l3;
     }
}
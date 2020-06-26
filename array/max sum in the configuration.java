/*
Max sum in the configuration 
Given an array(0-based indexing), you have to find the max sum of i*A[i] where A[i] is the element at index i in the array. The only operation allowed is to rotate(clock-wise or counter clock-wise) the array any number of times.

Input:
The first line of input is the number of test cases T. Then T test cases follow. The first line of each test case is an integer N denoting the size of the array. Then in the next line are N space separated values of the array A [ ]. 

Output:
For each test case, the output will be the required max sum in a new line.

User Task:
 Your task is to complete the function max_sum which takes two arguments which is the array A [ ] and its size and returns an integer value denoting the required max sum.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1<=T<=1000
1<=N<=104
1<=A[]<1000

Example:
Input
1
4
8 3 1 2
Output
29

Explanation
Above the configuration possible by rotating elements are
3 1 2 8 here sum is 3*0+1*1+2*2+8*3 = 29
1 2 8 3 here sum is 1*0+2*1+8*2+3*3 = 27
2 8 3 1 here sum is 2*0+8*1+3*2+1*3 = 17
8 3 1 2 here sum is 8*0+3*1+1*2+2*3 =  11
Here the max sum is 29 
*/

class GfG
{
    int max_sum(int A[], int n)
    {
	// Your code here
	    int sum_max=Integer.MIN_VALUE;
	    for(int i=0;i<n;i++)
	    {
	        int sum = rotate(A,i);
	        sum_max= Math.max(sum_max,sum);
	    }
	    
	    return sum_max;
    }
    
    
    int rotate(int A[],int d)
    {
        int[] a = new int[A.length];
        int k=0;
        for(int i=d;i<A.length;i++)
        {
            a[k]=A[i];
            k++;
        }
        
        for(int i=0;i<d;i++)
        {
            a[k]=A[i];
            k++;
        }
        int sum=0;
        for(int i=0;i<A.length;i++)
        {
          //  System.out.print(a[i]);
            sum+=(i*a[i]);
        }
        
        return sum;
    }
}

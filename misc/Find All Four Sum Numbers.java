/*
Find All Four Sum Numbers 
Given an array of integers and another number. Find all the unique quadruple from the given array that sums up to the given number.

Input:
The first line of input contains an integer T denoting the no of test cases. Then T test cases follow. Each test case contains two lines. The first line of input contains two integers N and K. Then in the next line are N space-separated values of the array.

Output:
For each test case in a new line print, all the quadruples present in the array separated by space which sums up to the value of K. Each quadruple is unique which are separated by a delimiter "$" and are in increasing order.

Your Task:
You don't need to read input or print anything. Your task is to complete the function fourSum() which takes the array arr[] and the integer k as its input and returns an array containing all the quadruples in a lexicographical manner. Also note that all the quadruples should be internally sorted, ie for any quadruple [q1, q2, q3, q4] the following should follow: q1 <= q2 <= q3 <= q4. 

Expected Time Complexity: O(N3).
Expected Auxiliary Space: O(N2).

Constraints:
1 <= T <= 100
1 <= N <= 100
-1000 <= K <= 1000
-100 <= A[] <= 100

Example:
Input:
2
5 3
0 0 2 1 1 
7 23
10 2 3 4 5 7 8
Output:
0 0 1 2 $
2 3 8 10 $2 4 7 10 $3 5 7 8 $
Explanation:
Test Case 1: Sum of 0, 0, 1, 2 is equal to K.
Test Case 2: Sum of 2, 3, 8, 10 = 23, sum of 2, 4, 7, 10 = 23 and sum of 3, 5, 7, 8 = 23.
*/
class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        // code here
       ArrayList<ArrayList<Integer>> aa=new ArrayList<>();
        ArrayList<Integer> a=new ArrayList<>();
        HashSet<ArrayList<Integer>> h = new HashSet<>();
        Arrays.sort(arr);
        int left,right;
        int n=arr.length;
        for(int i=0;i<n-3;i++)
        {
       
            for(int j=i+1;j<n-2;j++)
            {
        
                left=j+1;
                right=n-1;
                while(left<right){
                if(arr[i]+arr[j]+arr[left]+arr[right]==k)
                {
                    a=new ArrayList<>();
                    a.add(arr[i]);
                    a.add(arr[j]);
                    a.add(arr[left]);
                    a.add(arr[right]);
                    if(!h.contains(a))
                    {
                         aa.add(a);
                         h.add(a);
                    }
                   
                    left++;
                    right--;
 
                }
                else if(arr[i]+arr[j]+arr[left]+arr[right]<k)
                    left++;
                else
                    right--;
                }
            }
        }
        return aa;
    }
}
/*
Given an array of integers and a number K. Find the count of distinct elements in every window of size K in the array.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains two integers N and K. Then in the next line are N space separated values of the array A[].

Output:
For each test case in a new line print the space separated values denoting counts of distinct numbers in all windows of size k in the array A[].

Your Task:
You don't need to read input or print anything. Your task is to complete the function countDistinct() which takes the array A[], the size of the array(N) and the window size(K) as inputs and returns an array containing the count of distinct elements in every contiguous window of size K in the array A[].

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).

Constraints:
1 <= T <= 100
1 <= N <= K <= 105
1 <= A[i] <= 105 , for each valid i

Example:
Sample Input:
2
7 4
1 2 1 3 4 2 3
3 2
4 1 1

Sample Output:
3 4 4 3
2 1

Explanation:
Testcase 1 : 
Window 1 of size k = 4 is 1 2 1 3. Number of distinct elements in this window are 3. 
Window 2 of size k = 4 is 2 1 3 4. Number of distinct elements in this window are 4.
Window 3 of size k = 4 is 1 3 4 2. Number of distinct elements in this window are 4.
Window 4 of size k = 4 is 3 4 2 3. Number of distinct elements in this window are 3.
*/

class Solution {
    ArrayList<Integer> countDistinct(int A[], int n, int k) {
        // code here 
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        ArrayList<Integer> arr = new ArrayList<>();
        int dis_count =0;
        
        for(int i=0;i<k;i++)
        {
            if(hm.get(A[i])==null)
            {
                hm.put(A[i],1);
                dis_count++;
            }
            else
            {
                int count = hm.get(A[i]);
                hm.put(A[i],count+1);
            }
        }
        arr.add(dis_count);
        
        for(int i=k;i<n;i++)
        {
            if(hm.get(A[i-k])==1)
            {
                hm.remove(A[i-k]);
                dis_count--;
            }
            else
            {
                int count = hm.get(A[i-k]);
                hm.put(A[i-k],count-1);
            }
            
            if(hm.get(A[i])==null)
            {
                hm.put(A[i],1);
                dis_count++;
            }
            else
            {
                int count = hm.get(A[i]);
                hm.put(A[i],count+1);
            }
            arr.add(dis_count);
        }
        
        return arr;
        
        
    }
}


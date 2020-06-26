Mountain Subarray Problem 
We are given an array of integers and a range, we need to find whether the subarray which falls in this range has values in the form of a mountain or not. All values of the subarray are said to be in the form of a mountain if either all values are increasing or decreasing or first increasing and then decreasing. More formally a subarray [a1, a2, a3 … aN] is said to be in form of a mountain if there exists an integer K, 1 <= K <= N such that,
a1 <= a2 <= a3 .. <= aK >= a(K+1) >= a(K+2) …. >= aN
You have to process Q queries. In each query you are given two integer L and R, denoting starting and last index of the subarrays respectively.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains an integer N denoting the size of the array. The following line contains N space-separated integers forming the array. Next line contains an integer Q, denoting the number of queries. For each query, you are given two space-separated integers L and R in a new line. 

Output:
For each query, print "Yes" (without quotes) if the subarray is in mountain form, otherwise print "No" (without quotes) in a new line.

Expected Time Complexity: O(N + Q).
Expected Auxiliary Space: O(N).

Constraints:
1 <= T <= 100
1 <= N, Q <= 105
1 <= a[i] <= 106, for each valid i
0 <= L <= R <= N-1

Example:
Input:
1
8
2 3 2 4 4 6 3 2
2
0 2
1 3

Output:
Yes
No

Explanation:
For L = 0 and R = 2, a0 = 2, a1 = 3 and a2 = 2, since they are in the valid order,answer is Yes.
For L = 1 and R = 3, a1 = 3, a2 = 2 and a3 = 4, since a1 > a2 and a2 < a4 the order isn't valid, hence the answer is No.

/*

class Solution {
    public ArrayList<Boolean> processQueries(int[] a, int n, ArrayList<Pair> queries,
                                      int q) {
        // code here
        ArrayList<Boolean> b = new ArrayList<>();
        for(int t=0;t<q;t++)
        {
            int flag=0;
            for(int i=queries.get(t).l;i<queries.get(t).r;i++)
            {
                if(a[i]<a[i+1])
                {
                    if(flag==1)
                    {
                        flag++;
                        break;
                    }
                }
                else if(a[i]>a[i+1])
                {
                    flag=1;
                }
            }
       //     System.out.println(flag);
            if(flag==0 || flag==1)
            {
                b.add(true);
            }
            else
            {
                b.add(false);
            }
        }
        return b;
        
    }
}
*/
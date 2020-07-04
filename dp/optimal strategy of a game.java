class solve{
    static long countMaximum(int arr[], int n){
        // Your code here
        
        int[][] dp = new int[n][n];
        
        for(int i=0;i<n-1;i++)
        {
            dp[i][i+1] = Math.max(arr[i],arr[i+1]);
        }
        
        for(int gap=3;gap<n;gap=gap+2)
        {
            for(int i=0;i+gap<n;i++)
            {
                int j=i+gap;
                 dp[i][j] = Math.max(arr[i]+Math.min(dp[i+1][j-1],dp[i+2][j]),arr[j]+Math.min(dp[i+1][j-1],dp[i][j-2]));
            }
        }
        
        return dp[0][n-1];
    }
}
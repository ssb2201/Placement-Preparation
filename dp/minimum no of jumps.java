class DynamicProgramming{
    
    // function to find minimum number of jumps to reach end of the array
    public static int minimumJumps(int arr[], int n){
        // your code here(
        int[] dp = new int[n];
        dp[0]=0;
        
        for(int i=1;i<n;i++)
        {
            dp[i] =Integer.MAX_VALUE;
        }
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(arr[j]+j>=i)
                {
                    if(dp[j]!=Integer.MAX_VALUE)
                    {
                        dp[i] = Math.min(dp[i],dp[j]+1);
                    }
                }
            }
        }
        
        if(dp[n-1]!=Integer.MAX_VALUE)
        {
            return dp[n-1];
        }
        else
        {
            return -1;
        }
    }
}

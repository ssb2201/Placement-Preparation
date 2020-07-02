class Geeks
{
    //Complete this function
    public long minimumNumberOfCoins(int coins[],int n,int value)
    {
        // your code here
        int[] dp = new int[value+1];
        
        dp[0]=0;
        
        for(int i=1;i<=value;i++)
        {
            dp[i] = Integer.MAX_VALUE;
        }
        
        for(int i=1;i<=value;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(coins[j]<=i)
                {
                    int sub_res = dp[i-coins[j]];
                    if(sub_res!=Integer.MAX_VALUE)
                    {
                        dp[i]=Math.min(dp[i],sub_res+1);
                    }
                }
            }
        }
        
        if(dp[value]!=Integer.MAX_VALUE)
        {
            return dp[value];
        }
        else
        {
            return -1;
        }
    }
}
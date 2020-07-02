lass Solution { 
    // return length of longest strictly increasing subsequence
    static int longestSubsequence(int n, int a[]){
        // code here
        int[] tail=new int[n];
        tail[0]=a[0];
        int len=1;
        for(int i=1;i<n;i++)
        {
            if(a[i]>tail[len-1])
            {
                tail[len] = a[i];
                len++;
            }
            else
            {
                int c = ceil(tail,0,len-1,a[i]);
                tail[c] =a[i];
            }
        }
        
        return len;
     }
     
     static int ceil(int[] tail,int l,int r,int x)
     {
         while(r>l)
         {
             int m = l+(r-l)/2;
             
             if(tail[m]>=x)
             {
                 r=m;
             }
             else
             {
                 l=m+1;
             }
         }
         return r;
     }
} 
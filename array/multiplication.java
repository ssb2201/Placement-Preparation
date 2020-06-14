
class Multiplication
{
    //Complete this function
    static void multiplyMatrix(int n1, int m1, int n2, int m2, int arr1[][], int arr2[][])
    {
        //Your code here
        
        if(m1==n2)
        {
            int[][] res = new int[n1][m2];
            
            for(int i=0;i<n1;i++)
            {
                for(int j=0;j<m2;j++)
                {
                    res[i][j]=0;
                    for(int k=0;k<m1;k++)
                    {
                        res[i][j] = res[i][j]+(arr1[i][k]*arr2[k][j]);
                    }
                }
            }
            for(int i=0;i<n1;i++)
            {
                for(int j=0;j<m2;j++)
                {
                    System.out.print(res[i][j]+" ");
                }
            }
        }
        else
        {
            System.out.print(-1);
        }
        
     
        
    }
}
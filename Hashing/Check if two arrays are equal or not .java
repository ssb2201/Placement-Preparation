/*


*/

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    int t = sc.nextInt();
		    long[] a = new long[t];
		    long[] b = new long[t];
		    for(int j=0;j<t;j++)
		    {
		        a[j]= sc.nextLong();
		    }
		    for(int j=0;j<t;j++)
		    {
		        b[j]= sc.nextLong();
		    }
		    
		    HashMap<Long,Integer> hm = new HashMap<>();
		    int count =0;
		   for(int j=0;j<t;j++)
		   {
		       if(hm.containsKey(a[j]))
		       {
		           count = hm.get(a[j]);
		           count++;
		           hm.put(a[j],count);
		       }
		       else
		       {
		           hm.put(a[j],1);
		       }
		   }
		   Boolean f =true;
		   for(int j=0;j<t;j++)
		   {
		       if(!hm.containsKey(b[j]))
		       {
		           f=false;
		           break;
		       }
		       
		       if(hm.get(b[j])==0)
		       {
		           f=false;
		           break;
		       }
		    
		       count = hm.get(b[j]);
		       count --;
		       hm.put(b[j],count);
		       
		   }
		   if(f)
		   {
		       System.out.println(1);
		   }
		   else
		   {
		       System.out.println(0);
		   }
		}
	}
}
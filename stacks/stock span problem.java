/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0)
		{
		    int n = sc.nextInt();
		    int[] a = new int[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i] = sc.nextInt();
		    }
		    
		    Stack<Integer> st = new Stack<>();
		    ArrayList<Integer> al = new ArrayList<>();
		    
		    for(int i=0;i<n;i++)
		    {
		        if(st.isEmpty())
		        {
		            al.add(-1);
		        }
		        else if(a[st.peek()]>a[i])
		        {
		            al.add(st.peek());
		        }
		        else if(a[st.peek()]<=a[i])
		        {
		            while(!st.isEmpty() && a[st.peek()]<=a[i])
		            {
		                st.pop();
		            }
		            if(st.isEmpty())
		            {
		                al.add(-1);
		            }
		            else
		            {
		                al.add(st.peek());
		            }
		        }
		        st.push(i);
		    }
		    for(int i=0;i<al.size();i++)
		    {
		        System.out.print((i-al.get(i))+" ");
		    }
		    System.out.println();
		}
		
		
		
	}
}
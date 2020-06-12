/*
Parenthesis Checker 
Given an expression string exp. Examine whether the pairs and the orders of “{“,”}”,”(“,”)”,”[“,”]” are correct in exp.
For example, the program should print 'balanced' for exp = “[()]{}{[()()]()}” and 'not balanced' for exp = “[(])”

Input:
The first line of input contains an integer T denoting the number of test cases.  Each test case consists of a string of expression, in a separate line.

Output:
Print 'balanced' without quotes if the pair of parenthesis is balanced else print 'not balanced' in a separate line.

Constraints:
1 ≤ T ≤ 100
1 ≤ |s| ≤ 105

Example:
Input:
3
{([])}
()
([]

Output:
balanced
balanced
not balanced
*/s
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
	    Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<t;i++)
		{
		    String s = sc.nextLine();
		    Boolean ans = ispar(s);
		   
		    if(ans)
		    {
		        System.out.println("balanced");
		    }
		    else
		    {
		         System.out.println("not balanced");
		    }
		    
		}
	}
	public static boolean ispar(String x)
    {
        // add your code here
        
        int n = x.length();
        Stack<Character> stack = new Stack<>();
        
        char[] c = x.toCharArray();
        int flag=0;
     
        for(int i=0;i<n;i++)
        {
            if(c[i] =='{' || c[i]=='(' || c[i]=='[')
            {
                stack.push(c[i]);
            }
            else if(!stack.isEmpty())
            {
                if(c[i]=='}')
                {
                
                    if(stack.peek()=='{')
                    {
                    
                        stack.pop();
                    }
                
                    else 
                    {
                        flag=1;
                        break;
                    }
                }
                else if(c[i]==')')
                {
                    if(stack.peek()=='(')
                    {
                    
                        stack.pop();
                    }
                    else 
                    {
                         flag=1;
                        break;
                    
                    }
                }
                else if(c[i]==']')
                {
                    if(stack.peek()=='[')
                    {
                    
                        stack.pop();
                    }
                    else 
                    {
                        flag=1;
                        break;
                    }
                }
            }
            else
            {
                flag=1;
                break;
            }
        }
      
        if(flag==0 && stack.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
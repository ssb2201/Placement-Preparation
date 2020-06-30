	public static void reverse(Stack<Integer> s)
	{
	    if(!s.isEmpty())
	    {
	        int a = s.pop();
	        
	        reverse(s);
	        
	        insert(s,a);
	    }
	    
	}
	
	public static void insert(Stack<Integer> s,int a)
	{
	    if(s.isEmpty())
	    {
	        s.push(a);
	        return;
	    }
	    
	    int x = s.pop();
	    insert(s,a);
	    
	    s.push(x);
	}
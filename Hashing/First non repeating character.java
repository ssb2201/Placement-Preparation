/*
First Non Repeating Character 
Given a string S consisting of lowercase Latin Letters. Find the first non-repeating character in S.

Input:
The first line contains T denoting the number of test cases. Then follows the description of test cases.
For each test case, the first line of input contains a single integer N denoting the length of the string and the second line of each test case contains the string S.

Output:
For each test case, print the first non-repeating character in a new line. If there does not exist any non-repeating character then print -1.

Your Task:
You don't need to read input or print anything. Your task is to complete the function find() which takes the string S as its input and returns the first non-repeating character present in S or -1 if there is no non-repeating character. Since the return type is a string we first need to change the character into a string.

Expected Time Complexity: O(|S|).
Expected Auxiliary Space: O(|S|).

Constraints:
1 <= T <= 900
1 <= |S| <= 104

Example:
Input :
3
5  
hello
12
zxvczbtxyzvy
6
xxyyzz
Output :
h
c
-1

Explanation:
Test Case 1: 'h', 'e' and 'o' are the non-repeating characters out of which 'h' has the least index.
Test Case 2: 'c', 'b' and 't' are the non-repeating characters out of which 'c' has the least index.
Test Case 3: All the characters 'x', 'y' and 'z' are repeating. Hence the output is -1.
*/
class Sol
{
    // return the first non-repeating char in S.
    // if there's no non-repeating char, return "-1"
    public static String find(String S)
    {
        //code here.
        LinkedHashMap<Character,Integer> hm = new LinkedHashMap<>();
        char a=' ';
        
        for(int i=0;i<S.length();i++)
        {
            if(hm.containsKey(S.charAt(i)))
            {
                int count = hm.get(S.charAt(i));
                hm.put(S.charAt(i),count+1);
            }
            else
            {
                 hm.put(S.charAt(i),1);
            }
        }
        
        for(int i=0;i<S.length();i++)
        {
            int count = hm.get(S.charAt(i));
            if(count ==1)
            {
                a = S.charAt(i);
                return Character.toString(a);
            }
            
        }
        return "-1";
        
    }
    
}
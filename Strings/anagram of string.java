/*
Given two strings S1 and S2 in lowercase, the task is to make them anagram. The only allowed operation is to remove a character from any string. Find the minimum number of characters to be deleted to make both the strings anagram. Two strings are called anagram of each other if one of them can be converted into another by rearranging its letters.

Input Format:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case consists of 2 strings to make the anagrams.

Output Format:
For each testcase, in a new line, output the minimum number of characters to be deleted to make both the strings anagram.

Your Task:
Since this is a function problem, you don't need to take any input. Just complete the provided function.

Constraints:
1 <= T <= 100
1 <= |S1|, |S2| <= 105

Example:
Input:
2
bcadeh
hea
cddgk
gcd
Output:
3
2
*/

class GfG
{
	public int remAnagrams(String s,String s1)
        {
        //add code here.
            int[] count1 = new int[26];
            int[] count2 = new int[26];
            
            
            for(int i=0;i<s.length();i++)
            {
                count1[s.charAt(i)-'a']++;
            }
            
            for(int i=0;i<s1.length();i++)
            {
                count2[s1.charAt(i)-'a']++;
            }
            
            int result =0;
            for(int i=0;i<26;i++)
            {
                result+= Math.abs(count1[i]-count2[i]);
            }
            
            return result;
            
        
        }
}
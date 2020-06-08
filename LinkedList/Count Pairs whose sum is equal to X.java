/*
Count Pairs whose sum is equal to X 
Given two linked list of size N1 and N2 respectively of distinct elements, your task is to complete the function countPairs(), which returns the count of all pairs from both lists whose sum is equal to the given value X.

Input:
The function takes three arguments as input, reference pointer to the head of the two linked list (head1 and head2), and an variable X.
There will be T test cases and for each test case the function will be called separately.
Note : All elements in a linked list are unique.

Output:
For each test case the function should return the count of all the pairs from both lists whose sum is equal to the given value X. 

Constraints:
1<=T<=100
1<=N1,N2<=10000
1<=X<=10000

Example:
Input:
2
6
1 2 3 4 5 6
3
11 12 13
15
4
7 5 1 3
4
3 5 2 8
10

Output:
3
2
*/


class GfG {

    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2,
                          int x) {
        // add your code here
 
        int count =0;
        
        Collections.sort(head1);
        Collections.sort(head2,Collections.reverseOrder());
        Iterator<Integer> itr1 = head1.iterator();
        Iterator<Integer> itr2 = head2.iterator();
        
        Integer num1= itr1.hasNext() ? itr1.next():null;
        Integer num2= itr2.hasNext() ? itr2.next():null;
        
        while(num1!=null && num2!=null)
        {
            if((num1+num2)==x)
            {
                num1 = itr1.hasNext() ? itr1.next():null;
                num2 = itr2.hasNext() ? itr2.next():null;
                
                count++;
            }
            
            else if((num1+num2)>x)
            {
                num2 = itr2.hasNext() ? itr2.next():null;
            }
            
            else
            {
                num1 = itr1.hasNext() ? itr1.next():null;
            }
        
        }
        
        return count;
    }
}

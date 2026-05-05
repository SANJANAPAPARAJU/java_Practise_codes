//power of 2
Example 1:

Input: n = 1
Output: true
Explanation: 20 = 1

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0)
        return false;

        while(n!=1){
            if(n%2!=0)
            return false;
            n=n/2;
        }
        return true;
        
        
    }
}

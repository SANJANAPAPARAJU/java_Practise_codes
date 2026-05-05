//Input: num = 16
Output: true
Explanation: We return true because 4 * 4 = 16 and 4 is an integer.
//valid perfect square

class Solution {
    public boolean isPerfectSquare(int num) {
       for (int i = 1; i <= num / i; i++) {   //i=1;i*i<=num;i++
    if (i * i == num)
        return true;
}
return false;      
    }
}

//trailing zeros in factorial-“Trailing zeros = count of 5s in factorial”
class Solution {
    public int trailingZeroes(int n) {
        int count=0;
        while(n>0){
            n=n/5;
            count+=n;
        }
        return count;
        
    }
}



//explain
n = 25

25 / 5 = 5   → count = 5
5 / 5 = 1    → count = 6
1 / 5 = 0    → stop

Answer = 6

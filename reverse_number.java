class Solution {
    public int reverse(int x) {
        int rev=0;

        while(x!=0){
            int r=x%10; //123%10=3
             x=x/10;
            
if (rev > Integer.MAX_VALUE / 10 || 
               (rev == Integer.MAX_VALUE / 10 && r > 7)) return 0;  //edge case for overflow 

            if (rev < Integer.MIN_VALUE / 10 || 
               (rev == Integer.MIN_VALUE / 10 && r < -8)) return 0; //edge case for underflow

            rev=rev*10+r;
           

        }
        return rev;
        
    }
}

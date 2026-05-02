class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        return false;
        int org=x;
        int rev=0;
     
            while(x!=0){

        int r=x%10; //121=1
        rev=rev*10+r;
         x=x/10; //12
        
            }
            if(org==rev)
            return true;
            else
            return false;
        

    }
}

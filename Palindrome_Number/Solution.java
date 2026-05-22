class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        {
            return false;
        }
        long original=x;
        long reverse=0;
        while(original>0)
        {
            reverse=(reverse*10);
            reverse+=(original%10);
            original=original/10;

        }
        if(x==reverse)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
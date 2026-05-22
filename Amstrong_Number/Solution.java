// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int total=0;
        int original=n;
        while(n>0)
        {
            total+=Math.pow(n%10,3);
            n=n/10;
        }
        if(original==total)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
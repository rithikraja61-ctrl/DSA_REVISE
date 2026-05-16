class Solution {
    public int reverse(int x) {
        String s=String.valueOf(x);
        boolean negtive=false;
        if(s.charAt(0)=='-')
        {
            negtive=true;
            s=s.substring(1);
        }
        try
        {
            int num=Integer.parseInt(s);
            String ans="";
            while(num>0)
            {
                ans=ans+num%10;
                num=num/10;
            }

            if(negtive)
            {
                return -Integer.parseInt(ans);
            }
            return Integer.parseInt(ans);
        }
        catch(Exception e)
        {
            return 0;
        }
    }
}
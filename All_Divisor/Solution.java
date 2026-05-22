class Solution {
    public ArrayList<Integer> getDivisors(int n) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        int[] num=new int[(int)Math.sqrt(n)+1];
        for(int i=1;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                list.add(i);
                if(n/i!=i)
                {
                    num[i]=n/i;
                }
            }
        }
        for(int i=num.length-1;i>=0;i--)
        {
            if(num[i]!=0)
            {
                list.add(num[i]);
            }
        }
        return list;

    }
}
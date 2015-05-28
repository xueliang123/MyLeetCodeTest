/**
 * Created by xueliang on 15-3-25.
 */
public class SingleNumberII {
    public int singleNumber(int[] A) {
        /*
        element in A is 32bit,
        sum corresponding bits from all elements and mod each by 3 then should left the single number
        */
        int[] sum=new int[32];
        int res=0;
        for(int i=0;i<32;i++)
        {
            for(int j=0;j<A.length;j++)
            {
                sum[i]+=((A[j]>>>i)&1);//sum every bit of all numbers
            }
            sum[i]%=3;
            res+=((sum[i]&1)<<i);// recover the single number
        }
        return res;
    }
}

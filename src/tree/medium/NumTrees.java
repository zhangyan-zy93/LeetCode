package tree.medium;


/**
 * todo 数学，永远滴神，找机会了解下怎么推出来的，我先试着推但是不成功
 */
public class NumTrees {
    public int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        int  temp ;
        for (int i = 1;i<=n;i++){
            temp = 0;
            int k = 1;
            for (;k<=i/2;k++){
                temp += dp[k-1]*dp[i-k];
            }
            temp *= 2;
            if(i%2 == 1){
                temp += dp[k-1]*dp[k-1];
            }
            dp[i] = temp;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.printf(""+new NumTrees().numTrees(3));
    }
}

import java.util.Arrays;
class Solution{
    public int coinChange(int[] coins ,int amount ){
        int[] dp =new int [amount+1];
        Arrays.fill(dp,-1);
        int ans = solve(coins ,amount ,dp);
        return ans >= 100000 ? -1 :ans;

    }
     private int solve(int[] coins, int amount, int[] dp) {

        // Base Cases
        if (amount == 0)
            return 0;

        if (amount < 0)
            return 100000;

        // Already calculated
        if (dp[amount] != -1)
            return dp[amount];

        int minCoins = 100000;
        for(int coin : coins){
            int take=1+solve(coins,amount - coin ,dp);
            minCoins = Math.min(minCoins ,take);

        }
        return dp [amount]=minCoins;
    }
}

public class BestTimeToBuyAndSellStock {
	public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
        	return 0;
        }
        int lowest = prices[0];
        int res = 0;
        for (int i = 0; i < prices.length; i++) {
        	int tmp = 0;
        	if (prices[i] >= lowest) {
        		tmp = prices[i] - lowest;
        		if (tmp > res) {
        			res = tmp;
        		}
        	} else {
        		lowest = prices[i];
        	}
        }
        return res;
    }
}

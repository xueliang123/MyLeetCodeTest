
public class BestTimeToBuyAndSellStock {
	public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
        	return 0;
        }
        int lowest = prices[0];
        int res = 0;
		for (int price : prices) {
			int tmp;
			if (price >= lowest) {
				tmp = price - lowest;
				if (tmp > res) {
					res = tmp;
				}
			} else {
				lowest = price;
			}
		}
        return res;
    }
}

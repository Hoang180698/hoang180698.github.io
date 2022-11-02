public class _1672_RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int sum = 0;
        for (int i = 0; i < accounts.length; i++) {
            int k = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                k += accounts[i][j];
                if (sum < k) {
                    sum = k;
                }
            }
        }
        return sum;
    }
}

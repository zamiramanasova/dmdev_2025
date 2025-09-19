package fromBook.binarySearch;

import java.util.Arrays;

public class WithoutBinarySearch1672 {
    public static void main(String[] args) {
        int[][] accounts = new int[][] {{1,2,3},
                {3,2,1}
        };
        System.out.println(maximumWealth(accounts));

    }
    public static int maximumWealth(int[][] accounts) {
        int maxWealthSoFar = 0;

        for (int[] customer : accounts) {
            int currentCustomerWealth = 0;

            for (int bank : customer) {
                currentCustomerWealth += bank;
            }
            maxWealthSoFar = Math.max(maxWealthSoFar, currentCustomerWealth);
        }
        return maxWealthSoFar;
    }
    // Time complexity = O(n * m)
    // Space Complexity = O(1)
}

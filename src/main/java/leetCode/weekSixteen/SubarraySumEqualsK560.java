package leetCode.weekSixteen;

import java.util.HashMap;

public class SubarraySumEqualsK560 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,1};
        int k = 2;
        System.out.println(subarraySum(nums, k));
        System.out.println(subarraySum2(nums, k));
        System.out.println(subarraySum3(nums, k));
    }

    public static int subarraySum(int[] nums, int k) {
        /**
         * subarray(nums, L, R) = nums[L .. R]
         * subbarray(nums, L=2, R=2, R=4) = [nums[2], nums[3], nums[4]]
         *
         * sum(subarray(nums, L, R)) =
         *  sum(subarray(nums, 0, R)) - sum(subarray(nums, 0, L-1))
         *  (nums[0] + nums[1] + ... + nums[R] - (nums[0] + nums[1] + ... + nums[L-1])
         *  prefix_sum[R]                      - prefix_sum[L-1]
         *  = nums[L] + nums[L+1] + ... + nums[R]
         *
         * 1. sum of subarrays -> compute prefix sums, then answer for subarray (L,R)
         *                        is equal to (prefix_sum[R] - prefix_sum[L-1])
         *             i
         *   [a,,b,c,d,e,f,g,h]
         *   prefix_sum[i] = a*b*c*d*e = k+3
         *   prefix_sum[0] = a = 3
         *   prefix_sum[0] = a = 3
          */
        // решение за куб
        int n = nums.length;
        int ans = 0;
        // TC: O(n^3)
        for (int left = 0; left < n; left++) {
            for (int right = left; right < n; right++) {
                int sum = 0;
                for (int i = left; i <= right; i++) {
                    sum += nums[i];
                }
                if (sum == k) {
                    //we found new (left, right) subarray
                    ans++;
                }
            }
        }
        return ans;
    }

    public static int subarraySum2(int[] nums, int k) {
        //решение за квадрат
        int n = nums.length;
        int ans = 0;
        // TC: O(n^2)
        int[] pref = new int[n];
        for (int i = 0; i < n; i++) {
            if (0 < i) {
                pref[i] = pref[i - 1];
            }
            pref[i] += nums[i];
        }

        for (int left = 0; left < n; left++) {
            for (int right = left; right < n; right++) {
                int sum = pref[right];
                if (left > 0) {
                    sum -= pref[left - 1];
                }
                if (sum == k) {
                    ans++;
                }
             }
        }
        return ans;
    }

    public static int subarraySum3(int[] nums, int k) {
        //решение за 0(n)
        int n = nums.length;
        int ans = 0;

        int[] pref = new int[n];
        for (int i = 0; i < n; i++) {
            if (0 < i) {
                pref[i] = pref[i - 1];
            }
            pref[i] += nums[i];
        }

        HashMap<Integer, Integer> hs = new HashMap<>();
        hs.put(0,1);

        for (int right = 0; right < n; right++) {
            ans += hs.getOrDefault(pref[right] - k, 0);//O(1) is average

            hs.put(pref[right], hs.getOrDefault(pref[right], 0) + 1);
        }
        return ans;
    }

}

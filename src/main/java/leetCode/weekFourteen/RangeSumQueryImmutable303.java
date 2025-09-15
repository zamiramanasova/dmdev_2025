package leetCode.weekFourteen;

import java.util.Arrays;

public class RangeSumQueryImmutable303 {
    public static void main(String[] args) {
        int[] nums = new int[] {-2, 0, 3, -5, 2, -1};
        int left = 2;
        int right = 5;
         RangeSumQueryImmutable303 obj = new RangeSumQueryImmutable303(nums);
         int param_1 = obj.sumRange(left, right);
        System.out.println(obj.sumRange(2,5));
    }
    int[] prefix;

    @Override
    public String toString() {
        return "RangeSumQueryImmutable303{" +
                "prefix=" + Arrays.toString(prefix) +
                '}';
    }

    public RangeSumQueryImmutable303(int[] nums) {
        int n = nums.length;
        prefix = new int[n];

        prefix[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        if (left == 0) {
            return prefix[right];
        } return prefix[right] - prefix[left - 1];
    }


}

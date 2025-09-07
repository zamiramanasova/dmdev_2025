package leetCode.WeekSeventeen;

/**
 * Учитывая целочисленный массив nums и целое число k,
 * верните значение true, если в массиве есть два разных
 * индекса i и j,
 * таких что nums[i] == nums[j] и abs(i - j) <= k.
 */
public class ContainsDuplicate217 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,1};
        int k = 3;
        System.out.println(containsDuplicate(nums, k));
    }

    public static boolean containsDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (nums[i] == nums[j]) {
                    if (i - j <= k) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

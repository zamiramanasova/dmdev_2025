package leetCode.weekFifteen;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 1. Прочитать проблему
 * 2. Понять задачу полностью
 * 3. Come up with brute force (time complexity) + space complexity
 * 4. Optimize (time complexity) + space complexity
 */
public class IntersectionOfTwoArrays349 {
    public static void main(String[] args) {
        int[] nums1 = new int[] {1,2,2,1};
        int[] nums2 = new int[] {2,2};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    //method brute force
    public static int[] intersection(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (nums1[i] == nums2[j]) {
                    set.add(nums1[i]); //O(1) в среднем
                }
            }
        }
        int set_size = set.size();
        int[] answer = new int[set_size];

        int ind = 0;
        for (Integer x : set) {
            answer[ind] = x;
            ind++;
        }
        return answer;
    }
}

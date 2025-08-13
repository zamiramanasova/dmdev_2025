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
        System.out.println(Arrays.toString(intersection2(nums1, nums2)));
    }

    //method brute force
    public static int[] intersection(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (nums1[i] == nums2[j]) {
                    set.add(nums1[i]); //O(1) в среднем
                }
            }
        }
        // O(n * m)
        int set_size = set.size();
        int[] answer = new int[set_size];

        int ind = 0;
        for (Integer x : set) {
            answer[ind] = x;
            ind++;
        }
        return answer;
    }

    public static int[] intersection2(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        Set<Integer> set_1 = new HashSet<>();
        Set<Integer> ans = new HashSet<>();

        //весь цикл O(n)
        for (int i = 0; i < n; i++) {
            set_1.add(nums1[i]); //O(1) in average
        }

        //весь цикл O(m)
        for (int i = 0; i < m; i++) {
            if (set_1.contains(nums2[i])) { //O(1) in average
                ans.add(nums2[i]); //O(1) in average
            }
        }

        int[] answer = new int[ans.size()];

        int ind = 0;
        for (Integer x : ans) {
            answer[ind] = x;
            ind++;
        }
        return answer;
        //общее
        // tm comp = O(n + m)
        // space comp O(n + m)
    }
}

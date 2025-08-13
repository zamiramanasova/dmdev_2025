package leetCode.weekFifteen;

import java.util.*;

public class IntersectionOfTwoArrays350PartTwo {
    public static void main(String[] args) {
        int[] nums1 = new int[] {1,2,2,1};
        int[] nums2 = new int[] {2,2};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (nums1[i] == nums2[j]) {
                    ans.add(nums1[i]);
                    nums2[j] = -1;//это -1 добавлена в целях избежания проверки одних и тех же индексов
                    break;
                }
            }
        }
        int[] answer = new int[ans.size()];

        int ind = 0;
        for (Integer x : ans) {
            answer[ind] = x;
            ind++;
        }
        return answer;
    }
}

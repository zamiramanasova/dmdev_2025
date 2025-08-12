package leetCode.weekFourteen;

import java.util.Arrays;

public class MergeSortedArray88 {
    public static void main(String[] args) {
        int[] nums1 = new int[] {1,2,3,0,0,0};
        int[] nums2 = new int[] {2,5,6};
        int m = 3;
        int n = 3;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] answer = new int[n + m];
        int p1 = 0;
        int p2 = 0;
        while(p1 < m && p2 < n) {
            if (nums1[p1] < nums2[p2]) {
                answer[p1 + p2] = nums1[p1];
                p1++;
            } else {
                answer[p1 + p2] = nums2[p2];
                p2++;
            }
        }
        while (p2 < n) {
            answer[p1 + p2] = nums2[p2];
            p2++;
        }
        while (p1 < m) {
            answer[p1 + p2] = nums1[p1];
            p1++;
        }
        for (int i = 0; i < n + m; i++) {
            nums1[i] = answer[i];
        }
    }
}

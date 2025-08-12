package leetCode.weekFourteen;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges228 {
    public static void main(String[] args) {
        int[] array = new int[] {0,1,2,4,5,7};
        System.out.println(summaryRanges(array));

    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> answer = new ArrayList<>();
        if (nums.length == 0) return answer;
        int range_start = nums[0];
        int range_end = -1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                range_end = nums[i - 1];
                if (range_start == range_end) {
                    answer.add(Integer.toString(range_start));
                } else {
                    answer.add(Integer.toString(range_start) + "->" + Integer.toString(range_end));
                }
                range_start = nums[i];
            }
        }
        range_end = nums[nums.length - 1];
        if (range_start == range_end) {
            answer.add(Integer.toString(range_start));
        } else {
            answer.add(Integer.toString(range_start) + "->" + Integer.toString(range_end));
        }
        return answer;
     }
}

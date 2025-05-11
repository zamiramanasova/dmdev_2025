package study;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSumLeetCode {
    public static void main(String[] args) {
        int[] a = new int[] {1,2,3,4,5};
        System.out.println(Arrays.toString(twoSum(a, 5)));
    }
    public static int[] twoSum(int[] nums, int target) {
        int []resultarray=new int[2];
        for (int i=0;i<nums.length-1;i++){
            for(int k=i+1;k<nums.length;k++)
            {
                if(target==nums[i]+nums[k])
                {
                    resultarray[0]=i;
                    resultarray[1]=k;
                }
            }
        }
        return resultarray;
    }

}

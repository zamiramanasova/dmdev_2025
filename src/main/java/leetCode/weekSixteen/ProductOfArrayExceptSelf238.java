package leetCode.weekSixteen;

import java.util.Arrays;
//задачу нельзя решить умножением, такое условие
public class ProductOfArrayExceptSelf238 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));

    }
    public static int[] productExceptSelf(int[] nums) {

        // [a,b,c,d,e,f,g,h,i,j]
        //  префикс|i|suffix
        //prefix_mul[i-1] = a*b*c*d
        //suffix_mul[i+1] = f*g*h*i*j
        int n = nums.length;
        int[] prefix_mul = new int[n];

        prefix_mul[0] = nums[0];
        for(int i = 1; i < n; i++) {
            prefix_mul[i] = prefix_mul[i - 1] * nums[i];
        }

        int[] suffix_mul = new int[n];

        suffix_mul[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffix_mul[i] = suffix_mul[i + 1] * nums[i];
        }

        int[] answer = new int[n];
        answer[0] = suffix_mul[1];
        answer[n - 1] = prefix_mul[n - 2];
        for (int i = 1; i < n - 1; i++) {
            answer[i] = prefix_mul[i - 1] * suffix_mul[i + 1];
        }

        return answer;
        // TIME: O(N)
        // SPACE: O(N)

    }
}

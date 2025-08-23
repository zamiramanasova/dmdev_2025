package leetCode.weekSixteen;

public class ProductOfArrayExceptSelf238 {
    public static void main(String[] args) {

    }
    public int[] productExceptSelf(int[] nums) {

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

    }
}

package Array;

public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {

        int[] maxArray = new int[nums.length];
        maxArray[0] = Integer.MIN_VALUE; 

        int up = 0;
        while (up < nums.length){
            int sum = 0;
            for (int i=up; i < nums.length; i++) {
                sum = sum + nums[i];
                if (maxArray[up] < sum ){
                    maxArray[up] = sum;
                }
            }
            up++;
        }
        int max = Integer.MIN_VALUE;
        for (int i=0; i<nums.length; i++) {

            if (maxArray[i] > max) {
                max = maxArray[i];
            }
        }
        
        return max;
    }
    public static void main(String[] args) {
        int[]nums = new int[] {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(maxSubArray(nums));
    }
}


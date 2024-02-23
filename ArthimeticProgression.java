import java.util.Arrays;

public class ArthimeticProgression {
    public static boolean canMakeArthimetic(int[] nums){
        if (nums.length <= 2) return true;
        Arrays.sort(nums);
        int diff = nums[1] - nums[0];
        for (int i=2; i<nums.length; i++){
            int a = nums[i] - nums[i-1];
            if (a != diff) return false;
        }
        return true;

    }
    public static void main(String[] args) {
        int[] nums = {1,2,4};
        System.out.println(canMakeArthimetic(nums));
    }
}

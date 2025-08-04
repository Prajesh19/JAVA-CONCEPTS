import java.util.Arrays;
public class numsosnums {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        int res[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res[i] = nums[nums[i]];

        }
        System.out.println(Arrays.toString(res));
    }
}
